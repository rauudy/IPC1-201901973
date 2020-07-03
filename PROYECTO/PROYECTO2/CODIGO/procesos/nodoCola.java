/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package procesos;

/**
 *
 * @author Raudy
 */
public class nodoCola {

 

    private int id;
    private int fila;
    private int columna;
    private int valor;
    private String color;
    private nodoCola siguiente;

    public nodoCola(int fila, int columna, int valor, String color) {
        this.fila = fila;
        this.columna = columna;
        this.valor = valor;
        this.color = color;
    }

    public void imprimir() {
        System.out.println(this.valor);
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
     * @return the fila
     */
    public int getFila() {
        return fila;
    }

    /**
     * @param fila the fila to set
     */
    public void setFila(int fila) {
        this.fila = fila;
    }

    /**
     * @return the columna
     */
    public int getColumna() {
        return columna;
    }

    /**
     * @param columna the columna to set
     */
    public void setColumna(int columna) {
        this.columna = columna;
    }

    /**
     * @return the valor
     */
    public int getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(int valor) {
        this.valor = valor;
    }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }
    
       /**
     * @return the siguiente
     */
    public nodoCola getSiguiente() {
        return siguiente;
    }

    /**
     * @param siguiente the siguiente to set
     */
    public void setSiguiente(nodoCola siguiente) {
        this.siguiente = siguiente;
    }


}
