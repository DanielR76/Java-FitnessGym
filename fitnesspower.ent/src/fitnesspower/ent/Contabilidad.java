package fitnesspower.ent;

public class Contabilidad {

    public Integer ingreso, egreso, totalFinal;
    public String descripcion;

    public Integer getEgreso() {
        return egreso;
    }

    public void setEgreso(Integer egreso) {
        this.egreso = egreso;
    }

    public Integer getTotalFinal() {
        return totalFinal;
    }

    public void setTotalFinal(Integer totalFinal) {
        this.totalFinal = totalFinal;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Integer getIngreso() {
        return ingreso;
    }

    public void setIngreso(Integer ingreso) {
        this.ingreso = ingreso;
    }

    public Contabilidad(Integer ingreso) {

        this.ingreso = ingreso;

    }

    public Contabilidad(Integer ingreso, Integer egreso, Integer totalFinal, String descripcion) {

        this.ingreso = ingreso;
        this.egreso = egreso;
        this.totalFinal = totalFinal;
        this.descripcion = descripcion;

    }
}
