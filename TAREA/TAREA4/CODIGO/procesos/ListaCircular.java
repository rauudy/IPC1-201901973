
package procesos;

import javax.swing.JOptionPane;

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

    
    public void modificarNodo(NodoCircular aux){
        if (this.cabeza==null) {
            JOptionPane.showMessageDialog(null, "No hay valor");
        }else{
            NodoCircular temp = cabeza;
            
            while (temp.getSiguiente() != cabeza) {
                if (temp.getId() == aux.getId()) {
                    temp.setVal(aux.getVal());
                    return;
                }else{
                    temp = temp.getSiguiente();
                }
                
            }
            
            if(temp.getSiguiente() == cabeza){
                if (temp.getId() == aux.getId()) {
                    temp.setVal(aux.getVal());
                    return;
                }
            }
        
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
