/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import javax.swing.plaf.BorderUIResource;

/**
 *
 * @author eriss
 */
public class Frameprincipal extends JFrame{

    public Frameprincipal() {
        super("Sodoku");
        setSize(400,500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        ////////////
        JPanel titulo=new JPanel();
        ImageIcon s=new ImageIcon(getClass().getResource("../Imagenes/logo.png"));
        ImageIcon s1=new ImageIcon(s.getImage().getScaledInstance(300,100,Image.SCALE_DEFAULT));
        JLabel t=new JLabel(s1);
        titulo.add(t);
        ///////////////
        JPanel botones=new JPanel(new FlowLayout((int) RIGHT_ALIGNMENT,0, 150));
        TitledBorder b=new TitledBorder(new BorderUIResource.EtchedBorderUIResource(1, Color.RED, Color.DARK_GRAY));
        botones.setBorder(b);
        JButton jugar=new JButton();
        ImageIcon m=new ImageIcon(getClass().getResource("../Imagenes/boton.png"));
        ImageIcon m1=new ImageIcon(m.getImage().getScaledInstance(200,90,Image.SCALE_DEFAULT));
        jugar.setPreferredSize(new Dimension(200,90));
        TitledBorder bor=new TitledBorder(new BorderUIResource.EtchedBorderUIResource(1, Color.RED, Color.DARK_GRAY));
        jugar.setIcon(m1);
        jugar.setBorder(bor);
        botones.add(jugar,BorderLayout.CENTER);
        Framesecundario f2=new Framesecundario();
        jugar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                f2.setlistener();
            }
        });
        ////////////
        add(titulo,BorderLayout.NORTH);
        add(botones,BorderLayout.CENTER);
        super.setVisible(true);
    }
    
}
