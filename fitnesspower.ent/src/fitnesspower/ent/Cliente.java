package fitnesspower.ent;



public class Cliente {

    private String idCliente;
    private String password;
    private String nombre;
    private String apellido;
    private Integer telefono;
    private String direccion;
    private Integer edad;
    private String EPS;
    private String correo;
    private Integer peso;
    private Integer estatura;
    private String nombreFamiliar;
    private String parentesco;
    private Integer telefonoFamiliar;
    private String sexo;
    private String fecha;

    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

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

    public Integer getTelefono() {
        return telefono;
    }

    public void setTelefono(Integer telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getEPS() {
        return EPS;
    }

    public void setEPS(String EPS) {
        this.EPS = EPS;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Integer getPeso() {
        return peso;
    }

    public void setPeso(Integer peso) {
        this.peso = peso;
    }

    public Integer getEstatura() {
        return estatura;
    }

    public void setEstatura(Integer estatura) {
        this.estatura = estatura;
    }

    public String getNombreFamiliar() {
        return nombreFamiliar;
    }

    public void setNombreFamiliar(String nombreFamiliar) {
        this.nombreFamiliar = nombreFamiliar;
    }

    public String getParentesco() {
        return parentesco;
    }

    public void setParentesco(String parentesco) {
        this.parentesco = parentesco;
    }

    public Integer getTelefonoFamiliar() {
        return telefonoFamiliar;
    }

    public void setTelefonoFamiliar(Integer telefonoFamiliar) {
        this.telefonoFamiliar = telefonoFamiliar;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

  
public Cliente(String idCliente, String password, String nombre, String apellido, Integer telefono, String direccion, Integer edad, String sexo, String EPS, String correo, Integer peso, Integer estatura,String objetivo, String fecha ,String nombreFamiliar, Integer telefonoFamiliar, String parentesco) {
      
        this.idCliente=idCliente;    
        this.password = password;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.edad = edad;
        this.sexo = sexo;
        this.EPS = EPS;
        this.correo = correo;
        this.peso = peso;
        this.estatura = estatura;
        this.direccion = direccion;
        this.fecha= fecha;
        this.nombreFamiliar = nombreFamiliar;
        this.telefonoFamiliar = telefonoFamiliar;
        this.parentesco = parentesco;

    }
}
