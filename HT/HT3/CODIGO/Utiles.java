/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hojatrabajo3;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Raudy
 */
public class Utiles {

    public static int rojos = 0;
    public static int azules = 0;

    public static JPanel crearPaneles(int ancho, int alto, Color color) {
        JPanel panel = new JPanel(null);
        panel.setPreferredSize(new Dimension(ancho, alto));
        panel.setBackground(color);
        return panel;
    }

    public static JButton crearBotones(String texto, int ancho, int alto, int x, int y, java.awt.Color color) {
        JButton boton = new JButton(texto);
        boton.setBounds(x, y, ancho, alto);
        boton.setBackground(color);
                return boton;
    }

    public static JButton eventoBotonRojo(JLabel lbl, JButton boton) {

        ActionListener oyente = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if (rojos != 1000) {
                    rojos++;
                }
                lbl.setText(Integer.toString(rojos));
            }
        };
        boton.addActionListener(oyente);
        return null;

    }

    public static JButton eventoBotonAzul(JLabel lbl, JButton boton) {

        ActionListener oyente = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if (azules != 1000) {
                    azules++;
                }
                lbl.setText(Integer.toString(azules));
            }
        };
        boton.addActionListener(oyente);
        return null;

    }

    public static JLabel crearLabel(String texto, int ancho, int alto, int x, int y, Color color, int letra, Color color2) {
        
        JLabel lbl = new JLabel();
        lbl.setText(texto);

        lbl.setBounds(x, y, ancho, alto);

        lbl.setOpaque(true);
        lbl.setBackground(color);
        lbl.setFont(new Font("arial",1,letra));
        lbl.setForeground(color2);
        return lbl;
    }
    
    
    public static JTextField crearTxt (String text, int x, int y, int ancho,int alto){
    
        JTextField txt = new JTextField();
        txt.setText(text);
        
        txt.setBounds(x, y, ancho, alto);

        txt.setOpaque(true);
        //txt.setBackground(color);
        //txt.setFont(new Font("arial",1,letra));
        //txt.setForeground(color2);
        return null;
        
    
    }

}
