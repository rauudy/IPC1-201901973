/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hilos;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 *
 * @author Raudy
 */
public class MoviemientosNave implements Runnable {

    JButton jugador;

    public MoviemientosNave(JButton jugador) {
        this.jugador = jugador;
    }

    @Override
    public void run() {
        while (true) {

            jugador.addKeyListener(new KeyListener() {
                @Override
                public void keyTyped(KeyEvent ke) {
                    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                }

                @Override
                public void keyPressed(KeyEvent ke) {
                    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                }

                @Override
                public void keyReleased(KeyEvent e) {
//                    switch (e.getKeyCode()) {
//
//                        case 37: //izquieda
//                            
//                            break;
//
//                        case 39: //derecha
//                            
//                            break;
//
//                    }
                }

            });

            try {
                Thread.sleep(10);
            } catch (InterruptedException ex) {
                Logger.getLogger(MoviemientosNave.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

}
