/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fitnesspower.bl;

import fitnesspower.ent.Medida;
import fitnesspowerdat.CreateFitness;
import java.io.FileNotFoundException;
import java.sql.SQLException;


public class MedidaBL {
    CreateFitness createFitness;
    Medida medida;
    
      public void CreateMedida(Medida medida) throws SQLException, FileNotFoundException, ClassNotFoundException {
        createFitness = new CreateFitness();
        createFitness.NuevaMedida(medida);
    }
      
}
