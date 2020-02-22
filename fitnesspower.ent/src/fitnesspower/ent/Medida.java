package fitnesspower.ent;





public class Medida {

    private String estatura;
    private String hombros;
    private String pecho;
    private String cintura;
    private String cuello;
    private String biceps;
    private String antebrazo;
    private String cadera;
    private String gemelos;
    private String musloSuperior;
    private String imc;
    private String fecha;
    private String observaciones;

    
    public String getEstatura() {
        return estatura;
    }

    public void setEstatura(String estatura) {
        this.estatura = estatura;
    }

    public String getHombros() {
        return hombros;
    }

    public void setHombros(String hombros) {
        this.hombros = hombros;
    }

    public String getPecho() {
        return pecho;
    }

    public void setPecho(String pecho) {
        this.pecho = pecho;
    }

    public String getCintura() {
        return cintura;
    }

    public void setCintura(String cintura) {
        this.cintura = cintura;
    }

    public String getCuello() {
        return cuello;
    }

    public void setCuello(String cuello) {
        this.cuello = cuello;
    }

    public String getBiceps() {
        return biceps;
    }

    public void setBiceps(String biceps) {
        this.biceps = biceps;
    }

    public String getAntebrazo() {
        return antebrazo;
    }

    public void setAntebrazo(String antebrazo) {
        this.antebrazo = antebrazo;
    }

    public String getCadera() {
        return cadera;
    }

    public void setCadera(String cadera) {
        this.cadera = cadera;
    }

    public String getGemelos() {
        return gemelos;
    }

    public void setGemelos(String gemelos) {
        this.gemelos = gemelos;
    }

    public String getMusloSuperior() {
        return musloSuperior;
    }

    public void setMusloSuperior(String musloSuperior) {
        this.musloSuperior = musloSuperior;
    }

    public String getImc() {
        return imc;
    }

    public void setImc(String imc) {
        this.imc = imc;
    }

    public String  getFecha() {
        return fecha;
    }

    public void setFecha(String  fecha) {
        this.fecha = fecha;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public Medida(Integer idMedida, String estatura, String hombros, String pecho, String cintura, String cuello, String biceps, String antebrazo, String cadera, String gemelos, String musloSuperior, String imc, String  fecha, String observaciones) {
        
        this.estatura = estatura;
        this.hombros = hombros;
        this.pecho = pecho;
        this.cintura = cintura;
        this.cuello = cuello;
        this.biceps = biceps;
        this.antebrazo = antebrazo;
        this.cadera = cadera;
        this.gemelos = gemelos;
        this.musloSuperior = musloSuperior;
        this.imc = imc;
        this.fecha = fecha;
       

    }
}
