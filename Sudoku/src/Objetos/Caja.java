/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objetos;

/**
 *
 * @author eriss
 */
public class Caja {
    private Integer posicionR;
    private Integer posicionU;
    private Boolean mostrar;

    public Caja() {
        posicionR=0;
        posicionU=0;
        mostrar=false;
    }

    public Integer getPosicionR() {
        return posicionR;
    }

    public void setPosicionR(Integer posicionR) {
        this.posicionR = posicionR;
    }

    public Integer getPosicionU() {
        return posicionU;
    }

    public void setPosicionU(Integer posicionU) {
        this.posicionU = posicionU;
    }

    public Boolean getMostrar() {
        return mostrar;
    }

    public void setMostrar(Boolean mostrar) {
        this.mostrar = mostrar;
    }
    
    public Boolean validar(){
        return posicionR==posicionU;
    }
    
    
}
