package amazon.scrape.dao;

import java.sql.*;

public class MysqlDB {

    static Connection connection = null;

    public static Connection getConnection() {

        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/amazon_in", "root", "root");
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return connection;
    }

    public ResultSet check(String query) {
        getConnection();
        ResultSet rs = null;
        Statement statement = null;
        try {
            statement = connection.createStatement();
            rs = statement.executeQuery(query);

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rs;
    }
}
