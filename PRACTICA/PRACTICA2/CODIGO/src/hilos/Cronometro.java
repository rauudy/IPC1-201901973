/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hilos;

import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JPanel;
import practica2.Utiles;

/**
 *
 * @author Raudy
 */
public class Cronometro extends Thread {

    JLabel lblTiempo;
    int ancho;
    int alto;
    Color color;
    JPanel panelTablero;

    public Cronometro(JLabel lblTiempo, int ancho, int alto, Color color, JPanel panelTablero) {
        this.lblTiempo = lblTiempo;
         
        this.ancho = ancho;
        this.alto = alto;
        this.color = color;
        this.panelTablero = panelTablero;


    }

    public void run() {
        int contador = 0;

        while (true) {

            JLabel lbl2;
            
            lbl2 = Utiles.crearLabelTableroOp("", this.ancho, this.alto, 700, 200, Color.WHITE);
            

            this.panelTablero.add(lbl2);
            Thread hilo1 = new Thread();
            hilo1.start();

            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(MoverLabel.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

    }
}
