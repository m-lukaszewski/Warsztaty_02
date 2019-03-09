package pl.coderslab.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbUtil {
    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection("jdbc:mysql://localhost:3306/Warsztaty02?useSSL=false&characterEncoding=utf8",
                "clroot", "coderslab");
    }
}