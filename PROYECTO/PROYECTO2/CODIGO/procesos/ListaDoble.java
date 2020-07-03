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
public class ListaDoble {
    
    nodoDoble primero;
    nodoDoble ultimo;
    
    public ListaDoble() {
        primero= null;
        ultimo = null;
        
        
    }
    
    public void ingresarNodo(int fila, int columna, int valor, String color){
        nodoDoble nuevo = new nodoDoble();
        nuevo.fila=fila;
        nuevo.columna=columna;
        nuevo.valor=valor;
        nuevo.color=color;
        
        if (primero == null) {
            primero = nuevo;
            primero.siguiente= null;
            primero.anterior=null;
            ultimo = primero;
        } else {
            ultimo.siguiente = nuevo;
            nuevo.anterior = ultimo;
            nuevo.siguiente = null;
            ultimo= nuevo;
        }
        
    }
    
    public void desplegarLista(){
        nodoDoble actual = new nodoDoble();
        actual = ultimo;
        while (actual != null) {            
            System.out.println(actual.valor+ " "+actual.color );
            actual = actual.anterior;
        }
        
        
    }
    
    
    
    
    
    
//
////    private nodoDoble primero;
////    private nodoDoble ultimo;
////    private int numElem;
////
////    public ListaDoble() {
////        ultimo = null;
////        primero = null;
////        numElem = 0;
////    }
////
////    public void insertar(int fila, int columna, int valor, String color) {
////        nodoDoble nuevo = new nodoDoble(fila, columna, valor, color);
////        //Insertar primer elemento de la lista
////
////        if (primero == null) {
////            primero = nuevo;
////            ultimo = nuevo;
////
////        } //Insertar Segundo Elemento
////        else if (primero.getSiguiente()== null) {
////            //orden ascendente puntero primero
////            if (primero.getFila()< fila) {
////                primero.setSiguiente(nuevo);
////            } else {
////                nuevo.setSiguiente(primero);
////                primero = nuevo;
////            }
////            //orden descendente puntero último
////            if (ultimo.getColumna()> columna) {
////                ultimo.setAnterior(nuevo);
////
////            } else {
////                nuevo.setAnterior(ultimo);
////                ultimo = nuevo;
////            }
////            if (ultimo.getValor()> valor) {
////                ultimo.setAnterior(nuevo);
////
////            } else {
////                nuevo.setAnterior(ultimo);
////                ultimo = nuevo;
////            }
////            if (ultimo.getColumna()> columna) {
////                ultimo.setAnterior(nuevo);
////
////            } else {
////                nuevo.setAnterior(ultimo);
////                ultimo = nuevo;
////            }
////        } //insertar elementos sucesivos
////        else {
////
////            nodoDoble actual = primero;
////            //como primer elemento ascendente
////            if (primero.getElemento1() > elem1) {
////                nuevo.setSig(primero);
////                primero = nuevo;
////            } else {
////                while (actual.getSig() != null) {
////
////                    if (actual.getSig().getElemento1() > elem1) {
////                        nuevo.setSig(actual.getSig());
////
////                        actual.setSig(nuevo);
////
////                        actual = nuevo.getSig();
////
////                    } else {
////                        actual = actual.getSig();
////                    }
////                }
////                //como ultimo elemento Ascendente
////                if (actual.getSig() == null && actual.getElemento1() < elem1) {
////                    actual.setSig(nuevo);
////                }
////            }
////            actual = ultimo;
////            // Como primer elemento Descendente
////            if (ultimo.getElemento2() < elem2) {
////                nuevo.setAnt(ultimo);
////                ultimo = nuevo;
////            } else {
////                while (actual.getAnt() != null) {
////
////                    if (actual.getAnt().getElemento2() < elem2) {
////                        nuevo.setAnt(actual.getAnt());
////                        actual.setAnt(nuevo);
////                        actual = nuevo.getAnt();
////
////                    } else {
////                        actual = actual.getAnt();
////                    }
////                }
////                //como ultimo elementoDescendente
////                if (actual.getAnt() == null && actual.getElemento2() > elem2) {
////                    actual.setAnt(nuevo);
////
////                }
////            }
////        }
////    }
////
////    public void listar() {
////        nodoDoble actual = primero;
////
////        System.out.println("Listar desde primero");
////        while (actual.getSig() != null) {
////            System.out.println(actual.getElemento1() + "--" + actual.getElemento2());
////            actual = actual.getSig();
////
////        }
////        System.out.println(actual.getElemento1() + "--" + actual.getElemento2());
////
////        actual = ultimo;
////        System.out.println("Listar desde ultimo");
////
////        while (actual.getAnt() != null) {
////            System.out.println(actual.getElemento1() + "--" + actual.getElemento2());
////            actual = actual.getAnt();
////
////        }
////        System.out.println(actual.getElemento1() + "--" + actual.getElemento2());
////
////    }

    
}
