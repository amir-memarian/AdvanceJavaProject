package shop;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import static java.sql.DriverManager.getConnection;
import static org.junit.jupiter.api.Assertions.fail;

public class ShoppingListDAOImplTest {
    @Test
    void Should_connect_to_mysql_database() {
        try(final Connection conn = getConnection("jdbc:mysql://localhost:3306/shop","amir_memarian","447@MIr1360")){
            if (conn == null){
                fail("connection to database is impossible");
            }
        } catch (SQLException e) {
            fail("connection to database is impossible");
            throw new RuntimeException(e);
        }
    }
}
