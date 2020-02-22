package fitnesspowerdat;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;

public class MostrarFitness extends ConexionDB {

    DefaultTableModel Modelotabla;

    public MostrarFitness() throws SQLException, ClassNotFoundException {
        try {
            ConexionBase();
        } catch (SQLException ex) {
            Logger.getLogger(MostrarFitness.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void BuscarDieta(String valor, JTable tabla) {
        String[] columnas = {"Nombre", "Calorias", "Descripcion", "Contenido"};
        String[] registros = new String[4];
        Modelotabla = new DefaultTableModel(null, columnas);
        String mysqlb = null;
        Connection conect = null;

        mysqlb = "SELECT nombreDieta, cantidadCalorias, descripcion, contenido"
                + "FROM Dieta WHERE nombreDieta LIKE '" + valor + "';";
        try {
            PreparedStatement sta = conect.prepareStatement(mysqlb);
            ResultSet rs = sta.executeQuery();

            while (rs.next()) {
                registros[0] = rs.getString("Nombre");
                registros[1] = rs.getString("Calorias");
                registros[2] = rs.getString("Descripcion");
                registros[3] = rs.getString("Contenido");

                Modelotabla.addRow(registros);
            }
            tabla.setModel(Modelotabla);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e, "Error durante el procedimiento", JOptionPane.ERROR_MESSAGE);
        } finally {
            if (conect != null) {
                try {
                    conect.close();
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, ex, "Error de desconexion", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }

    public void BuscarEjercicio(String valor, JTable tabla) {
        String[] columnas = {"Nombre", "Grupo muscular", "Imagen"};
        String[] registros = new String[4];
        Modelotabla = new DefaultTableModel(null, columnas);
        String mysqlb = null;
        Connection conect = null;

        mysqlb = "SELECT nombre, grupoMuscular, descripcion, foto"
                + "FROM Ejercicio WHERE nombre LIKE '" + valor + "';";

        try {
            PreparedStatement sta = conect.prepareStatement(mysqlb);
            ResultSet rs = sta.executeQuery();

            while (rs.next()) {
                registros[0] = rs.getString("Nombre");
                registros[1] = rs.getString("Grupo muscular");
                registros[2] = rs.getString("Descripcion");
                ByteArrayOutputStream output = new ByteArrayOutputStream();
                InputStream var = rs.getBinaryStream("Imagen");

                Modelotabla.addRow(registros);
            }
            tabla.setModel(Modelotabla);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e, "Error durante el procedimiento", JOptionPane.ERROR_MESSAGE);
        } finally {
            if (conect != null) {
                try {
                    conect.close();
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, ex, "Error de desconexion", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }

    public void BuscarEmergencia(String valor, JTable tabla) {
        String[] columnas = {"Nombre", "Apellido", "Edad", "EPS", "Nombre Parentesco", "Telefono Parentesco"};
        String[] registros = new String[6];
        Modelotabla = new DefaultTableModel(null, columnas);
        String mysqlb = null;
        Connection conect = null;

        mysqlb = "SELECT nombres, apellidos, edad, EPS, nombreFamiliar, telefonoFamiliar"
                + "FROM Cliente WHERE idCliente LIKE '" + valor + "';";
        try {
            PreparedStatement sta = conect.prepareStatement(mysqlb);
            ResultSet rs = sta.executeQuery();

            while (rs.next()) {
                registros[0] = rs.getString("Nombres");
                registros[1] = rs.getString("Apellidos");
                registros[2] = rs.getString("Edad");
                registros[3] = rs.getString("EPS");
                registros[4] = rs.getString("Nombre Parentesco");
                registros[5] = rs.getString("Telefono Parentesco");

                Modelotabla.addRow(registros);
            }
            tabla.setModel(Modelotabla);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e, "Error durante el procedimiento", JOptionPane.ERROR_MESSAGE);
        } finally {
            if (conect != null) {
                try {
                    conect.close();
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, ex, "Error de desconexion", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }

    public void BuscarCliente(String valor, JTable tabla) {
        String[] columnas = {"ID", "Nombre", "Objetivo"};
        String[] registros = new String[3];
        Modelotabla = new DefaultTableModel(null, columnas);
        String mysqlb = null;
        Connection conect = null;

        mysqlb = "SELECT nombres, idCliente, Objetivo"
                + "FROM Cliente WHERE idCliente LIKE '" + valor + "';";
        try {
            PreparedStatement sta = conect.prepareStatement(mysqlb);
            ResultSet rs = sta.executeQuery();

            while (rs.next()) {
                registros[0] = rs.getString("ID");
                registros[1] = rs.getString("Nombre");
                registros[2] = rs.getString("Objetivo");

                Modelotabla.addRow(registros);
            }
            tabla.setModel(Modelotabla);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e, "Error durante el procedimiento", JOptionPane.ERROR_MESSAGE);
        } finally {
            if (conect != null) {
                try {
                    conect.close();
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, ex, "Error de desconexion", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }

    public void BuscarComents(String valor, JTable tabla) {
        String[] columnas = {"Nombre", "Estado", "Asunto", "Comentarios"};
        String[] registros = new String[4];
        Modelotabla = new DefaultTableModel(null, columnas);
        String mysqlb = null;
        Connection conect = null;

        mysqlb = "SELECT '" + valor
                + "'FROM  Sugerencias;";

        try {
            PreparedStatement sta = conect.prepareStatement(mysqlb);
            ResultSet rs = sta.executeQuery();

            while (rs.next()) {
                registros[0] = rs.getString("Nombre");
                registros[1] = rs.getString("Estado");
                registros[2] = rs.getString("Asunto");
                registros[3] = rs.getString("Comentarios");

                Modelotabla.addRow(registros);
            }
            tabla.setModel(Modelotabla);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e, "Error durante el procedimiento", JOptionPane.ERROR_MESSAGE);
        } finally {
            if (conect != null) {
                try {
                    conect.close();
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, ex, "Error de desconexion", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }

    /*public void totales() {
     Connection conect = null;     
     try {
     String Ssqlsentencia="select ingreso, egreso, descripcion from Contabilidad";
     PreparedStatement sta = conect.prepareStatement(Ssqlsentencia);
     ResultSet rs = sta.executeQuery();
     rs.next();
     egreso.setText(rs.getInt(1));
     ingreso.setText(rs.getInt(2));
     descripcion.setText(rs.getString(3));
     } catch(SQLException ex)  {     
     JOptionPane.showMessageDialog(null, ex, "Error durante el procedimiento", JOptionPane.ERROR_MESSAGE);
     }finally {
     if (conect!= null) {
     try {
     conect.close();
     } catch (SQLException ex) {
     JOptionPane.showMessageDialog(null, ex, "Error de desconexion", JOptionPane.ERROR_MESSAGE);
     }
     }
     }
     }*/
}
