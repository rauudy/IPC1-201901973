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
public class FrmPila extends JFrame {

    public JTextArea areaTextoP = new JTextArea();

    public FrmPila() throws HeadlessException {
        super();
        setVisible(false);
        setSize(500, 600);
        setLocationRelativeTo(null);
        crearObjetosIn();
    }

    public void crearObjetosIn() {
        JPanel panelP = Utiles.crearPaneles(500, 600, Color.DARK_GRAY);

        JButton botonPush = Utiles.crearBotones("Push", 100, 30, 200, 400, Color.yellow);
        panelP.add(botonPush);

        JButton botonPop = Utiles.crearBotones("Pop", 100, 30, 200, 450, Color.yellow);
        panelP.add(botonPop);

        areaTextoP.setBounds(20, 20, 440, 300);
        panelP.add(areaTextoP);

        add(panelP);

    }

}


