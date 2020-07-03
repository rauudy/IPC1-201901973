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
public class Pila {
    
    public int contador = 0;
    public nodoPila ultimo;
    
    public void push(nodoPila aux){
        aux.setId(contador++);
        if (ultimo == null) {
            ultimo = aux;
        }else{
            aux.setAnterior(ultimo);
            ultimo = aux;
            
        }
    }
    
    public void pop(){
        if (ultimo == null) {
            System.out.println("No podes sacar nada");
        }else{
            ultimo.imprimir();
            ultimo = ultimo.getAnterior();
            
        }
    }
    
    public void imprimirPila(){
        nodoPila temp = ultimo;
        while (temp != null) {        
            temp.imprimir();
            temp = temp.getAnterior();
        }
    }
    
}
