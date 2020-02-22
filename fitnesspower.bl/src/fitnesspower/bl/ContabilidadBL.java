/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fitnesspower.bl;

import fitnesspower.ent.Contabilidad;
import fitnesspowerdat.CreateFitness;
import java.io.IOException;
import java.sql.SQLException;

/**
 *
 * @author HIJOS
 */
public class ContabilidadBL {
     CreateFitness createFitness;
    Contabilidad contabilidad;
    
      public void CreateContabilidad(Contabilidad contabilidad) throws SQLException,  ClassNotFoundException,   IOException {
        createFitness.NuevaContabilidad(contabilidad);
    }
}
