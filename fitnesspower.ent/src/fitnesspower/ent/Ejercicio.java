package fitnesspower.ent;

public class Ejercicio {

    private String nombre;
    private String grupoMuscular;
    private String descripcion;
  
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGrupoMuscular() {
        return grupoMuscular;
    }

    public void setGrupoMuscular(String grupoMuscular) {
        this.grupoMuscular = grupoMuscular;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    

    public Ejercicio( String nombre, String grupoMuscular, String descripcion) {
        
        this.nombre = nombre;
        this.grupoMuscular = grupoMuscular;
        this.descripcion = descripcion;

    }

}
