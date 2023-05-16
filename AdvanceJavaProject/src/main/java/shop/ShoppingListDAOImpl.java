package shop;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;
import java.util.Properties;

import static java.sql.DriverManager.getConnection;

public class ShoppingListDAOImpl implements ShoppingListDAO{
    public static final String INSERT_SQL = "INSERT INTO item (name,quantity) VALUES(?, ?)";
    public static final String SELECT_SQL = "SELECT * FROM item";
    private final String host;
    private final String user;
    private final String pass;

    public ShoppingListDAOImpl() {
        try(InputStream configFile = Files.newInputStream(Paths.get("db-config.properties"))){
            Properties properties = new Properties();
            properties.load(configFile);
            this.host = properties.getProperty("host");
            this.user = properties.getProperty("username");
            this.pass = properties.getProperty("password");
        } catch (IOException e) {
            throw new MainIOException(e);
        }
    }

    @Override
    public List<Item> findAllItems() {
        List<Item> items = new LinkedList<>();
        try(final Connection conn = getConnection(host, user, pass);
            final PreparedStatement select = conn.prepareStatement(SELECT_SQL)){

            final ResultSet resultSet = select.executeQuery();
            while (resultSet.next()){
                final String name = resultSet.getString("name");
                final int quantity = resultSet.getInt("quantity");
                items.add(new Item(name,quantity));
            }

        } catch (SQLException e) {
            throw new MainSQLException(e);
        }
        return items;
    }

    @Override
    public void saveItems(List<Item> items) {
        try(final Connection conn = getConnection(host, user, pass);
            final PreparedStatement insert = conn.prepareStatement(INSERT_SQL)){

            insert.setString(1,"Orange");
            insert.setInt(2,10);
            insert.executeUpdate();

        } catch (SQLException e) {
            throw new MainSQLException(e);
        }
    }
}
