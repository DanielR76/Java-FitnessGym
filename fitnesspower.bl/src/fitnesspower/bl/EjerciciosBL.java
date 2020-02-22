/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fitnesspower.bl;


import fitnesspower.ent.Ejercicio;
import fitnesspowerdat.CreateFitness;
import java.sql.SQLException;



/**
 *
 * @author HIJOS
 */
public class EjerciciosBL {
     CreateFitness createFitness;
    Ejercicio ejercicio;
    
      public void CreateEjercicio(Ejercicio ejercicio) throws SQLException,  ClassNotFoundException {
        createFitness = new CreateFitness();
        createFitness.NuevoEjercicio(ejercicio);
    }
}
