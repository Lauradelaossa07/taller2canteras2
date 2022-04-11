/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller2;

import java.util.Scanner;

/**
 *
 * @author Laura
 */
public class Taller2 {
    
    
    public static void main(String[] args) {

        Scanner opc = new Scanner(System.in);
        int opcion;

        do
        {
            System.out.println("Choose the type of ship to create: ");
            System.out.println("\n");
            System.out.println("1.Manned: ");
            System.out.println("2.Shuttle: ");
            System.out.println("3.Robotics: ");
            System.out.println("4.Exit: ");
            opcion = opc.nextInt();
            
            switch (opcion){
                case 1:
                     System.out.println(" Manned create ");
                    break;
                case 2:
                     System.out.println(" Shuttle create ");
                    break;
                case 3:
                     System.out.println(" Robotics create ");
                    break;
            }
        }
        while(opcion !=4);
    }
}
     


