/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import java.awt.Color;
import java.io.File;
import java.io.FileInputStream;
import java.util.StringTokenizer;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import procesos.ListaSimple;
import procesos.NodoLS;
import procesos.listaSimpleE;
import utiles.*;

/**
 *
 * @author Raudy
 */
public class Archivo {

    JFileChooser seleccionar = new JFileChooser();
    File archivo;
    FileInputStream entrada;
    private ListaSimple lista;
    private int id = 0;
    private String documento;
    
    private listaSimpleE listaS;

    public int fila;
    public int columna;
    public int valor;
    public String color;
    String temporal;
    public JButton btn;
    
    //JButton boton1;

    public Archivo() {
        this.lista = new ListaSimple();
    }

    public void leerArc(File archivo) {
        this.setDocumento("");
        try {
            entrada = new FileInputStream(archivo);
            int ascci;
            while ((ascci = entrada.read()) != -1) {
                char caracter = (char) ascci;
                setDocumento(getDocumento() + caracter);
            }
        } catch (Exception error) {
        }
        this.token(getDocumento());
    }

    public void token(String texto) {

        StringTokenizer token = new StringTokenizer(texto.toUpperCase());
        StringTokenizer temp;

        while (token.hasMoreElements()) {
            this.setId(this.getId() + 1);
            temporal = (String) token.nextElement();

            temp = new StringTokenizer(temporal, ",");
            fila = Integer.parseInt(temp.nextToken());
            columna = Integer.parseInt(temp.nextToken());
            valor = Integer.parseInt(temp.nextToken());
            color = temp.nextToken();
            btn=Utiles.botonTablero(fila, columna, 100, 100, String.valueOf(valor), color);
            //this.getLista().agregarFinal(new NodoLS(fila,columna, valor, color));
            
            //lista.agregarFinal(valor, color);
            
             //boton1 = Utiles.crearBotones("", 100, 100, fila, columna, Color.BLUE);
            
             //this.getListaS().agregarNodo(new NodoLS(getId(),fila, columna, valor, color,btn,true));
             
        }
    }

    public void abrirArchivo() {
        if (seleccionar.showDialog(null, "Abrir") == JFileChooser.APPROVE_OPTION) {
            archivo = seleccionar.getSelectedFile();
            if (archivo.canRead()) {
                if (archivo.getName().endsWith("txt")) {
                    leerArc(archivo);
                } else {
                    JOptionPane.showMessageDialog(null, "Archivo no compatible");
                }
            }
        }
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the documento
     */
    public String getDocumento() {
        return documento;
    }

    /**
     * @param documento the documento to set
     */
    public void setDocumento(String documento) {
        this.documento = documento;
    }

    /**
     * @return the lista
     */
    public ListaSimple getLista() {
        return lista;
    }

    /**
     * @param lista the lista to set
     */
    public void setLista(ListaSimple lista) {
        this.lista = lista;
    }

    /**
     * @return the listaS
     */
    public listaSimpleE getListaS() {
        return listaS;
    }

    /**
     * @param listaS the listaS to set
     */
    public void setListaS(listaSimpleE listaS) {
        this.listaS = listaS;
    }

}
