
package tarea1;

public class SeccionA {

    String [] nombresA = new String[4];
    int [] carnetA = new int [4];
    
    public SeccionA() {
               
        llenarSeccionA();
        mostrarSeccionA();
        
        
    }
    
    public void llenarSeccionA(){
        
        nombresA[0] = "David  Domingo" ;
        nombresA[1] = "Jennifer Palacios" ;
        nombresA[2] = "Venus  Contreras" ;
        nombresA[3] = "Luis Gonzales" ;
        
        carnetA[0] = 201901536 ;
        carnetA[1] =  201503622;
        carnetA[2] =  201802356;
        carnetA[3] = 201901236 ;
    
    }
    
    
    public void mostrarSeccionA(){
        int posicion;
        for( posicion=0; posicion<4; posicion++){
            System.out.println(nombresA[posicion]+" " + carnetA[posicion]);
        }
               
    }
    
    
    
}
