/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package procesos;

import javax.swing.JOptionPane;

/**
 *
 * @author Raudy
 */
public class listaSimpleE {

    private NodoLS cabeza;

    public void agregarNodo(NodoLS aux) {
        if (this.getCabeza() == null) {
            setCabeza(aux);
            getCabeza().setSiguiente(null);
        } else {
            NodoLS temp = getCabeza();
            while (temp.getSiguiente() != null) {
                temp = temp.getSiguiente();
            }
            temp.setSiguiente(aux);
            temp.getSiguiente().setSiguiente(null);
        }
    }

    public void modificarNodo(NodoLS aux) {
        if (this.getCabeza() == null) {
            JOptionPane.showMessageDialog(null, "No hay datos");
        } else {
            NodoLS temp = getCabeza();
            while (temp.getSiguiente() != null) {
                if (temp.getId() == aux.getId()) {
                    temp.setValor(aux.getValor());
                    return;
                } else {
                    temp = temp.getSiguiente();
                }
            }
            if (temp.getSiguiente() == null) {
                if (temp.getId() == aux.getId()) {
                    temp.setValor(aux.getValor());
                    return;
                }
            }
            //
        }

    }

    public void imprimirLista() {
        NodoLS temp = getCabeza();
        do {
            temp.imprimirSiguiente();
            temp = temp.getSiguiente();
        } while (temp != null);
    }

    public String imprimirGraphic() {
        String graphic = "digraph G {\n";
        NodoLS temp = getCabeza();
        while (temp != null) {
            graphic = graphic + temp.getId() + "[label=\"" + temp.getValor() + ","
                    + temp.getColor() + "\", fillcolor=\"" + temp.getColor() + "\",style=filled]\n";
            if (temp.getSiguiente() != null) {
                graphic = graphic + temp.getId() + "->" +temp.getSiguiente().getId() + ";\n";
            }
            temp= temp.getSiguiente();
        }
        graphic = graphic + "}";
        return graphic;

    }

    public void setCabeza(NodoLS cabeza) {
        this.cabeza = cabeza;
    }

    public NodoLS getCabeza() {
        return cabeza;
    }

}
