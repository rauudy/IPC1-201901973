/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea3;

import java.awt.Color;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Raudy
 */
public class Colores extends JFrame {

    Color[] clr;
    JButton botonRojo;
    JButton botonAzul;
    int rojo = 0;
    int azul = 0;
    JLabel lblRojo2;
    JLabel lblAzul2;
    Thread cro = new Hilo();
    int contador=0;

    public Colores(String title) throws HeadlessException {
        super(title);
        this.setVisible(true);
        this.setSize(580, 250);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);

        clr = new Color[2];
        clr[0] = Color.RED;
        clr[1] = Color.BLUE;

        
        crearObjetos();
        eventos();
//       cambiarColor();
        
        cro.start();
        ;
        

    }

    public void crearObjetos() {

        JPanel panelPrin = Utiles.crearPaneles(580, 250, Color.CYAN);

        botonRojo = Utiles.crearBotones("", 100, 100, 20, 40, clr[0]);
        panelPrin.add(botonRojo);

        botonAzul = Utiles.crearBotones("", 100, 100, 130, 40, clr[1]);
        panelPrin.add(botonAzul);
        //eventos();

        //--------
        JLabel lblRojo = Utiles.crearLabel("Rojo", 30, 20, 290, 55, Color.CYAN, 12, Color.BLACK);
        panelPrin.add(lblRojo);

        JLabel lblAzul = Utiles.crearLabel("Azul", 30, 20, 290, 105, Color.CYAN, 12, Color.BLACK);
        panelPrin.add(lblAzul);

        lblRojo2 = Utiles.crearLabel("", 100, 20, 330, 55, Color.WHITE, 20, Color.RED);
        panelPrin.add(lblRojo2);

        lblAzul2 = Utiles.crearLabel("", 100, 20, 330, 105, Color.WHITE, 20, Color.BLUE);
        panelPrin.add(lblAzul2);

        //eventos();
        
        //Thread cro = new Hilo();
        
        
        
        
        //cro.stop();
        //eventos();

        //-------
        this.add(panelPrin);

    }

    public void cambiarColor() {

        
        
        if (botonRojo.getBackground() == clr[0]) {
            botonRojo.setBackground(clr[1]);
            botonAzul.setBackground(clr[0]);
        } 
        
        else {
            botonRojo.setBackground(clr[0]);
            botonAzul.setBackground(clr[1]);
        }
        }
                

    public void contadorClr(java.awt.event.MouseEvent e, JButton btn) {
        if (btn.getBackground() == clr[0]) {
            rojo++;
        } else {
            azul++;
        }
        lblRojo2.setText(Integer.toString(rojo));
        lblAzul2.setText(Integer.toString(azul));

    }

    public void eventos() {
        botonRojo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent e) {
                contadorClr(e, botonRojo);
            }

        });

        botonAzul.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent e) {
                contadorClr(e, botonAzul);
            }

        });
        
        
//        ActionListener oyente = new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent ae) {
//                contadorClr(ae, botonRojo);
//            }
//        };
//        botonRojo.addActionListener(oyente);
//        
//        
//        ActionListener oyente2 = new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent ae) {
//                contadorClr(ae, botonAzul);
//            }
//        };
//        botonAzul.addActionListener(oyente2);
        

    }

    private class Hilo extends Thread {

        @Override
        public void run() {


            while (true) {
                
                cambiarColor();
                

                try {
                    
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Colores.class.getName()).log(Level.SEVERE, null, ex);
                }

            }

        }

    }
}
