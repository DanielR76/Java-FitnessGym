package fitnesspower.ent;



/*import java.util.ArrayList;*/

public class Dieta {

    private String nombreDieta;
    private int calorias;
    private String contenido;
    private String descripcion;
 
    public String getNombreDieta() {
        return nombreDieta;
    }

    public void setNombreDieta(String nombreDieta) {
        this.nombreDieta = nombreDieta;
    }

    public int getCalorias() {
        return calorias;
    }

    public void setCalorias(int calorias) {
        this.calorias = calorias;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

  

   
    
    public Dieta(String nombreDieta, int calorias, String descripcion, String contenido) {
        
        this.nombreDieta = nombreDieta;
        this.calorias = calorias;
        this.contenido = contenido;
        this.descripcion = descripcion;
  
    }

}
