/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import hilos.CrearAsteorides;
import java.awt.Color;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JPanel;
import javax.swing.JTextField;
import practica2.Utiles;

/**
 *
 * @author Raudy
 */
public class Nickname extends JFrame {

    Tablero t = new Tablero("Juego");
    String[] jugador = new String[20];

    public Nickname(String title) throws HeadlessException {
        super(title);
        this.setVisible(false);
        this.setSize(400, 200);
        this.getContentPane().setBackground(Color.yellow);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(null);
        crearObjetos();

    }

    public void crearObjetos() {
        JPanel panelNickname = Utiles.crearPaneles(400, 200, Color.CYAN);

        JTextField nombreTexto = Utiles.crearTexto(150, 30, 125, 30);
        panelNickname.add(nombreTexto);
        
        
        

        JButton botonJuego = Utiles.crearBotones("Jugar", 100, 30, 150, 90, Color.GREEN);
        panelNickname.add(botonJuego);
        botonJuego = Utiles.eventoBoton(t, botonJuego);
        

//        ActionListener oye = (ActionEvent ae) -> {
//            for (int i = 0; i < 100; i++) {
//                jugador[i] = nombreTexto.getText();
//            }
//        };
//        botonJuego.addActionListener(oye);

        
        
        this.add(panelNickname);

    }

}
