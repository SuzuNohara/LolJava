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
public class campeon {
    private String name;
    private int danoBase; // datoscon decimales 12.5 13.4
    private int armadura;
    private int velocidad;
    private int velocidadAtaque;
    private int resistenciaMagica;
    
    private int oro;
    private int minions;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDanoBase() {
        return danoBase;
    }

    public void setDanoBase(int danoBase) {
        this.danoBase = danoBase;
    }

    public int getArmadura() {
        return armadura;
    }

    public void setArmadura(int armadura) {
        this.armadura = armadura;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public int getVelocidadAtaque() {
        return velocidadAtaque;
    }

    public void setVelocidadAtaque(int velocidadAtaque) {
        this.velocidadAtaque = velocidadAtaque;
    }

    public int getResistenciaMagica() {
        return resistenciaMagica;
    }

    public void setResistenciaMagica(int resistenciaMagica) {
        this.resistenciaMagica = resistenciaMagica;
    }

    public int getOro() {
        return oro;
    }

    public void setOro(int oro) {
        this.oro = oro;
    }

    public int getMinions() {
        return minions;
    }

    public void setMinions(int minions) {
        this.minions = minions;
    }

    @Override
    public String toString() {
        return campeonString();
    }

    
    public String campeonString(){
        return "campeon{" + "name=" + name + ", danoBase=" + danoBase + ", armadura=" + armadura + ", velocidad=" + velocidad + ", velocidadAtaque=" + velocidadAtaque + ", resistenciaMagica=" + resistenciaMagica + ", oro=" + oro + ", minions=" + minions + '}';
    }
}
