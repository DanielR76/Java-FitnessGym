package fitnesspowerdat;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ConexionDB {

    Connection con;
    Statement stm;

    void ConexionBase() throws SQLException, ClassNotFoundException {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/Gimnasio", "root", "");
            
        } catch (SQLException exception) {
            throw new SQLException("ERROR: ConsultaDAO obteniendo una conexion.");
        }
        
        }
    
    public void Desconectar(){
     try {
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, null, ex);
        }
     
     }
}
