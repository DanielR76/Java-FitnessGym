package co.com.fitnesspower.dal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

    public static Conexion instance;//Singleton
    private final Connection cnn;

    private final String URL = "jdbc:mysql://localhost:3306/";
    private final String DATABASE = "Gimnasio";
    private final String USER = "root";
    private final String PASSWORD = "";

    private Conexion() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        cnn = DriverManager.getConnection(URL + DATABASE, USER, PASSWORD);
    }

    public synchronized static Conexion estado() throws ClassNotFoundException, SQLException {
        if (instance == null) {
            instance = new Conexion();
        }
        return instance;
    }

    public Connection getCnn() {
        return cnn;
    }

    public void desconectar() {
        instance = null;
    }
}
