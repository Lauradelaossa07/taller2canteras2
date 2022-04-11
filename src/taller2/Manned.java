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
 *creacion de la clase Manned que es una extencion de SpaceVehicles
 */
public class Manned extends SpaceVehicles{
    
    private int crew;

/**
 * desde el constructor damos valores a sus atributos
 */
    public Manned(){
        this.velocity=3120;
        this.weight=1200;
        this.crew=20;
    }

 /**
  * Creacion de metodos aplicando sobrescritura y sobrecarga de los abstractos
  */
    @Override
    public void Takeoff() {
      this.velocity= velocity + 1;
    }

    @Override
    public void Landing() {
         this.velocity= 0;
    }
    
    public int NumberOfCrew(){
        return crew;
    }
}
