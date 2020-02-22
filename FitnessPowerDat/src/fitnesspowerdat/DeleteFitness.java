package fitnesspowerdat;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class DeleteFitness extends ConexionDB {

    public DeleteFitness() throws SQLException, ClassNotFoundException {
        try {
            ConexionBase();
        } catch (SQLException ex) {
            Logger.getLogger(DeleteFitness.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void BorrarDieta(String nombreDieta) {
        try {
            String dsql = "DELETE FROM Dieta WHERE nombreDieta=?";
            PreparedStatement pasta = con.prepareStatement(dsql);

            pasta.setString(1, nombreDieta);
            pasta.execute();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e + " Los datos no se han podido eliminar", "", JOptionPane.ERROR_MESSAGE);
        } finally {
            if (con != null) {
                try {
                    con.close();
                } catch (SQLException ef) {
                    JOptionPane.showMessageDialog(null, ef + "Error al intentar descnectar bd", "", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }

    public void BorrarEjercicio(String nombre) {
        try {
            String dsql = "DELETE FROM Ejercicio WHERE nombre=?";
            PreparedStatement pasta = con.prepareStatement(dsql);

            pasta.setString(1, nombre);
            pasta.execute();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e + " Los datos no se han podido eliminar", "", JOptionPane.ERROR_MESSAGE);
        } finally {
            if (con != null) {
                try {
                    con.close();
                } catch (SQLException ef) {
                    JOptionPane.showMessageDialog(null, ef + "Error al intentar descnectar bd", "", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }

    public void BorrarComent(String nombre) {
        try {
            String dsql = "DELETE FROM Sugerencias WHERE nombre=?";
            PreparedStatement pasta = con.prepareStatement(dsql);

            pasta.setString(1, nombre);
            pasta.execute();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e + " Los datos no se han podido eliminar", "", JOptionPane.ERROR_MESSAGE);
        } finally {
            if (con != null) {
                try {
                    con.close();
                } catch (SQLException ef) {
                    JOptionPane.showMessageDialog(null, ef + "Error al intentar descnectar bd", "", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }
}
