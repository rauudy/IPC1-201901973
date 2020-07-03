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
public class FrmListaD extends JFrame {

    public JTextArea areaTextoLD = new JTextArea();

    public FrmListaD() throws HeadlessException {
        super();
        setVisible(false);
        setSize(500, 600);
        setLocationRelativeTo(null);
        crearObjetosIn();
    }

    public void crearObjetosIn() {
        JPanel panelLD = Utiles.crearPaneles(500, 600, Color.DARK_GRAY);

        JButton botonAgregar = Utiles.crearBotones("Agregar", 100, 30, 200, 400, Color.yellow);
        panelLD.add(botonAgregar);

        JButton botonEliminar = Utiles.crearBotones("Eliminar", 100, 30, 200, 450, Color.yellow);
        panelLD.add(botonEliminar);

        areaTextoLD.setBounds(20, 20, 440, 300);
        panelLD.add(areaTextoLD);

        add(panelLD);

    }

}
