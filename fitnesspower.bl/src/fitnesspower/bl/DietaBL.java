/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fitnesspower.bl;

import fitnesspower.ent.Dieta;
import fitnesspowerdat.CreateFitness;
import java.sql.SQLException;

/**
 *
 * @author HIJOS
 */
public class DietaBL {
    CreateFitness createFitness;
    Dieta dieta;
    
      public void CreateDieta(Dieta dieta) throws SQLException,  ClassNotFoundException {
        createFitness = new CreateFitness();
        createFitness.NuevaDieta(dieta);
    }
      
}
