package fitnesspower.dao;

import co.com.fitnesspower.dal.Conexion;
import fitnesspower.ent.Producto;
import co.com.fitnesspower.dal.InterfazDao;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductoDao implements InterfazDao<Producto> {

    private static Conexion con;

    public ProductoDao() throws ClassNotFoundException, SQLException {
        con = Conexion.estado();
    }

    @Override
    public boolean create(Producto x) throws SQLException, FileNotFoundException {
        String sqlCreate;
        PreparedStatement ps;
        if (x.getImagen() == null) {
            sqlCreate = "INSERT INTO producto (concepto,valor) VALUES (?,?)";

            ps = con.getCnn().prepareStatement(sqlCreate);

            ps.setString(1, x.getConcepto());
            ps.setFloat(2, x.getValor());
        } else {
            sqlCreate = "INSERT INTO producto (concepto,valor,imagen) VALUES (?,?,?)";

            ps = con.getCnn().prepareStatement(sqlCreate);

            ps.setString(1, x.getConcepto());
            ps.setFloat(2, x.getValor());
            FileInputStream img = new FileInputStream(x.getImagen());
            ps.setBinaryStream(3, img, x.getImagen().length());
        }
        return ps.executeUpdate() == 1;
    }

    public Producto readId(Object key) throws SQLException, FileNotFoundException, IOException {
        String sqlRead = " SELECT * FROM producto WHERE idProducto = ?";

        PreparedStatement ps;
        ResultSet res;
        Producto p = new Producto();

        ps = con.getCnn().prepareStatement(sqlRead);
        ps.setInt(1, Integer.parseInt(key.toString()));

        res = ps.executeQuery();

        res.next();
        p.setIdProducto(res.getInt("idProducto"));
        p.setConcepto(res.getString("concepto"));
        p.setValor(res.getFloat("valor"));

        File img;
        InputStream is = res.getBinaryStream("imagen");

        if (is != null) {
            img = new File("imagen");
            try (OutputStream os = new FileOutputStream(img)) {
                int bytesRead = -1;
                byte[] buffer = new byte[4096];
                
                while ((bytesRead = is.read(buffer)) != -1) {
                    os.write(buffer, 0, bytesRead);
                }
                os.flush();
            }
        } else {
            img = new File("src\\imagen\\defaultImage.PNG");
        }
        p.setImagen(img);
        return p;
    }

    public Producto readImage(Object key) throws SQLException, FileNotFoundException, IOException {
        String sqlReadImage = "SELECT imagen FROM Producto WHERE idProducto = ?";

        PreparedStatement ps;
        ResultSet res;
        Producto p = new Producto();

        ps = con.getCnn().prepareStatement(sqlReadImage);
        ps.setInt(1, Integer.parseInt(key.toString()));

        res = ps.executeQuery();
        res.next();

        File img;
        InputStream is = res.getBinaryStream("imagen");

        if (is != null) {
            img = new File("imagen");
            try (OutputStream os = new FileOutputStream(img)) {
                int bytesRead = -1;
                byte[] buffer = new byte[4096];
                
                while ((bytesRead = is.read(buffer)) != -1) {
                    os.write(buffer, 0, bytesRead);
                }
                os.flush();
            }
        } else {
            img = new File("src\\imagen\\defaultImage.PNG");
        }
        p.setImagen(img);
        return p;
    }

    @Override
    public boolean update(Producto x) throws SQLException, FileNotFoundException {
        String sqlUpdate;
        PreparedStatement ps;

        if (x.getImagen() == null) {
            sqlUpdate = "UPDATE producto SET concepto = ?, valor = ? WHERE idProducto = ? ";

            ps = con.getCnn().prepareStatement(sqlUpdate);

            ps.setString(1, x.getConcepto());
            ps.setFloat(2, x.getValor());
            ps.setInt(3, x.getIdProducto());
        } else {
            sqlUpdate = "UPDATE producto SET concepto = ?, valor = ?, imagen = ? WHERE idProducto = ? ";

            ps = con.getCnn().prepareStatement(sqlUpdate);

            ps.setString(1, x.getConcepto());
            ps.setFloat(2, x.getValor());
            FileInputStream img = new FileInputStream(x.getImagen());
            ps.setBinaryStream(3, img, x.getImagen().length());
            ps.setInt(4, x.getIdProducto());
        }
        return ps.executeUpdate() == 1;
    }

    @Override
    public boolean delete(Object key) throws SQLException {
        String sqlDelete = "DELETE FROM producto WHERE idProducto = ?";
        PreparedStatement ps;

        ps = con.getCnn().prepareStatement(sqlDelete);
        ps.setInt(1, Integer.parseInt(key.toString()));
        return ps.executeUpdate() == 1;
    }

    @Override
    public List<Producto> readAll() throws SQLException {
        String sqlReadAll = "SELECT * FROM producto ORDER BY idProducto";
        PreparedStatement ps;
        ResultSet res;
        List<Producto> listaProducto = new ArrayList<Producto>();

        ps = con.getCnn().prepareStatement(sqlReadAll);
        res = ps.executeQuery();

        Producto p = null;

        while (res.next()) {
            p = new Producto();
            p.setIdProducto(res.getInt("idProducto"));
            p.setConcepto(res.getString("concepto"));
            p.setValor(res.getFloat("valor"));

            listaProducto.add(p);
        }
        return listaProducto;
    }
}
