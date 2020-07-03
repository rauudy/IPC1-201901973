package interfaz;

import java.awt.Color;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import utiles.*;
import interfaz.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import javax.swing.JFileChooser;
import procesos.ListaSimple;
import procesos.listaSimpleE;
import static utiles.Utiles.jugador;

public class Tablero extends JFrame {

    public static JButton botonJugador = Utiles.crearBotones("", 100, 100, 20, 150, Color.BLACK);
    FrmListaS listaS = new FrmListaS();
    FrmListaD listaD = new FrmListaD();
    FrmListaC listaC = new FrmListaC();
    FrmPila pila = new FrmPila();
    FrmCola cola = new FrmCola();
    //Archivo ar = new Archivo();
    ListaSimple list;
    listaSimpleE listS;
    

    public Tablero(String title) throws HeadlessException {
        super(title);
        this.setVisible(true);
        this.setSize(800, 720);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);

        crearObjetos();

    }

    public void crearObjetos() {
        JPanel panelTablero = Utiles.crearPaneles(800, 700, Color.WHITE);

        JButton botonCargar = Utiles.crearBotones("Cargar Datos", 150, 30, 10, 10, Color.CYAN);
        panelTablero.add(botonCargar);

        ActionListener oyeCarga = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                //lerArc();
                
                Archivo ar = new Archivo();
                ar.abrirArchivo();
                listS = ar.getListaS();
                
                
            }
        };
        botonCargar.addActionListener(oyeCarga);

        JButton botonReiniciar = Utiles.crearBotones("Reiniciar", 150, 30, 10, 50, Color.CYAN);
        panelTablero.add(botonReiniciar);

        JButton botonListaCircular = Utiles.crearBotones("Lista Circular", 150, 30, 220, 28, Color.CYAN);
        Utiles.eventoBoton(listaC, botonListaCircular);
        panelTablero.add(botonListaCircular);

        JButton botonListaSimple = Utiles.crearBotones("Lista Simple", 150, 30, 400, 10, Color.CYAN);
        panelTablero.add(botonListaSimple);
        Utiles.eventoBoton(listaS, botonListaSimple);

        JButton botonListaDoble = Utiles.crearBotones("Lista Doble", 150, 30, 600, 10, Color.CYAN);
        Utiles.eventoBoton(listaD, botonListaDoble);
        panelTablero.add(botonListaDoble);

        JButton botonPila = Utiles.crearBotones("Pila", 150, 30, 400, 50, Color.CYAN);
        panelTablero.add(botonPila);
        Utiles.eventoBoton(pila, botonPila);

        JButton botonCola = Utiles.crearBotones("Cola", 150, 30, 600, 50, Color.CYAN);
        panelTablero.add(botonCola);
        Utiles.eventoBoton(cola, botonCola);

        panelTablero.add(botonJugador);

        jugador(botonJugador);

        add(panelTablero);
    }
    
    
//    public void lerArc(){
//        JFileChooser selector = new JFileChooser();
//        selector.setDialogTitle("Lectura de Archivo");
//        selector.setFileSelectionMode(0);
//        int opcion = selector.showOpenDialog(selector);
//        selector.setVisible(true);
//        File archivo = selector.getSelectedFile();
//        if (JFileChooser.APPROVE_OPTION == opcion) {
//            llenarLista(list, archivo);
//        }
//    
//    
//    }
    
//    public void llenarLista(ListaSimple lista, File archivo){
//        String linea;
//        
//        try {
//            FileReader lector = new FileReader(archivo);
//            BufferedReader buffer = new BufferedReader(lector);
//            linea = buffer.readLine();
//            
//            while (linea != null) {                
//                String ayuda[] = linea.split(",");
//                lista.agregarNodo(Integer.parseInt(ayuda[0]),Integer.parseInt(ayuda[1]), Integer.parseInt(ayuda[2]), ayuda[3]);
//                linea = buffer.readLine();
//            }
//            for (int i = 0; i < 10; i++) {
//                
//            }
//            
//            
//        } catch (Exception e) {
//        }
//        
//    }
    
    
    

}
