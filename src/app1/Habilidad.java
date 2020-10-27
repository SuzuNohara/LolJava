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
public class Habilidad {
    private boolean skillshot;
    private int rango;
    private int dano;

    public boolean isSkillshot() {
        return skillshot;
    }

    public void setSkillshot(boolean skillshot) {
        this.skillshot = skillshot;
    }

    public int getRango() {
        return rango;
    }

    public void setRango(int rango) {
        this.rango = rango;
    }

    public int getDano() {
        return dano;
    }

    public void setDano(int dano) {
        this.dano = dano;
    }

    @Override
    public String toString() {
        return "Habilidad{" + "skillshot=" + skillshot + ", rango=" + rango + ", dano=" + dano + '}';
    }
    
    
}
