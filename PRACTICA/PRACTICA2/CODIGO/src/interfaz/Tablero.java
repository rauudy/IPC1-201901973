/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import hilos.CrearAsteorides;
import java.awt.Color;
import java.awt.HeadlessException;
import javax.swing.JButton;
import hilos.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import hilos.Cronometro;
import javax.swing.JPanel;
import practica2.Utiles;

/**
 *
 * @author Raudy
 */
public class Tablero extends JFrame {

    public static JButton botonNave = Utiles.crearBotonNave(Utiles.rutaImagenNave, 100, 100, 250, 400, Color.MAGENTA);

    public Tablero(String title) throws HeadlessException {
        super(title);
        this.setVisible(false);
        this.setSize(1000, 600);
        this.getContentPane().setBackground(Color.yellow);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(null);
        crearObjetos();

    }

    public void crearObjetos() {
        JPanel panelTablero = Utiles.crearPaneles(1000, 600, Color.WHITE);

        JLabel marco1 = Utiles.crearLabel(Utiles.rutamarcojuego, 430, 555, 100, 10, Color.WHITE);
        panelTablero.add(marco1);

        JLabel marco2 = Utiles.crearLabel(Utiles.rutamarcojuego, 200, 555, 600, 10, Color.WHITE);
        panelTablero.add(marco2);

        
        CrearAsteorides hilos1 = new CrearAsteorides(100, 100, Color.green, panelTablero, 2, 10);
        Thread hilo1 = new Thread(hilos1);
        hilo1.start();

        CrearRayos hilos2 = new CrearRayos(100, 100, Color.CYAN, panelTablero, 10, 20);
        Thread hilo2 = new Thread(hilos2);
        hilo2.start();

        CrearCaracoles hilos3 = new CrearCaracoles(100, 100, Color.ORANGE, panelTablero, 15, 30);
        Thread hilo3 = new Thread(hilos3);
        hilo3.start();

        CrearCorazon hilos4 = new CrearCorazon(100, 100, Color.WHITE, panelTablero, 14, 10);
        Thread hilo4 = new Thread(hilos4);
        hilo4.start();

        CrearOjoInvisible hilos5 = new CrearOjoInvisible(100, 100, Color.WHITE, panelTablero, 10, 10);
        Thread hilo5 = new Thread(hilos5);
        hilo5.start();

        botonNave.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                System.out.println("Click");
            }
        });

        //-----------------------------------------------------
        botonNave.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                //System.out.println("Typed");
            }

            @Override
            public void keyPressed(KeyEvent e) {
                int limite1 = 100;
                int limite2 = 400;
                switch (e.getKeyCode()) {

                    case 37: //izquierda

                        botonNave.setBounds(botonNave.getX() - 50, botonNave.getY(), botonNave.getWidth(), botonNave.getHeight());

                        break;

                    case 39: //derecha

                        botonNave.setBounds(botonNave.getX() + 50, botonNave.getY(), botonNave.getWidth(), botonNave.getHeight());

                        break;

                }
            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        });

        //--------------------------------------------------
        panelTablero.add(botonNave);

        GanarPerder hiloGanarPerder = new GanarPerder();
        Thread hiloGanar1 = new Thread(hiloGanarPerder);
        hiloGanar1.start();

//              
        this.add(panelTablero);

    }

}
