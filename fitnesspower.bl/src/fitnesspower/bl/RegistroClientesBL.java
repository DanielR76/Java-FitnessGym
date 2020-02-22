/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fitnesspower.bl;

import fitnesspower.ent.Cliente;
import fitnesspowerdat.CreateFitness;
import java.sql.SQLException;

/**
 *
 * @author HIJOS
 */
public class RegistroClientesBL {
     CreateFitness createFitness;
     Cliente cliente;
    
      public void CreateCliente(Cliente cliente) throws SQLException,  ClassNotFoundException {
        createFitness = new CreateFitness();
        createFitness.NuevoCliente(cliente);
    }
      
}
