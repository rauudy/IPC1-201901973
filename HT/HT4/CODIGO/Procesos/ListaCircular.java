/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Procesos;

import javax.swing.JOptionPane;

/**
 *
 * @author Raudy
 */
public class ListaCircular {

    NodoCircular cabeza;

    public void agregarNodo(NodoCircular aux) {

        if (this.cabeza == null) {
            cabeza = aux;
            cabeza.setSiguiente(cabeza);
        } else {
            NodoCircular temp = cabeza;
            do {
                temp = temp.getSiguiente();
            } while (temp.getSiguiente() != cabeza);
            temp.setSiguiente(aux);
            temp.getSiguiente().setSiguiente(cabeza);
        }
    }

    
    
    
    public void imprimirLista(){
        NodoCircular temp= cabeza;
        do{
            temp.imprimir();
            temp = temp.getSiguiente();
        }while(temp != cabeza);
    }
    
    public String imprimirGrafic(){
        String grafic = "digraph G {\n";
        NodoCircular temp = cabeza;
        
        do{
            grafic= grafic + temp.getId() + "[label=\"" + temp.getVal() +"\"]\n" ;
            grafic = grafic +temp.getId() + "->" + temp.getSiguiente().getId() + ";\n";
            temp = temp.getSiguiente();
        }while(temp != cabeza);
        
        grafic = grafic +"}";
        return grafic;
       
        }
    
    
    
    
}
