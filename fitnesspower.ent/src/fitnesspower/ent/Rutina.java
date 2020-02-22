package fitnesspower.ent;


public class Rutina {

    private int idRutina;
    private String nombreRutina;
    private String objetivo;
    private String ejercicios;
    
         
    public void setNombreRutina(String nombreRutina) {
        this.nombreRutina = nombreRutina;
    }

    public String getNombreRutina() {
        return this.nombreRutina;
    }

    public int getIdRutina() {
        return idRutina;
    }

    public void setIdRutina(int idRutina) {
        this.idRutina = idRutina;
    }

    public String getObjetivo() {
        return objetivo;
    }

    public void setObjetivo(String objetivo) {
        this.objetivo = objetivo;
    }

    public String getEjercicios() {
        return ejercicios;
    }

    public void setEjercicios(String ejercicios) {
        this.ejercicios = ejercicios;
    }
    
    
    public Rutina(Integer idRutina, String nombreRutina, String objetivo, String ejercicios) {
        
        this.nombreRutina = nombreRutina;
        this.objetivo = objetivo;
        this.ejercicios = ejercicios;

    }
}
