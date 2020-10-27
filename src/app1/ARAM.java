/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app1;

import java.util.List;
import java.util.ArrayList;
/**
 *
 * @author NaMYn
 */
public class ARAM {
    
    private int asesinatos1;
    private int asesinatos2;
    
    private List<campeon> equipo1;
    private List<campeon> equipo2;
    
    public ARAM( campeon campeon1, campeon campeon2){
        equipo1 = new ArrayList<campeon>();
        equipo2 = new ArrayList<campeon>();
        asesinatos1 = 0;
        asesinatos2 = 0;
        
        equipo1.add(campeon1);
        equipo2.add(campeon2);
    }
    
    public void generarMinions(){
        
    }
    
    public void asesinato(String equipo){
        if(equipo.equals("equipo1")){
            for(int i = 0; i < equipo1.size(); i++){
                equipo1.get(i).setOro(equipo1.get(i).getOro() + 300);
            }
            asesinatos1++;
        }else{
            for(int i = 0; i < equipo2.size(); i++){
                equipo2.get(i).setOro(equipo2.get(i).getOro() + 300);
            }
            asesinatos2++;
        }
    }
    
    public void statusCampeones(){
        System.out.println("Marcador: " + asesinatos1 + " vs " + asesinatos2);
        System.out.println("Status equipo 1:");
        for(campeon camp: equipo1){
            System.out.print(camp);
        }
        System.out.print("\n");
        System.out.println("Status equipo 2:");
        for(campeon camp: equipo2){
            System.out.print(camp);
        }
    }
}
