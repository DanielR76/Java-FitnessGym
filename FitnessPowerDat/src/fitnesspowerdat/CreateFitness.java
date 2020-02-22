package fitnesspowerdat;

import fitnesspower.ent.Cliente;
import fitnesspower.ent.Contabilidad;
import fitnesspower.ent.Dieta;
import fitnesspower.ent.Ejercicio;
import fitnesspower.ent.Instructor;
import fitnesspower.ent.Medida;
import fitnesspower.ent.Novedad;
import fitnesspower.ent.Sugerencias;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class CreateFitness extends ConexionDB {

    public CreateFitness() throws SQLException, ClassNotFoundException {
        super.ConexionBase();
    }

    public boolean NuevoCliente(Cliente cliente) throws SQLException {
        try {
            String smsql = "INSERT INTO Cliente ( idCliente, password, nombre, apellido, telefono, direccion, edad, sexo, EPS, correo, peso, estatura, fecha, nombreFamiliar, telefonoFamiliar, parentesco)"
                    + "values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

            if (!con.isClosed()) {
                PreparedStatement ps = con.prepareStatement(smsql);

                ps.setString(1, cliente.getIdCliente());
                ps.setString(2, cliente.getPassword());
                ps.setString(3, cliente.getNombre());
                ps.setString(4, cliente.getApellido());
                ps.setInt(5, cliente.getTelefono());
                ps.setString(6, cliente.getDireccion());
                ps.setInt(7, cliente.getEdad());
                ps.setString(8, cliente.getSexo());
                ps.setString(9, cliente.getEPS());
                ps.setString(10, cliente.getCorreo());
                ps.setInt(11, cliente.getPeso());
                ps.setInt(12, cliente.getEstatura());
                ps.setString(13, cliente.getFecha());
                ps.setString(14, cliente.getNombreFamiliar());
                ps.setInt(15, cliente.getTelefonoFamiliar());
                ps.setString(16, cliente.getParentesco());

                return ps.executeUpdate() > 0;

            } else {
                return false;
            }
        } catch (SQLException ex) {
            Logger.getLogger(CreateFitness.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public boolean NuevoEjercicio(Ejercicio ejercicio) throws SQLException {
        try {
            String smsql = "INSERT INTO Ejercicio ( nombre, grupoMuscular, descripcion)"
                    + "values (?, ?, ?)";

            if (!con.isClosed()) {
                PreparedStatement ps = con.prepareStatement(smsql);
                ps.setString(1, ejercicio.getNombre());
                ps.setString(2, ejercicio.getGrupoMuscular());
                ps.setString(3, ejercicio.getDescripcion());

                return ps.executeUpdate() > 0;
            } else {
                return false;
            }
        } catch (SQLException ex) {
            Logger.getLogger(CreateFitness.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public boolean NuevaMedida(Medida medida) throws SQLException {
        JOptionPane.showMessageDialog(null, "Ha guardado las medidas correctamente ");
        try {
            String smsql = "INSERT INTO Medida (estatura, hombros,  pecho, cintura, cuello, biceps, antebrazo, cadera, gemelos, musloSuperior, imc, fecha, observaciones)"
                    + "values (?, ?, ?, ?, ?, ?, ?,?, ?, ?, ?, ?, ?)";

            if (!con.isClosed()) {
                PreparedStatement ps = con.prepareStatement(smsql);
                ps.setString(1, medida.getEstatura());
                ps.setString(2, medida.getHombros());
                ps.setString(3, medida.getPecho());
                ps.setString(4, medida.getCintura());
                ps.setString(5, medida.getCuello());
                ps.setString(6, medida.getBiceps());
                ps.setString(7, medida.getAntebrazo());
                ps.setString(8, medida.getCadera());
                ps.setString(9, medida.getGemelos());
                ps.setString(10, medida.getMusloSuperior());
                ps.setString(11, medida.getImc());
                ps.setString(12, medida.getFecha());
                ps.setString(13, medida.getObservaciones());

                return ps.executeUpdate() > 0;
            } else {
                return false;
            }
        } catch (SQLException ex) {
            Logger.getLogger(CreateFitness.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public boolean NuevaDieta(Dieta dieta) throws SQLException {
        try {
            String smsql = "INSERT INTO Dieta ( nombreDieta, cantidadCalorias, descripcion, contenido )"
                    + "values (?, ?, ?, ?)";

            if (!con.isClosed()) {
                PreparedStatement ps = con.prepareStatement(smsql);

                ps.setString(1, dieta.getNombreDieta());
                ps.setInt(2, dieta.getCalorias());
                ps.setString(3, dieta.getDescripcion());
                ps.setString(4, dieta.getContenido());

                return ps.executeUpdate() > 0;
            } else {
                return false;
            }
        } catch (SQLException ex) {
            Logger.getLogger(CreateFitness.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public boolean NovedadNueva(Novedad novedad) throws SQLException {
        try {
            String smsql = "INSERT INTO Novedades ( nombreEvento, ubicacionEvento, fecha, descripcion )"
                    + "values (?, ?, ?, ?)";

            if (!con.isClosed()) {
                PreparedStatement ps = con.prepareStatement(smsql);
                ps.setString(1, novedad.getNombreEvento());
                ps.setString(2, novedad.getUbicacionEvento());
                ps.setString(3, novedad.getFecha());
                ps.setString(4, novedad.getDescripcion());

                return ps.executeUpdate() > 0;
            } else {
                return false;
            }
        } catch (SQLException ex) {
            Logger.getLogger(CreateFitness.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public boolean NuevoAdmin(Instructor instructor) throws SQLException {
        try {
            String smsql = "INSERT INTO Instructor (idInstructor, nombre, apellido,  correo, direccion, telefono, sexo, password)"
                    + "values (?, ?, ?, ?, ?, ?, ?, ?)";

            if (!con.isClosed()) {
                PreparedStatement ps = con.prepareStatement(smsql);
                ps.setString(1, instructor.getIdInstructor());
                ps.setString(2, instructor.getNombre());
                ps.setString(3, instructor.getApellido());
                ps.setString(4, instructor.getCorreo());
                ps.setString(5, instructor.getDireccion());
                ps.setInt(6, instructor.getTelefono());
                ps.setString(7, instructor.getSexo());
                ps.setString(8, instructor.getPassword());
                // ps.setString(9, instructor.getFoto());

                return ps.executeUpdate() > 0;
            } else {
                return false;
            }
        } catch (SQLException ex) {
            Logger.getLogger(CreateFitness.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public boolean NuevaContabilidad(Contabilidad contabilidad) throws SQLException, IOException {
        // FileInputStream foto = null;
        try {
            String smsql = "INSERT INTO Contabilidad (ingreso, egreso, totalFinal, descripcion)"
                    + "values (?,?,?,?)";

            if (!con.isClosed()) {
                PreparedStatement ps = con.prepareStatement(smsql);
                ps.setInt(1, contabilidad.getIngreso());
                ps.setInt(2,contabilidad.getEgreso());
                ps.setInt(3, contabilidad.getTotalFinal());
                ps.setString(4, contabilidad.getDescripcion());

                return ps.executeUpdate() > 0;
            } else {
                return false;
            }
        } catch (SQLException ex) {

            Logger.getLogger(CreateFitness.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public boolean NuevaSugerencia(Sugerencias sugerencias) throws SQLException, IOException {

        try {
            String smsql = "INSERT INTO Sugerencias ( nombre, asunto, comentario )"
                    + "values (?, ?, ?)";

            if (!con.isClosed()) {
                PreparedStatement ps = con.prepareStatement(smsql);
                ps.setString(1, sugerencias.getNombre());
                ps.setString(2, sugerencias.getAsunto());
                ps.setString(3, sugerencias.getComentario());

                return ps.executeUpdate() > 0;
            } else {
                return false;
            }
        } catch (SQLException ex) {

            Logger.getLogger(CreateFitness.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }

    }
}
