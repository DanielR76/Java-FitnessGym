
package fitnesspower.ent;



public class Inventario {

    private String nombre;
    private Integer valor;
    private String tipo;
    private String descripcion;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getValor() {
        return valor;
    }

    public void setValor(Integer valor) {
        this.valor = valor;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Inventario(Integer idInventario, String nombre, Integer valor, String tipo, String descripcion) {
        
        this.nombre = nombre;
        this.valor = valor;
        this.tipo = tipo;
        this.descripcion = descripcion;
    }
}
