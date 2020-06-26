/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hojatrabajo3;

import java.awt.Color;
import java.awt.HeadlessException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;

public class Colores extends JFrame {

    public Colores(String title) throws HeadlessException {
        super(title);
        this.setVisible(true);
        this.setSize(580, 250);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        crearObjetos();

    }

    public void crearObjetos() {

        JPanel panelPrin = Utiles.crearPaneles(580, 250, Color.CYAN);

        JButton botonRojo = Utiles.crearBotones("", 100, 100, 20, 40, Color.RED);
        panelPrin.add(botonRojo);
        
        

        JButton botonAzul = Utiles.crearBotones("", 100, 100, 130, 40, Color.BLUE);
        panelPrin.add(botonAzul);

        JLabel lblRojo = Utiles.crearLabel("Rojo", 30, 20, 290, 55, Color.CYAN,12, Color.BLACK);
        panelPrin.add(lblRojo);

        JLabel lblAzul = Utiles.crearLabel("Azul", 30, 20, 290, 105, Color.CYAN,12, Color.BLACK);
        panelPrin.add(lblAzul);

        JLabel lblRojo2 = Utiles.crearLabel("", 100, 20, 330, 55, Color.WHITE,20, Color.RED);
        panelPrin.add(lblRojo2);

        JLabel lblAzul2 = Utiles.crearLabel("", 100, 20, 330, 105, Color.WHITE,20, Color.BLUE);
        panelPrin.add(lblAzul2);
        
        
        botonRojo = Utiles.eventoBotonRojo(lblRojo2, botonRojo);
        botonAzul = Utiles.eventoBotonAzul(lblAzul2, botonAzul);

        this.add(panelPrin);

    }

}
