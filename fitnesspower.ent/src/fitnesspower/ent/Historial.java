package fitnesspower.ent;

import java.util.ArrayList;

public class Historial {

    private Integer idHistorial;
    private String antecedenteClinico;

    public Integer getIdHistorial() {
        return idHistorial;
    }

    public void setIdHistorial(Integer idHistorial) {
        this.idHistorial = idHistorial;
    }

    public String getAntecedenteClinico() {
        return antecedenteClinico;
    }

    public void setAntecedenteClinico(String antecedenteClinico) {
        this.antecedenteClinico = antecedenteClinico;
    }

    public Historial(Integer idHistorial, String antecedenteClinico) {
        this.idHistorial = idHistorial;
        this.antecedenteClinico = antecedenteClinico;

    }

}
