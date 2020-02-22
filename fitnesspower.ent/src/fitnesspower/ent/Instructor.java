package fitnesspower.ent;

public class Instructor {

    private String nombre;
    private String apellido;
    private String correo;
    private String direccion;
    private Integer telefono;
    private String sexo;
    private String password;
    private String idInstructor;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Integer getTelefono() {
        return telefono;
    }

    public void setTelefono(Integer telefono) {
        this.telefono = telefono;
    }

    
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getIdInstructor() {
        return idInstructor;
    }

    public void setIdInstructor(String idInstructor) {
        this.idInstructor = idInstructor;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Instructor(String idInstructor,String nombre,String apellido,String correo,String direccion,Integer telefono,String sexo, String password) {
        
        this.idInstructor= idInstructor;
        this.nombre=nombre;
        this.apellido=apellido;
        this.correo=correo;
        this.direccion=direccion;
        this.telefono=telefono;
        this.password = password;
        this.sexo = sexo;

    }

}
