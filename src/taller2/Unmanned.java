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
 *creacion de la clase Unmanned que es una extencion de SpaceVehicles
 */
public class Unmanned extends SpaceVehicles {
/**
 * desde el constructor damos valores a sus atributos
 */
    public Unmanned(){
        this.loadInTons=100;
        this.velocity=6300;
        this.weight=2100;
    }

 /**
  * sobrecarga de los metodos  abstractos 
  */
    @Override
    public void Takeoff() {
       this.velocity= velocity + 1;
    }

    @Override
    public void Landing() {
        this.velocity= 0;
    }
    
}
