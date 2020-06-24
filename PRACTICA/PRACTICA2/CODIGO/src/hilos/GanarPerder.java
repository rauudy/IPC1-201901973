/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hilos;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import practica2.Utiles;

/**
 *
 * @author Raudy
 */
public class GanarPerder implements Runnable{

    @Override
    public void run() {
        while (true) {            
            if (Utiles.vidas == 0) {
                JOptionPane.showMessageDialog(null, "Perdiste guapo");
                return;
                
            }
            try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(GanarPerder.class.getName()).log(Level.SEVERE, null, ex);
                } 
            
        }

    }
    
}
