package fitnesspower.bl;

import fitnesspower.ent.Factura;
import fitnesspower.ent.Producto;
import fitnesspowerdat.FacturaDao;
import fitnesspowerdat.ProductoDao;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class FacturaBL {

    FacturaDao facturaDao;
    ProductoDao productoDao;

    public void createFactura(Factura factura) throws ClassNotFoundException, SQLException {
        facturaDao = new FacturaDao();
        facturaDao.create(factura);
    }

    public void updateFactura(Factura factura) throws ClassNotFoundException, SQLException {
        facturaDao = new FacturaDao();
        facturaDao.update(factura);
    }

    public Factura readForIdFactura(Integer id) throws ClassNotFoundException, SQLException {
        facturaDao = new FacturaDao();
        Factura factura = new Factura();
        factura = facturaDao.readId(id);
        return factura;
    }

    public List<Producto> readProductoPorFactura(Integer id) throws ClassNotFoundException, SQLException, IOException {
        facturaDao = new FacturaDao();
        productoDao = new ProductoDao();
        List<Producto> listaProducto = new ArrayList<Producto>();
        List<Producto> lp = new ArrayList<Producto>();

        int cantidad;
        int idProducto;

        Producto producto;

        lp = facturaDao.readProductoPorFactura(id);

        for (Producto lp1 : lp) {
            producto = new Producto();
            producto = lp1;
            cantidad = producto.getCantidad();
            idProducto = producto.getIdProducto();
            producto = new Producto();
            producto = productoDao.readForId(idProducto);
            producto.setCantidad(cantidad);
            listaProducto.add(producto);
        }
        return listaProducto;
    }

    public List<Factura> readAllFactura() throws ClassNotFoundException, SQLException {
        facturaDao = new FacturaDao();
        List<Factura> lf = new ArrayList<Factura>();
        lf = facturaDao.readAll();
        return lf;
    }

    public void deleteForIdFactura(Integer id) throws ClassNotFoundException, SQLException {
        facturaDao = new FacturaDao();
        facturaDao.delete(id);
    }

    public void AgregarProductoPorFactura(Factura factura, List<Producto> listaProducto) throws ClassNotFoundException, SQLException {
        facturaDao = new FacturaDao();
        factura.getIdFactura();
        for (Producto producto : listaProducto) {
            facturaDao.AgragarProductoFactura(factura.getIdFactura(), producto);
        }
    }

    public void updateProductoPorFactura(Factura factura, List<Producto> listaProducto) throws ClassNotFoundException, SQLException {
        facturaDao = new FacturaDao();
        for (Producto producto : listaProducto) {
            factura.getIdFactura();
            facturaDao.updateProductoPorFactura(factura.getIdFactura(), producto);
        }

    }

    public Integer countRecords() throws ClassNotFoundException, SQLException {
        facturaDao = new FacturaDao();
        int cantidad = facturaDao.countRecords();
        return cantidad;
    }
}
