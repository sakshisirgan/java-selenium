package test.java;

import main.java.Operations;
import org.junit.jupiter.api.*;

import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.*;

public class OperationsTest {

    static Operations op;

    @BeforeAll
    static void setupDB() throws SQLException {
        op = new Operations();
        op.connect();
        System.out.println("Connected to database.");
    }

    @BeforeEach
    void beforeEachTest() throws SQLException {
        System.out.println("Starting test...");
     // for clean up 
        for (int i = 1; i <= 3; i++) {
            op.deleteData(i);
        }
    }

    @DisplayName("Insert Test")
    @Test
    void testInsert() throws SQLException {
        int rows = op.insertData(1, "Meera ");
        assertEquals(1, rows);
        assertNotEquals(0, rows);
        assertNotNull(rows);
    }

    @DisplayName("Update Test")
    @Test
    void testUpdate() throws SQLException {
        op.insertData(2, "Nisha");
        int rows = op.updateData(2, "Riya");
        assertEquals(1, rows);
        assertTrue(rows == 1);
    }

    @DisplayName("Delete Test")
    @Test
    void testDelete() throws SQLException {
        op.insertData(3, "Seema");
        int rows = op.deleteData(3);
        assertEquals(1, rows);
        assertFalse(rows == 0);
    }

    @Disabled("This is disabled")
    @Test
    void testDisabled() {
        System.out.println("Disabled Annotation is used - It disables a test method");
    }

    @AfterEach
    void afterEachTest() {
        System.out.println("Finished test.");
        
    }

    @AfterAll
    static void closeDB() throws SQLException {
        op.close();
        System.out.println("Disconnected from database.");
    }
}
