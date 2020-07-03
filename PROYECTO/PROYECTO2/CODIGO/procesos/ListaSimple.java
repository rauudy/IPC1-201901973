package procesos;

import javax.swing.JButton;

public class ListaSimple {

    private NodoLS cabeza;
    private int taman;
    int cont=0;

    public ListaSimple() {
        this.cabeza = null;
        this.taman = 0;
    }

    public boolean vacio() {
        return cabeza == null;
    }
    
    
    
    

//    public void agregarNodo(int fila, int columna, int valor, String color) {
//       NodoLS nuevo = new NodoLS(fila,columna,valor,color);
//        nuevo.setValor(valor);
//        nuevo.setColor(color);
//        if (vacio()) {
//            setCabeza(nuevo);
//        } else {
//            NodoLS aux = getCabeza();
//            while (aux.getSiguiente() != null) {
//                aux = aux.getSiguiente();
//            }
//            aux.setSiguiente(nuevo);
//        }
//        setTaman(getTaman() + 1);
//    }
    public void agregarBloque(int fila, int columna, int valor, String color, JButton btn, Boolean mostrar){
        NodoLS nuevo = new NodoLS(cont,fila, columna, valor, color, btn, mostrar);
        nuevo.setFila(fila);
        nuevo.setColumna(columna);
        nuevo.setValor(valor);
        nuevo.setColor(color);
        
        if (vacio()) {
            setCabeza(nuevo);
        }else{
            NodoLS aux = getCabeza();
            
            while (aux.getSiguiente()!= null) {                
                aux = aux.getSiguiente();
            }
            aux.setSiguiente(nuevo);
        }
    }
    public String imprimirGrafic() {
        String grafic = "digraph G {\n";
        NodoLS temp = cabeza;

        do {
            grafic = grafic + temp.getId() + "[label=\"" + temp.getValor() + "\"]\n";
            grafic = grafic + temp.getId() + "->" + temp.getSiguiente().getId() + ";\n";
            temp = temp.getSiguiente();
        } while (temp != null);

        grafic = grafic + "}";
        return grafic;

    }

    /**
     * @return the cabeza
     */
    public NodoLS getCabeza() {
        return cabeza;
    }

    /**
     * @param cabeza the cabeza to set
     */
    public void setCabeza(NodoLS cabeza) {
        this.cabeza = cabeza;
    }

    /**
     * @return the taman
     */
    public int getTaman() {
        return taman;
    }

    /**
     * @param taman the taman to set
     */
    public void setTaman(int taman) {
        this.taman = taman;
    }
}
