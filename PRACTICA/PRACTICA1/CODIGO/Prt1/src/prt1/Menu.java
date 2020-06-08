
package prt1;

import java.util.Scanner;

public class Menu {
    
    public boolean status;
    public Scanner lector;
    public int opcion ;
    
    public int ejemplo = 3;
    public int bandera = 0;
    
    
    public Menu() {
        
        this.status = false;
        this.lector = new Scanner(System.in);
        this.opcion = 0;
        
        inicioMenu();
        
    }
    
    public void inicioMenu(){
    
                
        do {
            System.out.println("Seleciona una opcion");
            System.out.println("1.Ir a menu principal");
            System.out.println("2.Iniciar juego");
            System.out.println("3.Mostrar reporte");
            System.out.println("4.Salir");
            
            opcion = this.lector.nextInt();
            
            switch(opcion){
                case 1:
                    principalMenu();
                    break;
                    
                case 2:
                    inicioGame();
                    break;
                    
                case 3:
                    mostrarRetort();
                    break;
                    
                case 4:
                    exit();
                    break;
                   
            }
        }while (!status);
    
    }
    
    public void inicioGame(){
        System.out.println("Se encuentra en la opcion 'menu Iniciar'");
        
    }

    public void principalMenu() {
        System.out.println("Se encuentra en la opcion de menu principal");
        
    }

    public void mostrarRetort() {
        System.out.println("Se encuentra en la opcion de Reporte");
    }

    public void exit() {
        System.exit(0);
    }
    
}
