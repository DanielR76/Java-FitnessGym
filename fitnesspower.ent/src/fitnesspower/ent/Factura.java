package fitnesspower.ent;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public class Factura {

    //  Cliente cliente = new Cliente();
    Producto producto = new Producto();

    private Integer idFactura;
    private Integer idCliente;
    private Timestamp fecha;
    private List<Producto> listaProducto = new ArrayList<>();
    private Float valorNeto;
    private Float valorDescuento;
    private Float valorTotal;

    public Integer getIdFactura() {
        return idFactura;
    }

    public void setIdFactura(Integer idFactura) {
        this.idFactura = idFactura;
    }

    public Integer getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Integer idCliente) {
        this.idCliente = idCliente;
    }

    public Timestamp getFecha() {
        return fecha;
    }

    public void setFecha(Timestamp fecha) {
        this.fecha = fecha;
    }

    public List<Producto> getListaProducto() {
        return listaProducto;
    }

    public void setListaProducto(List<Producto> listaProducto) {
        this.listaProducto = listaProducto;
    }

    public Float getValorNeto() {
        return valorNeto;
    }

    public void setValorNeto(Float valorNeto) {
        this.valorNeto = valorNeto;
    }

    public Float getValorDescuento() {
        return valorDescuento;
    }

    public void setValorDescuento(Float valorDescuento) {
        this.valorDescuento = valorDescuento;
    }

    public Float getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(Float valorTotal) {
        this.valorTotal = valorTotal;
    }
}
