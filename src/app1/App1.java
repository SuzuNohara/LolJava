/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app1;

/**
 *
 * @author NaMYn
 */
public class App1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Inicia partida aram");
        
        Lucian lucian = new Lucian();
        lucian.setName("lucian");
        lucian.setDanoBase(300);
        lucian.setArmadura(10);
        lucian.setResistenciaMagica(20);
        lucian.setVelocidad(200);
        lucian.setVelocidadAtaque(400);
        
        Nasus nasus = new Nasus();
        nasus.setName("nasus");
        nasus.setDanoBase(500);
        nasus.setArmadura(100);
        nasus.setResistenciaMagica(200);
        nasus.setVelocidad(100);
        nasus.setVelocidadAtaque(100);
        
        ARAM aram = new ARAM(lucian, nasus);
        aram.asesinato("equipo1");
        aram.asesinato("equipo1");
        aram.asesinato("equipo1");
        aram.asesinato("equipo2");
        
        aram.statusCampeones();
    }
    
}
