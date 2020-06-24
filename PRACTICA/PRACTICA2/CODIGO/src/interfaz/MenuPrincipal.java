/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import java.awt.Color;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JPanel;
import practica2.Utiles;

/**
 *
 * @author Raudy
 */
public class MenuPrincipal extends JFrame {

    
    Nickname nombre = new Nickname("Tu nombre...");
    Acercade yo = new Acercade("Mis datos");

    public MenuPrincipal(String title) throws HeadlessException {
        super(title);
        this.setVisible(true);
        this.setSize(350, 530);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);

        crearObjetos();

    }

    public void crearObjetos() {

        JPanel panelPrincipal = Utiles.crearPaneles(350, 530, Color.black);

        JButton boton1 = Utiles.crearBotones("Top 5 QuickSort", 150, 40, 90, 30, Color.MAGENTA);
        panelPrincipal.add(boton1);
        
        JButton boton5 = Utiles.crearBotones("Top 5 BubbleSort", 150, 40, 90, 120, Color.MAGENTA);
        panelPrincipal.add(boton5);

        JButton boton2 = Utiles.crearBotones("Iniciar Juego", 150, 40, 90,220 , Color.MAGENTA);
        panelPrincipal.add(boton2);
        boton2.setEnabled(true);
        boton2 = Utiles.eventoBoton(nombre, boton2);
        
        

      
        JButton boton3 = Utiles.crearBotones("Acerca de...", 150, 40, 90,320 , Color.MAGENTA);
        panelPrincipal.add(boton3);
        boton3.setEnabled(true);
        boton3 = Utiles.eventoBoton(yo, boton3);

        JButton boton4 = Utiles.crearBotones("Salir", 150, 40, 90,420 , Color.MAGENTA);
        panelPrincipal.add(boton4);

        this.add(panelPrincipal);
    }

}
