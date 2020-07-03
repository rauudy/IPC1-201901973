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
public class Cola {

    nodoCola primero;
    int contador =0;

    public void encolar(nodoCola aux) {
        aux.setId(contador++);
        if (primero == null) {
            primero = aux;
        } else {
            nodoCola temp = primero;
            while (temp.getSiguiente() != null) {
                temp = temp.getSiguiente();
            }
            temp.setSiguiente(aux);

        }
    }

    public void desencolar() {
        if (primero == null) {
            System.out.println("No hay valores");
        } else {
            primero.imprimir();
            primero = primero.getSiguiente();
         }
    }
    
    public void imprimirCola(){
        nodoCola temp = primero;
        while (temp != null) {        
            temp.imprimir();
            temp = temp.getSiguiente();
        }
    }

}
