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
 * creacion de la clase abstracta SpaceVehicles
 */
public abstract class SpaceVehicles {
 
/**
 * implementación de sus atributos genericos.
 */
    public float weight;
    public float loadInTons;
    public float velocity;
    
/**
 * Inicializamos sus variables.
 */
    public SpaceVehicles(){
    this.loadInTons=0;
    this.velocity=0;
    this.weight=0;
}

/**
 * Creación de los metodos abstractos 
 */
    public abstract void Takeoff();
    public abstract void Landing();
      
    

}
