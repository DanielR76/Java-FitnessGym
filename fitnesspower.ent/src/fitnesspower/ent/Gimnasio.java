package fitnesspower.ent;

public class Gimnasio {



    private String nombre;
    private Long nit;
    private Integer nroFactura;
    private Float ganancia;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNit(Long nit) {
        this.nit = nit;
    }

    public Long getNit() {
        return this.nit;
    }

    public void setNroFactura(Integer nroFactura) {
        this.nroFactura = nroFactura;
    }

    public Integer getNroFactura() {
        return this.nroFactura;
    }

    public void setGanacia(Float ganancia) {
        this.ganancia = ganancia;
    }

    public Float getGanancia() {
        return this.ganancia;
    }
}
