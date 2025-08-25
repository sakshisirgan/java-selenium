package main.java;

public class Customer {
	private int cust_id;
	private String cust_name;
	private String cust_contact;
	private String cust_gender;
	private String cust_addr;
	private String city;
	private String zipcode;
	
	public Customer(int cust_id, String cust_name, String cust_contact, String cust_gender, String cust_addr,String city, String zipcode) {
		super();
		this.cust_id = cust_id;
		this.cust_name = cust_name;
		this.cust_contact = cust_contact;
		this.cust_gender = cust_gender;
		this.cust_addr = cust_addr;
		this.city = city;
		this.zipcode = zipcode;
	}

	public int getCust_id() {
		return cust_id;
	}

	public String getCust_name() {
		return cust_name;
	}

	public String getCust_contact() {
		return cust_contact;
	}

	public String getCust_gender() {
		return cust_gender;
	}

	public String getCust_addr() {
		return cust_addr;
	}

	public String getCity() {
		return city;
	}

	public String getZipcode() {
		return zipcode;
	}	
}
