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
public class nodoListaCDE {
    
    int fila;
    int columna;
    int valor;
    String color;
    nodoListaCDE siguiente;
    nodoListaCDE anterior;

    public nodoListaCDE(int fila, int columna, int valor, String color) {
        this.fila = fila;
        this.columna = columna;
        this.valor = valor;
        this.color = color;
        this.siguiente = null;
        this.anterior = null;
    }

    
    
    
    
}
