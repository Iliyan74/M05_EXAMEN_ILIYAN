package my.company.mvchospital;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBD {
    private final String DRIVER = "com.mysql.cj.jdbc.Driver";
    private final String URL = "jdbc:mysql://localhost:3306/bd_hospital";
    private final String USER = "root";
    private final String PASSWD = "";

    public Connection establecerConexion() {
        Connection connexio = null;
        try {
            Class.forName(DRIVER);
            connexio = DriverManager.getConnection(URL, USER, PASSWD);  
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return connexio;
    }
}