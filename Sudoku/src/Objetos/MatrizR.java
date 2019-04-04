package Objetos;

import javax.swing.JTextField;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author eriss
 */
public class MatrizR {
    private Caja[][] caja=new Caja[9][9];
    private Integer fila;
    private Integer columna;
    private Integer[][] valores={{1,2,3,4,5,6,7,8,9},
                                 {5,6,4,8,9,7,2,3,1},
                                 {9,7,8,3,1,2,6,4,5},
                                 {6,4,5,9,7,8,3,1,2},
                                 {7,8,9,1,2,3,4,5,6},
                                 {2,3,1,5,6,4,8,9,7},
                                 {8,9,7,2,3,1,5,6,4},
                                 {3,1,2,6,4,5,9,7,8},
                                 {4,5,6,7,8,9,1,2,3}
                                 };

    public MatrizR() {
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                caja[i][j]=new Caja();
            }
            
        }
        
        for(int i=0;i<50;i++){
            aleatorio();
            this.caja[fila][columna].setMostrar(true);
        }
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                caja[i][j].setPosicionR(this.valores[i][j]);
            }
        }
        
    }

    public void aleatorio(){
        this.fila=(int)(Math.random()*9);
        this.columna=(int)(Math.random()*9);
    }
    public Caja[][] getCaja() {
        return caja;
    }

    public void setCaja(Caja[][] caja) {
        this.caja = caja;
    }

    public Integer getFila() {
        return fila;
    }

    public void setFila(Integer fila) {
        this.fila = fila;
    }

    public Integer getColumna() {
        return columna;
    }

    public void setColumna(Integer columna) {
        this.columna = columna;
    }

    public Integer[][] getValores() {
        return valores;
    }

    public void setValores(Integer[][] valores) {
        this.valores = valores;
    }
    
    
}
