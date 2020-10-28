/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app1;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author NaMYn
 */
public class App1 {
    
    private static ARAM aram;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Iniciando");
        System.out.println("Elige el tipo de partida");
        System.out.println("1. ARAM VS\n2. ARAM 5vs5\n3. Grieta del invocador");
        int opcion = leer.nextInt();
        campeon campeon1 = new campeon();
        campeon campeon2 = new campeon();
        switch(opcion){
            case 1:
                System.out.println("Elige tus campeones");
                System.out.println("1. Lucian\n2. Nasus\n");
                opcion = leer.nextInt();
                int eleccion = leer.nextInt();
                if(opcion == 1){
                    campeon1 = new Lucian();
                    campeon1.setName("lucian");
                    campeon1.setDanoBase(300);
                    campeon1.setArmadura(10);
                    campeon1.setResistenciaMagica(20);
                    campeon1.setVelocidad(200);
                    campeon1.setVelocidadAtaque(400);
                }else if(opcion == 2){
                    campeon1 = new Nasus();
                    campeon1.setName("Nasus");
                    campeon1.setDanoBase(500);
                    campeon1.setArmadura(100);
                    campeon1.setResistenciaMagica(200);
                    campeon1.setVelocidad(100);
                    campeon1.setVelocidadAtaque(100);
                }
                if(eleccion == 1){
                    campeon2 = new Lucian();
                    campeon2.setName("lucian");
                    campeon2.setDanoBase(300);
                    campeon2.setArmadura(10);
                    campeon2.setResistenciaMagica(20);
                    campeon2.setVelocidad(200);
                    campeon2.setVelocidadAtaque(400);
                }else if(eleccion == 2){
                    campeon2 = new Nasus();
                    campeon2.setName("Nasus");
                    campeon2.setDanoBase(500);
                    campeon2.setArmadura(100);
                    campeon2.setResistenciaMagica(200);
                    campeon2.setVelocidad(100);
                    campeon2.setVelocidadAtaque(100);
                }
                aram = new ARAM(campeon1, campeon2);
                manageARAM();
                break;
            case 2:
                System.out.println("Opcion no disponible");
                break;
            case 3:
                System.out.println("Opcion no disponible");
                break;
            default:
                System.out.println("Opcion no disponible");
                break;
        }
    }
    
    private static void manageARAM(){
        Scanner leer = new Scanner(System.in);
        aram.statusCampeones();
        System.out.println("Ingresa la siguiente accion");
        System.out.println("1. Asesinato rojo sobre azul\n2. Asesinato azul sobre rojo\n3. Minion azul farmeado\n4. Minion rojo farmeado\n5. Ver status\n6. Nexo rojo destruido\n7. Nexo azul destruido");
        int opcion = leer.nextInt();
        switch(opcion){
            case 1:
                aram.asesinato("equipo2");
                manageARAM();
                break;
            case 2:
                aram.asesinato("equipo1");
                manageARAM();
                break;
            case 3:
                aram.minion("equipo2");
                manageARAM();
                break;
            case 4:
                aram.minion("equipo1");
                manageARAM();
                break;
            case 5:
                aram.statusCampeones();
                manageARAM();
                break;
            case 6:
                aram.ganar("equipo1");
                aram.statusCampeones();
                break;
            case 7:
                aram.ganar("equipo2");
                aram.statusCampeones();
                break;
        }
        
    }
    
}
