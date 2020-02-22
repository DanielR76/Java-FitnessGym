package fitnesspower.dao;

import co.com.fitnesspower.dal.Conexion;
import fitnesspower.ent.Factura;
import fitnesspower.ent.Producto;
import co.com.fitnesspower.dal.InterfazDao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class FacturaDao implements InterfazDao<Factura> {

    private static Conexion con;

    public FacturaDao() throws ClassNotFoundException, SQLException {
        con = Conexion.estado();
    }

    @Override
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

    public Factura readId(Object key) throws SQLException {
        String sqlRead = " SELECT * FROM factura WHERE idFactura = ?";

        PreparedStatement ps;
        ResultSet res;
        Factura f = new Factura();

        ps = con.getCnn().prepareStatement(sqlRead);
        ps.setInt(1, Integer.parseInt(key.toString()));

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

    @Override
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

    @Override
    public boolean delete(Object key) throws SQLException {
        String sqlDelete = "DELETE FROM factura WHERE idFactura = ?";
        PreparedStatement ps;

        ps = con.getCnn().prepareStatement(sqlDelete);

        ps.setInt(1, Integer.parseInt(key.toString()));

        return ps.executeUpdate() == 1;
    }

    @Override
    public List<Factura> readAll() throws SQLException {
        String sqlReadAll = "SELECT * FROM factura";
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

    public boolean AgragarProductoFactura(Factura x, Producto p) throws SQLException {
        String sqlAgregarProductoFactura = "INSERT INTO productoporfactura (idFactura, idProducto, cantidad) VALUES (?,?,?)";
        PreparedStatement ps;

        ps = con.getCnn().prepareStatement(sqlAgregarProductoFactura);

        ps.setInt(1, x.getIdFactura());
        ps.setInt(2, p.getIdProducto());
        ps.setInt(3, p.getCantidad());

        return ps.executeUpdate() == 1;
    }
}
