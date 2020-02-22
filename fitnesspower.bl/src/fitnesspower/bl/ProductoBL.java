package fitnesspower.bl;


import fitnesspower.ent.Producto;
import fitnesspowerdat.ProductoDao;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;

public class ProductoBL {

    ProductoDao productoDao;
    Producto producto;

    public ImageIcon defaultImage() {
        String pathFull = "src\\imagen\\defaultImage.PNG";
        ImageIcon img = new ImageIcon(pathFull);
        return img;
    }
    
    public void createProducto(Producto producto) throws SQLException, FileNotFoundException, ClassNotFoundException {
        productoDao = new ProductoDao();
        productoDao.create(producto);
    }

    public void updateProducto(Producto producto) throws ClassNotFoundException, SQLException, FileNotFoundException {
        productoDao = new ProductoDao();
        productoDao.update(producto);
    }

    public List<Producto> readAllProducto() throws ClassNotFoundException, SQLException {
        productoDao = new ProductoDao();
        List<Producto> lp = new ArrayList<Producto>();
        lp = productoDao.readAll();
        return lp;
    }

    public File readImageProducto(Integer id) throws ClassNotFoundException, SQLException, IOException {
        productoDao = new ProductoDao();
        File img = productoDao.readImage(id);
        return img;
    }

    public Producto readForIdProducto(Integer id) throws ClassNotFoundException, SQLException, IOException {
        productoDao = new ProductoDao();
        producto = new Producto();
        producto = productoDao.readForId(id);
        return producto;
    }

    public void deleteForIdProducto(Integer id) throws ClassNotFoundException, SQLException {
        productoDao = new ProductoDao();
        productoDao.delete(id);
    }
}
