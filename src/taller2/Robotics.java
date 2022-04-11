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
 *creacion de la clase Robotics que es una extencion de SpaceVehicles
 */
public class Robotics extends SpaceVehicles {
    
    private boolean telescopesActivated;
/**
 * desde el constructor damos valores a sus atributos
 */
    public Robotics(){
        this.loadInTons=100;
        this.velocity=6300;
        this.weight=2100;
        this.telescopesActivated=false;
    }
    
 /**
  * Creacion de metodos y sobrecarga de los abstractos
  */    
     public void Planets(){
        telescopesActivated=true;
    }
    @Override
    public void Takeoff() {
        this.velocity= velocity + 1;
    }

    @Override
    public void Landing() {
        this.velocity= 0;
    }
    public boolean StudyPlanets(){
        return telescopesActivated;
    }
}
