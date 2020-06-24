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

/**
 *
 * @author Raudy
 */
public class MoverLabel implements Runnable {
    
    
    JLabel lbl;
    int velocidadMov;
    
    int ancho;

    public MoverLabel(JLabel lbl, int velocidadMov, int ancho) {
        this.lbl = lbl;
        this.velocidadMov = velocidadMov;
        
        this.ancho = ancho;
    }

    @Override
    public void run() {

        while (true) {  
            lbl.setBounds(lbl.getX() , lbl.getY() + this.ancho, lbl.getWidth(), lbl.getHeight());
            try {
                Thread.sleep(100 * velocidadMov);
            } catch (InterruptedException ex) {
                Logger.getLogger(MoverLabel.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        

    }
}
