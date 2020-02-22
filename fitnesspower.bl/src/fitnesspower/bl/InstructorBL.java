/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fitnesspower.bl;


import fitnesspower.ent.Instructor;
import fitnesspowerdat.CreateFitness;
import java.sql.SQLException;

/**
 *
 * @author HIJOS
 */
public class InstructorBL {

     CreateFitness createFitness;
    Instructor instructor;
    
      public void CreateInstructor(Instructor  instructor) throws SQLException,  ClassNotFoundException {
        createFitness = new CreateFitness();
        createFitness.NuevoAdmin(instructor);
    }
}
