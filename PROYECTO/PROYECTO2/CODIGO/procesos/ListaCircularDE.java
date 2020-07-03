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
public class ListaCircularDE {

    int tam = 0;
    nodoListaCDE inicio;
    nodoListaCDE fin;

    public boolean vacia() {
        return (tam == 0);
    }

    public void insertar_inicio(int fila, int columna, int valor, String color) {
        nodoListaCDE nuevo = new nodoListaCDE(fila, columna, valor, color);

        if (vacia()) {
            inicio = nuevo;
            fin = nuevo;

            inicio.siguiente = fin;
            fin.siguiente = inicio;
            inicio.anterior = fin;
            fin.anterior = inicio;

            tam++;
        } else {
            nodoListaCDE aux = inicio;
            nuevo.siguiente = aux;
            aux.anterior = nuevo;

            inicio = nuevo;

            tam++;
        }

    }

    public void insertar_final(int fila, int columna, int valor, String color) {
        nodoListaCDE nuevo = new nodoListaCDE(fila, columna, valor, color);

        if (vacia()) {
            inicio = nuevo;
            fin = nuevo;

            inicio.siguiente = fin;
            fin.siguiente = inicio;
            inicio.anterior = fin;
            fin.anterior = inicio;

            tam++;
        } else {
            nodoListaCDE aux = fin;

            aux.siguiente = nuevo;
            nuevo.anterior = aux;

            fin = nuevo;

            tam++;
        }

    }

    public void tamanio() {
        System.out.println("<-----" + tam + "---->");
    }

    public void mostrar_elementos() {
        if (!vacia()) {
            nodoListaCDE aux = inicio;

            for (int i = 0; i < tam; i++) {
                System.out.println(aux.valor + " " + aux.color + " ");
                aux = aux.siguiente;
            }
        } else {
            System.out.println("<------ la lista esta vacia ------>");
        }
    }

    public void buscar_modificar(int pos, int fila, int columna, int valor, String color) {
        if (!vacia()) {
            System.out.println("<------- la lista esta vacia ------>");
        } else {
            if (pos == 0) {
                inicio.fila = fila;
                inicio.columna = columna;
                inicio.valor = valor;
                inicio.color = color;
            } else {
                if (pos > 0 && pos < tam) {
                    nodoListaCDE aux = inicio;
                    for (int i = 0; i < tam - 1; i++) {
                        if (i == pos - 1) {
                            nodoListaCDE mod = aux.siguiente;
                            mod.fila = fila;
                            mod.columna = columna;
                            mod.valor = valor;
                            mod.color = color;

                            aux.siguiente = mod;
                        } else {
                            aux = aux.siguiente;
                        }
                    }
                }else{
                    System.out.println("<--------- la posicion ingresada no existe ----->");
                }
            }
        }
    }

}
