package org.example.Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDatabase {
    public static Connection createConnection() throws SQLException {
        return DriverManager.getConnection(
                Crudentials.DATABASE_URL,
                Crudentials.DATABASE_USER,
                Crudentials.DATABASE_PASSWORD
        );
    }
}
