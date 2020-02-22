/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fitnesspower.ent;

/**
 *
 * @author ESTUDIANTE2302T
 */
public class Sugerencias {

    private String nombre;
    private String asunto;
    private String comentario;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAsunto() {
        return asunto;
    }

    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public Sugerencias( String nombre, String asunto, String comentario) {
        
        this.nombre = nombre;
        this.asunto = asunto;
        this.comentario = comentario;
    }

}
