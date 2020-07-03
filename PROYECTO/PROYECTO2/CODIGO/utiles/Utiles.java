/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utiles;

import static interfaz.Tablero.botonJugador;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.Point;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import procesos.ListaSimple;

/**
 *
 * @author Raudy
 */
public class Utiles {

    public static String tabl = "C:\\Users\\usuario\\Desktop\\tablero.jpg";
    ListaSimple list;

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

        return texto;

    }

    public static JButton crearBotonNave(String imagen, int ancho, int alto, int x, int y, Color color) {

        JButton boton = new JButton();
        boton.setBounds(x, y, ancho, alto);
        ImageIcon im = new ImageIcon(imagen);

        boton.setIcon(new ImageIcon(im.getImage().getScaledInstance(boton.getWidth(), boton.getHeight(), Image.SCALE_SMOOTH)));
        //boton.setOpaque(true);
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

    public static JButton eventoBotonIniciar(JFrame x, JButton boton) {
        String name = JOptionPane.showInputDialog("escribe tu nombre");
        JOptionPane.showMessageDialog(null, "Hello " + name);
        ActionListener oyente = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                x.setVisible(true);
            }
        };
        boton.addActionListener(oyente);
        return null;
    }

    public static JTextArea txtArea(JTextArea areaTxt) {
        areaTxt.setBounds(300, 300, 20, 20);

        return null;

    }

    public static void jugador(JButton botonJugador) {

        botonJugador.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {

            }
        });

        botonJugador.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                //System.out.println("Typed");
            }

            @Override
            public void keyPressed(KeyEvent e) {
                //System.out.println("Pressend");
            }

            @Override
            public void keyReleased(KeyEvent e) {

                switch (e.getKeyCode()) {

                    case 37: //left

                        if (botonJugador.getX() > 20) {
                            botonJugador.setBounds(botonJugador.getX() - 100, botonJugador.getY(), botonJugador.getWidth(), botonJugador.getHeight());
                        } else {
                            botonJugador.setBounds(botonJugador.getX() + 0, botonJugador.getY(), botonJugador.getWidth(), botonJugador.getHeight());
                        }
                        ;

                        break;
                    case 38: //up

                        if (botonJugador.getY() <= 200) {
                            botonJugador.setBounds(botonJugador.getX(), botonJugador.getY() + 0, botonJugador.getWidth(), botonJugador.getHeight());
                        } else {
                            botonJugador.setBounds(botonJugador.getX(), botonJugador.getY() - 100, botonJugador.getWidth(), botonJugador.getHeight());
                        }
                        ;

                        break;
                    case 39: //right

                        if (botonJugador.getX() < 620) {
                            botonJugador.setBounds(botonJugador.getX() + 100, botonJugador.getY(), botonJugador.getWidth(), botonJugador.getHeight());
                        } else {
                            botonJugador.setBounds(botonJugador.getX() + 0, botonJugador.getY(), botonJugador.getWidth(), botonJugador.getHeight());
                        }
                        ;

                        break;
                    case 40: //down

                        if (botonJugador.getY() >= 550) {
                            botonJugador.setBounds(botonJugador.getX(), botonJugador.getY() + 0, botonJugador.getWidth(), botonJugador.getHeight());
                        } else {
                            botonJugador.setBounds(botonJugador.getX(), botonJugador.getY() + 100, botonJugador.getWidth(), botonJugador.getHeight());
                        }
                        ;

                        break;

                }

            }
        });

    }

    public static Color regresarColor(String clr) {
        Color col = null;
        switch (clr) {
            case "AZUL":
                col = Color.BLUE;
                break;
            case "ROJO":
                col = Color.RED;
                break;
            case "AMARILLO":
                col = Color.YELLOW;
                break;
            case "VERDE":
                col = Color.GREEN;
                break;
        }
        return col;
    }

    public static JButton botonTablero(int x, int y, int ancho, int alto, String texto, String color) {
        JButton btn = new JButton(texto);
        btn.setFont(new Font("Arial", 10, 10));
        btn.setBounds(20 + x * 100, 150 + y * 100, ancho, alto);
        btn.setBackground(Utiles.regresarColor(color));
        btn.setVisible(true);
        return btn;
    }
    
    
    
    public void lerArc(){
        JFileChooser selector = new JFileChooser();
        selector.setDialogTitle("Lectura de Archivo");
        selector.setFileSelectionMode(0);
        int opcion = selector.showOpenDialog(selector);
        selector.setVisible(true);
        File archivo = selector.getSelectedFile();
        if (JFileChooser.APPROVE_OPTION == opcion) {
            llenarLista(list, archivo);
        }
    
    
    }
    
    public void llenarLista(ListaSimple lista, File archivo){
        String linea;
        
        try {
            FileReader lector = new FileReader(archivo);
            BufferedReader buffer = new BufferedReader(lector);
            linea = buffer.readLine();
            
            while (linea != null) {                
                String ayuda[] = linea.split(",");
                //lista.agregarNodo(Integer.parseInt(ayuda[0]),Integer.parseInt(ayuda[1]), Integer.parseInt(ayuda[2]), ayuda[3]);
                linea = buffer.readLine();
            }
            
            
        } catch (Exception e) {
        }
        
    }
    

}
