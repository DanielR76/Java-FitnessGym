package fitnesspower.ent;



public class Novedad {

    private String nombreEvento;
    private String ubicacionEvento;
    private String fecha;
    private String descripcion;

    public String getNombreEvento() {
        return nombreEvento;
    }

    public void setNombreEvento(String nombreEvento) {
        this.nombreEvento = nombreEvento;
    }

    public String getUbicacionEvento() {
        return ubicacionEvento;
    }

    public void setUbicacionEvento(String ubicacionEvento) {
        this.ubicacionEvento = ubicacionEvento;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Novedad( String nombreEvento, String ubicacionEvento, String fecha, String descripcion) {

        this.nombreEvento = nombreEvento;
        this.ubicacionEvento = ubicacionEvento;
        this.fecha = fecha;
        this.descripcion = descripcion;
    }
}
