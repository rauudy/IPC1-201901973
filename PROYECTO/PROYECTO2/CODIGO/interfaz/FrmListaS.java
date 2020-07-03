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
import procesos.ListaSimple;
import utiles.*;

/**
 *
 * @author Raudy
 */
public class FrmListaS extends JFrame {

    public JTextArea areaTextoLS = new JTextArea();
    //ListaSimple Ls = new ListaSimple();

    public FrmListaS() throws HeadlessException {
        super();
        setVisible(false);
        setSize(500, 600);
        setLocationRelativeTo(null);
        crearObjetosIn();
    }

    public void crearObjetosIn() {
        JPanel panelLS = Utiles.crearPaneles(500, 600, Color.DARK_GRAY);

        JButton botonAgregar = Utiles.crearBotones("Agregar", 100, 30, 200, 400, Color.yellow);
        panelLS.add(botonAgregar);

        JButton botonEliminar = Utiles.crearBotones("Eliminar", 100, 30, 200, 450, Color.yellow);
        panelLS.add(botonEliminar);

        areaTextoLS.setBounds(20, 20, 440, 300);
        panelLS.add(areaTextoLS);
        
        //areaTextoLS.setText(Ls.imprimirGrafic());

        add(panelLS);

    }

}
