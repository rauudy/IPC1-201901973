
package hojatrabajo;

import java.util.Scanner;

public class Asignacion {
    
    int x;
    int y;
    int opcion;
    boolean estado=false;
    
    Scanner leer = new Scanner(System.in);
    Scanner leerNombre = new Scanner(System.in);
    Scanner leerCarnet = new Scanner(System.in);
    
    public Asignacion() {
       
        this.x = (int) (Math.random() * 40 + 1);
        this.y = (int) (Math.random() * 20 + 1);
        
        
        System.out.println("Ingresa tu nombre: ");
        String nombre = this.leerNombre.next();
        
        System.out.println("Ingresa tu carnet: ");
        int carnet = this.leerCarnet.nextInt();
        
    }
   
    public void menu(){
        
        System.out.println("Que seccion quieres asignarte");
        System.out.println("1. Seccion A");
        System.out.println("2. seccion B");
        
        opcion=this.leer.nextInt();
        
        
        
        do{
        switch(opcion){
                case 1:
                    if(x<15){
                        System.out.println("Puedes asignarte a la seccion A");
                            }
                    else{
                        System.out.println("No puedes asignarte, intenta en la otra seccion");
                        this.menu();
                    }
                    break;
                    
                case 2:
                    if(y<15){
                        System.out.println("Puedes asignarte a la seccion B");
                        }
                    else{
                        System.out.println("No puedes asignarte en la seccion b, intenta crear otra seccion");
                        }
                    break;
            }
        }while(estado) ;     
        
                
        
    
    }
}
