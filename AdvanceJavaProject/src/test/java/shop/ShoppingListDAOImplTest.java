package shop;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

import static java.sql.DriverManager.getConnection;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.fail;

//Integration Test
public class ShoppingListDAOImplTest {
    public static final String ERROR = "connection to database is impossible";
    public static final String INSERT_SQL = "INSERT INTO item (name,quantity) VALUES(?, ?)";
    public static final String SELECT_SQL = "SELECT * FROM item ORDER BY id DESC LIMIT 1";
    public static final String DELETE_SQL = "DELETE FROM item ORDER BY id DESC LIMIT 1";

    private String host;
    private String user;
    private String pass;

    @BeforeEach
    void setUp() {
        try(InputStream configFile = new FileInputStream("db-config.properties")){
            Properties properties = new Properties();
            properties.load(configFile);
            host = properties.getProperty("host").toString();
            user = properties.getProperty("username").toString();
            pass = properties.getProperty("password").toString();
        } catch (IOException e) {
            e.printStackTrace();
            fail(ERROR);
        }
    }

    @Test
    void Should_connect_to_mysql_database() {
        try(final Connection conn = getConnection(host, user, pass)){
            if (conn == null){
                fail(ERROR);
            }
        } catch (SQLException e) {
            fail(ERROR);
            throw new RuntimeException(e);
        }
    }

    @Test
    void Should_insert_read_and_delete_an_item_in_database() {
        try(final Connection conn = getConnection(host, user, pass);
            final PreparedStatement insert = conn.prepareStatement(INSERT_SQL);
            final PreparedStatement select = conn.prepareStatement(SELECT_SQL);
            final PreparedStatement delete = conn.prepareStatement(DELETE_SQL)){

            insert.setString(1,"Orange");
            insert.setInt(2,10);
            insert.executeUpdate();

            final ResultSet resultSet = select.executeQuery();
            while (resultSet.next()){
                final String name = resultSet.getString("name");
                final int quantity = resultSet.getInt("quantity");

                assertThat(name).isEqualTo("Orange");
                assertThat(quantity).isEqualTo(10);
            }

            delete.executeUpdate();

        } catch (SQLException e) {
            fail(ERROR);
            throw new RuntimeException(e);
        }

    }
}
