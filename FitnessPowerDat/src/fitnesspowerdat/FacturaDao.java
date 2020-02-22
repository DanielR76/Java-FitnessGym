package fitnesspowerdat;

import co.com.fitnesspower.dal.Conexion;
import fitnesspower.ent.Factura;
import fitnesspower.ent.Producto;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class FacturaDao {

    Producto producto;
    private static Conexion con;

    public FacturaDao() throws ClassNotFoundException, SQLException {
        con = Conexion.estado();
    }

    public boolean create(Factura x) throws SQLException {
        String sqlCreate = "INSERT INTO factura (idCliente,fecha,valorNeto,valorDescuento,valorTotal) VALUES (?,?,?,?,?)";
        PreparedStatement ps;

        ps = con.getCnn().prepareStatement(sqlCreate);

        ps.setInt(1, x.getIdCliente());
        ps.setTimestamp(2, x.getFecha());
        ps.setFloat(3, x.getValorNeto());
        ps.setFloat(4, x.getValorDescuento());
        ps.setFloat(5, x.getValorTotal());

        return ps.executeUpdate() == 1;
    }

    public Factura readId(Integer id) throws SQLException {
        String sqlRead = " SELECT * FROM factura WHERE idFactura = ?";

        PreparedStatement ps;
        ResultSet res;
        Factura f = new Factura();

        ps = con.getCnn().prepareStatement(sqlRead);
        ps.setInt(1, id);

        res = ps.executeQuery();

        res.next();

        f.setIdFactura(res.getInt("idFactura"));
        f.setIdCliente(res.getInt("idCliente"));
        f.setFecha(res.getTimestamp("fecha"));
        f.setValorNeto(res.getFloat("valorNeto"));
        f.setValorDescuento(res.getFloat("valorDescuento"));
        f.setValorTotal(res.getFloat("valorTotal"));

        return f;
    }

    public boolean update(Factura x) throws SQLException {
        String sqlUpdate = "UPDATE factura SET idCliente = ?,  fecha = ?, valorNeto = ?, valorDescuento = ?, valorTotal = ? WHERE idFactura = ? ";
        PreparedStatement ps;

        ps = con.getCnn().prepareStatement(sqlUpdate);

        ps.setInt(1, x.getIdCliente());
        ps.setTimestamp(2, x.getFecha());
        ps.setFloat(3, x.getValorNeto());
        ps.setFloat(4, x.getValorDescuento());
        ps.setFloat(5, x.getValorTotal());
        ps.setInt(6, x.getIdFactura());

        return ps.executeUpdate() == 1;
    }

    public boolean delete(Integer id) throws SQLException {
        String sqlDelete = "DELETE FROM factura WHERE idFactura = ?";
        PreparedStatement ps;

        ps = con.getCnn().prepareStatement(sqlDelete);
        ps.setInt(1, id);
        return ps.executeUpdate() == 1;
    }

    public List<Factura> readAll() throws SQLException {
        String sqlReadAll = "SELECT * FROM factura ORDER BY idFactura";
        PreparedStatement ps;
        ResultSet res;
        List<Factura> listaFactura = new ArrayList<Factura>();

        ps = con.getCnn().prepareStatement(sqlReadAll);
        res = ps.executeQuery();

        Factura f = null;

        while (res.next()) {
            f = new Factura();
            f.setIdFactura(res.getInt("idFactura"));
            f.setIdCliente(res.getInt("idCliente"));
            f.setFecha(res.getTimestamp("fecha"));
            f.setValorNeto(res.getFloat("valorNeto"));
            f.setValorDescuento(res.getFloat("valorDescuento"));
            f.setValorTotal(res.getFloat("valorTotal"));

            listaFactura.add(f);
        }
        return listaFactura;
    }

    public Integer countRecords() throws SQLException {
        String sqlCountRecords = "SELECT COUNT(*) FROM Factura";

        ResultSet res;
        PreparedStatement ps;

        ps = con.getCnn().prepareStatement(sqlCountRecords);
        res = ps.executeQuery();
        res.next();

        int cantidad = res.getInt(1);
        return cantidad;
    }

    public boolean AgragarProductoFactura(Integer idFactura, Producto p) throws SQLException {
        String sqlAgregarProductoFactura = "INSERT INTO productoPorFactura (idFactura, idProducto, cantidad) VALUES (?,?,?)";
        PreparedStatement ps;

        ps = con.getCnn().prepareStatement(sqlAgregarProductoFactura);

        ps.setInt(1, idFactura);
        ps.setInt(2, p.getIdProducto());
        ps.setInt(3, p.getCantidad());

        return ps.executeUpdate() == 1;
    }

    public List<Producto> readProductoPorFactura(Integer id) throws SQLException {
        String readProductoPorFactura = "SELECT idProducto, cantidad FROM ProductoPorFactura WHERE idFactura = ?";

        PreparedStatement ps;
        ResultSet res;
        List<Producto> listaProducto = new ArrayList<Producto>();

        ps = con.getCnn().prepareStatement(readProductoPorFactura);
        ps.setInt(1, id);

        res = ps.executeQuery();

        while (res.next()) {
            producto = new Producto();
            producto.setIdProducto(res.getInt("idProducto"));
            producto.setCantidad(res.getInt("cantidad"));

            listaProducto.add(producto);
        }
        return listaProducto;
    }

    public boolean updateProductoPorFactura(Integer id, Producto producto) throws SQLException {
        String sqlUpdateProductoPorFactura = "UPDATE productoPorFactura SET cantidad = ? WHERE idFactura = ? AND idProducto = ?";
        PreparedStatement ps;

        ps = con.getCnn().prepareStatement(sqlUpdateProductoPorFactura);

        ps.setInt(1, producto.getCantidad());
        ps.setInt(2, id);
        ps.setInt(3, producto.getIdProducto());

        return ps.executeUpdate() == 1;
    }
}
