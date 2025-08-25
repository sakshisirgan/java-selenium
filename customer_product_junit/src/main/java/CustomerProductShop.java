package main.java;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CustomerProductShop {
    DBConnection db = new DBConnection();

    public int insertCustomer(Customer c) {
        String sql = "INSERT INTO Customer (cust_name, cust_contact, cust_gender, cust_addr, city, zipcode) VALUES (?, ?, ?, ?, ?, ?)";
        try (Connection conn = db.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
            ps.setString(1, c.getCust_name());
            ps.setString(2, c.getCust_contact());
            ps.setString(3, c.getCust_gender());
            ps.setString(4, c.getCust_addr());
            ps.setString(5, c.getCity());
            ps.setString(6, c.getZipcode());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) return rs.getInt(1);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return -1;
    }

    public int insertProduct(int custId, Product p) {
        String sql = "INSERT INTO Product (cust_id, product_code, product_desc, product_price, product_qty, product_expdate) VALUES (?, ?, ?, ?, ?, ?)";
        try (Connection conn = db.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
            ps.setInt(1, custId);
            ps.setString(2, p.getProduct_code());
            ps.setString(3, p.getProduct_desc());
            ps.setDouble(4, p.getProduct_price());
            ps.setInt(5, p.getProduct_qty());
            ps.setDate(6, p.getProduct_expdate());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) return rs.getInt(1);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return -1;
    }

    public boolean buyProduct(int productId, int qty) {
        String sql = "UPDATE Product SET product_qty = product_qty - ? WHERE product_id = ? AND product_qty >= ?";
        try (Connection conn = db.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, qty);
            ps.setInt(2, productId);
            ps.setInt(3, qty);
            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public List<String> displayCustomerProducts(int custId) {
        List<String> results = new ArrayList<>();
        String customerName = "";

        // Step 1: Get customer name
        String sqlCust = "SELECT cust_name FROM Customer WHERE cust_id = ?";
        try (Connection conn = db.getConnection();
             PreparedStatement ps = conn.prepareStatement(sqlCust)) {
            ps.setInt(1, custId);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                customerName = rs.getString("cust_name");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Step 2: Get all products for that customer
        String sqlProd = "SELECT product_code, product_desc, product_price, product_qty FROM Product WHERE cust_id = ?";
        double totalPrice = 0;
        try (Connection conn = db.getConnection();
             PreparedStatement ps = conn.prepareStatement(sqlProd)) {
            ps.setInt(1, custId);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                String line = customerName + " - " +
                        rs.getString("product_code") + " - " +
                        rs.getString("product_desc") + " - " +
                        rs.getDouble("product_price") + " x " +
                        rs.getInt("product_qty");
                results.add(line);
                totalPrice += rs.getDouble("product_price") * rs.getInt("product_qty");
            }
            results.add("Total Price: " + totalPrice);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return results;
    }
}
