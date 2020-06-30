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
public class NodoCircular {
    
    private int id;
    private String val;
    private NodoCircular siguiente;

    public NodoCircular(int id, String val) {
        this.id = id;
        this.val = val;
        siguiente = this;
    }

    public void imprimir() {
        System.out.println("id: " + getId() + "\n valor: " + getVal());
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
     * @return the val
     */
    public String getVal() {
        return val;
    }

    /**
     * @param val the val to set
     */
    public void setVal(String val) {
        this.val = val;
    }

    /**
     * @return the siguiente
     */
    public NodoCircular getSiguiente() {
        return siguiente;
    }

    /**
     * @param siguiente the siguiente to set
     */
    public void setSiguiente(NodoCircular siguiente) {
        this.siguiente = siguiente;
    }

    public void imprimirSiguiente() {
        if (this.siguiente == null) {
            System.out.println("No hay siguiente :c ");
        } else{
            this.imprimir();
        }

    }

}

