/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Objetos.MatrizR;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import javax.swing.plaf.BorderUIResource;

/**
 *
 * @author eriss
 */
public class Framesecundario extends JFrame{

    private Integer resuelto=0;
   private MatrizR matrizv=new MatrizR();
   private JButton comprobar;
    private JTextField[][] matri=new JTextField[9][9];
    public Framesecundario() {
        super("Sodoku");
        setSize(600,600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    public void setlistener(){
        TitledBorder b=new TitledBorder(new BorderUIResource.EtchedBorderUIResource(1, Color.RED, Color.DARK_GRAY));
        ////////
        JPanel tabla=new JPanel(new GridLayout(9,9));
        tabla.setBorder(b);
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                matri[i][j]=new JTextField();
                matri[i][j].setHorizontalAlignment((int) CENTER_ALIGNMENT);
                matri[i][j].setFont(new Font("Arial Black",0,20));
                tabla.add(matri[i][j]);
                if(this.matrizv.getCaja()[i][j].getMostrar()){
                    matri[i][j].setText(String.valueOf(this.matrizv.getCaja()[i][j].getPosicionR()));
                    this.matrizv.getCaja()[i][j].setPosicionU(matrizv.getCaja()[i][j].getPosicionR());
                    matri[i][j].setEditable(false);
                    
                }
            }    
        }
        ///////////
        JPanel bontones=new JPanel(new FlowLayout((int) RIGHT_ALIGNMENT,50, 10));
        bontones.setPreferredSize(new Dimension(0,50));
        JButton salir=new JButton("Salir");
        salir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        /////
        JButton solucionar=new JButton("Solucionar");
        solucionar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //matrizv=new MatrizR();
            for(int i=0;i<9;i++){
                for(int j=0;j<9;j++){
                    matri[i][j].setText(String.valueOf(matrizv.getCaja()[i][j].getPosicionR()));
                    matri[i][j].setEditable(false);
                    solucionar.setVisible(false);
                    comprobar.setVisible(false);
                }    
            } 
            }
        });
        comprobar =new JButton("Comprobar");
        comprobar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            try{
              for(int i=0;i<9;i++){
                    for(int j=0;j<9;j++){
                        matrizv.getCaja()[i][j].setPosicionU(Integer.valueOf(matri[i][j].getText()));
                        if(matrizv.getCaja()[i][j].validar()&&!matrizv.getCaja()[i][j].getMostrar()){
                            matri[i][j].setBackground(Color.GREEN);
                            matri[i][j].setEditable(false);
                            resuelto++;
                        }else if(!matrizv.getCaja()[i][j].validar()&&!matrizv.getCaja()[i][j].getMostrar()){
                            matri[i][j].setBackground(Color.RED);
                        }
                    }    
                }  
            }catch(NumberFormatException ex){
                JOptionPane.showMessageDialog(null,"No ha completado el sodoku","Error",JOptionPane.ERROR_MESSAGE);
            }
            if(resuelto>=130){
                solucionar.setVisible(false);
                comprobar.setVisible(false);
            }
            }
        });
        //////
        bontones.add(salir);
        bontones.add(solucionar);
        bontones.add(comprobar);
        bontones.setBorder(b);
        ////////////
        add(tabla,BorderLayout.CENTER);
        add(bontones,BorderLayout.SOUTH);
        setVisible(true);
    }
    
    
}
