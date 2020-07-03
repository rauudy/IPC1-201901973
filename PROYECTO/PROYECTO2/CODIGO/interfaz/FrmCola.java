/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import java.awt.Color;
import java.awt.HeadlessException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import utiles.Utiles;

/**
 *
 * @author Raudy
 */
public class FrmCola extends JFrame {

    public JTextArea areaTextoCo = new JTextArea();

    public FrmCola() throws HeadlessException {
        super();
        setVisible(false);
        setSize(500, 600);
        setLocationRelativeTo(null);
        crearObjetosIn();
    }

    public void crearObjetosIn() {
        JPanel panelCo = Utiles.crearPaneles(500, 600, Color.DARK_GRAY);

        JButton botonEncolar = Utiles.crearBotones("Encolar", 100, 30, 200, 400, Color.yellow);
        panelCo.add(botonEncolar);

        JButton botonDesencolar = Utiles.crearBotones("Desencolar", 100, 30, 200, 450, Color.yellow);
        panelCo.add(botonDesencolar);

        areaTextoCo.setBounds(20, 20, 440, 300);
        panelCo.add(areaTextoCo);

        add(panelCo);

    }

}


