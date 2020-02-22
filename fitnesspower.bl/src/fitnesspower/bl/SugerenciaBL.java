/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fitnesspower.bl;

import fitnesspower.ent.Sugerencias;
import fitnesspowerdat.CreateFitness;
import java.io.IOException;
import java.sql.SQLException;

/**
 *
 * @author HIJOS
 */
public class SugerenciaBL {

    CreateFitness createFitness;
    Sugerencias sugerencias;

    public void CreateSugerencia(Sugerencias sugerencias) throws SQLException, ClassNotFoundException, IOException {
        createFitness = new CreateFitness();
        createFitness.NuevaSugerencia(sugerencias);
    }
}
