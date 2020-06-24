/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica2;

import interfaz.Tablero;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;
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

    public static String rutaImagenCaracol = "C:\\Users\\usuario\\Downloads\\pngocean.com (4).png";
    public static String rutaImagenRayo = "C:\\Users\\usuario\\Downloads\\5a349bec9484a2.1242839915133972286083.png";
    public static String rutaImagenCorazon = "C:\\Users\\usuario\\Downloads\\pngocean.com (1).png";
    public static String rutaImagenMisil = "C:\\Users\\usuario\\Downloads\\pngwing.com.png";
    public static String rutaImagenAsteoride = "C:\\Users\\usuario\\Downloads\\pngocean.com (3).png";
    public static String rutaImagenNave = "C:\\Users\\usuario\\Downloads\\pngocean.com (2).png";
    public static String rutaImagenOjo = "C:\\Users\\usuario\\Downloads\\Captura.PNG";
    public static String rutamarcojuego = "C:\\Users\\usuario\\Downloads\\pngfind.com-marco-png-658701.png";
    public static String rutamarco2 = "C:\\Users\\usuario\\Downloads\\pngocean.com (5).png";

    public static String ejem = "C:\\Users\\usuario\\Desktop\\marco\\asd.jpg";

    public static int vidas = 5;

    public static JPanel crearPaneles(int ancho, int alto, Color color) {
        JPanel panel = new JPanel(null);
        panel.setPreferredSize(new Dimension(ancho, alto));
        panel.setBackground(color);
        return panel;
    }

    public static JLabel crearLabel(String imagen, int ancho, int alto, int x, int y, Color color) {
        //ImageIcon icon = new ImageIcon(rutaImagen);
        ImageIcon im = new ImageIcon(imagen);
        JLabel lbl = new JLabel();

        //Icon icono = newImageIcon();
        //lbl.setIcon(icon);
        lbl.setBounds(x, y, ancho, alto);

        lbl.setIcon(new ImageIcon(im.getImage().getScaledInstance(lbl.getWidth(), lbl.getHeight(), Image.SCALE_SMOOTH)));

        //lbl.setOpaque(true);
        //lbl.setBackground(color);
        return lbl;
    }

    public static JButton crearBotones(String texto, int ancho, int alto, int x, int y, Color color) {
        JButton boton = new JButton(texto);
        boton.setBounds(x, y, ancho, alto);
        boton.setBackground(color);
        return boton;
    }

    public static JPanel crearPanelesJuego(int x, int y, int ancho, int alto, Color color) {
        JPanel panel2 = new JPanel(null);
        panel2.setPreferredSize(new Dimension(ancho, alto));
        panel2.setLocation(new Point(x, y));
        panel2.setBackground(color);
        return panel2;
    }

    public static int generarNumeroAleatorio(int minimo, int maximo) {
        int num = (int) Math.floor(Math.random() * (maximo - minimo + 1) + (minimo));
        return num;
    }

    public static JButton eventoBoton(JFrame x, JButton boton) {

        ActionListener oyente = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                x.setVisible(true);
            }
        };
        boton.addActionListener(oyente);
        return null;
    }

    public static JTextField crearTexto(int ancho, int alto, int x, int y) {
        JTextField texto = new JTextField();
        texto.setBounds(x, y, ancho, alto);

//        while (true) {     
//            int i = 0;
//            jugador[i]= texto.setText("hola");
//            i++;
//        }
        return texto;

    }

    public static JButton crearBotonNave(String imagen, int ancho, int alto, int x, int y, Color color) {

        JButton boton = new JButton();
        boton.setBounds(x, y, ancho, alto);
        ImageIcon im = new ImageIcon(imagen);

        boton.setIcon(new ImageIcon(im.getImage().getScaledInstance(boton.getWidth(), boton.getHeight(), Image.SCALE_SMOOTH)));
        //lbl.setOpaque(true);
        //lbl.setBackground(color);
        return boton;
    }

    public static JLabel crearLabelTableroOp(String texto, int ancho, int alto, int x, int y, Color color) {
        //ImageIcon icon = new ImageIcon(rutaImagen);

        JLabel lbl = new JLabel();
        lbl.setText(texto);

        //Icon icono = newImageIcon();
        //lbl.setIcon(icon);
        lbl.setBounds(x, y, ancho, alto);

        lbl.setOpaque(true);
        lbl.setBackground(color);
        return lbl;
    }

}
