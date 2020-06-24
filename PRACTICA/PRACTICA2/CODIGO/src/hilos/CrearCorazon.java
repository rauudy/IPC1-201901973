/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hilos;

import interfaz.Tablero;
import static interfaz.Tablero.botonNave;
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
public class CrearCorazon implements Runnable {

    int ancho;
    int alto;
    Color color;
    JPanel panelTablero;
    int velocidadCreacion;
    int velocidadMov;

    public CrearCorazon(int ancho, int alto, Color color, JPanel panelTablero, int velocidadCreacion, int velocidadMov) {
        this.ancho = ancho;
        this.alto = alto;
        this.color = color;
        this.panelTablero = panelTablero;
        this.velocidadCreacion = velocidadCreacion;
        this.velocidadMov = velocidadMov;
    }

    @Override
    public void run() {

        while (true) {

            int random = Utiles.generarNumeroAleatorio(1, 4);
            JLabel lbl2;
            MoverLabel proceso1;
            lbl2 = Utiles.crearLabel(Utiles.rutaImagenCorazon, this.ancho, this.alto, 100 * random, 0, this.color);
            proceso1 = new MoverLabel(lbl2, this.velocidadMov, this.ancho);
            this.panelTablero.add(lbl2);
            Thread hilo1 = new Thread(proceso1);
            hilo1.start();
            
            
            try {
                Thread.sleep(1000 * this.velocidadCreacion);
            } catch (InterruptedException ex) {
                Logger.getLogger(MoverLabel.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }
}
