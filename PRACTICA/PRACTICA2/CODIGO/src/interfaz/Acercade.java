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
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
import practica2.Utiles;

/**
 *
 * @author Raudy
 */
public class Acercade extends JFrame{
    Tablero t = new Tablero("Acerca de...");
    

    public Acercade(String title) throws HeadlessException {
        super(title);
        this.setVisible(false);
        this.setSize(400, 200);
        this.getContentPane().setBackground(Color.yellow);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(null);
        crearObjetos();

    }

    public void crearObjetos() {
        JPanel panelMio = Utiles.crearPaneles(400, 200, Color.CYAN);

        JLabel na = Utiles.crearLabelTableroOp("Mi Nombre es", 100, 20, 20, 20, Color.yellow);
        panelMio.add(na);

        JLabel nombre = Utiles.crearLabelTableroOp("Raudy David Cabrera Contreras", 200, 20, 20, 40, Color.yellow);
        panelMio.add(nombre);
        
        JLabel no = Utiles.crearLabelTableroOp("Mi Carnet es", 100, 20, 20, 80, Color.PINK);
        panelMio.add(no);

        JLabel carnet = Utiles.crearLabelTableroOp("201901973", 100, 20, 20, 100, Color.PINK);
        panelMio.add(carnet);
        
        
        this.add(panelMio);

    }
    
    
    
}
