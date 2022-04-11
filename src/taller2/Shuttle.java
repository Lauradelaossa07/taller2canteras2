/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller2;

/**
 *
 * @author Laura
 */

/**
 * 
 *creacion de la clase Shuttle que es una extencion de SpaceVehicles
 */
public class Shuttle extends SpaceVehicles {
    
    private boolean orbiting;
/**
 * desde el constructor damos valores a sus atributos
 */
    public Shuttle(){
        this.loadInTons=118;
        this.velocity=40300;
        this.weight=2900;
        this.orbiting=false;
    }
 /**
  * Creacion de metodos y sobrecarga de los abstractos
  */
    public void orbit(){
        orbiting=true;
    }
    @Override
    public void Takeoff() {
        this.velocity= velocity + 1;
       
    }
   
    @Override
        public void Landing(){
        this.velocity=0;
        this.orbiting= false;
    }
    
    public boolean ToOribit(){
        return orbiting;
    }
}
