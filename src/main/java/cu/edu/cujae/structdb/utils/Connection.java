package cu.edu.cujae.structdb.utils;

import java.sql.DriverManager;
import java.sql.SQLException;

public class Connection {
    private static java.sql.Connection connection;

    public Connection(String server, String database, String user, String password) throws ClassNotFoundException, SQLException {
        Class.forName("org.postgresql.Driver");
        String url = "jdbc:postgresql://" + server + ":5432/" + database;
        connection = DriverManager.getConnection(url, user, password);
    }

    public java.sql.Connection getConnection() {
        return connection;
    }
}
