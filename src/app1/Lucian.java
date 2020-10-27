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
public class Lucian extends campeon {
    private Habilidad q;
    private Habilidad w;
    private Habilidad e;
    private Habilidad r;
    
    private String[] interaccion;

    public Habilidad getQ() {
        return q;
    }

    public void setQ(Habilidad q) {
        this.q = q;
    }

    public Habilidad getW() {
        return w;
    }

    public void setW(Habilidad w) {
        this.w = w;
    }

    public Habilidad getE() {
        return e;
    }

    public void setE(Habilidad e) {
        this.e = e;
    }

    public Habilidad getR() {
        return r;
    }

    public void setR(Habilidad r) {
        this.r = r;
    }

    public String[] getInteraccion() {
        return interaccion;
    }

    public void setInteraccion(String[] interaccion) {
        this.interaccion = interaccion;
    }

    @Override
    public String toString() {
        return "Lucian{" + "q=" + q + ", w=" + w + ", e=" + e + ", r=" + r + ", interaccion=" + interaccion + ", campeon: " + campeonString() + " }";
    }
    
}
