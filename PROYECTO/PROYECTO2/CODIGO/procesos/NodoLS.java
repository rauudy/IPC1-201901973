
package procesos;

import javax.swing.JButton;

public class NodoLS {
    private int id;
    private int fila;
    private int columna;
    private int valor;
    private String color;
    private NodoLS siguiente;
    JButton btn;
    Boolean mostrar;

    public NodoLS(int id, int fila, int columna, int valor, String color, JButton btn, Boolean mostar) {
        this.id = id;
        this.fila = fila;
        this.columna=columna;
        this.valor = valor;
        this.color=color ;
        this.btn=btn;
        this.mostrar=mostrar;
        this.siguiente = null;
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
    public NodoLS getSiguiente() {
        return siguiente;
    }

    /**
     * @param siguiente the siguiente to set
     */
    public void setSiguiente(NodoLS siguiente) {
        this.siguiente = siguiente;
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
    
    public void imprimirSiguiente(){
        if (this.siguiente == null) {
            System.out.println("No hay siguiente");
        }else{
            //this.siguiente.imprimir();
        }
    }
    
    
}
