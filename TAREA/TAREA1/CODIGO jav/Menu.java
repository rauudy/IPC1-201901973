package tarea1;

import java.util.Scanner;

public class Menu {

    Scanner leerNombre = new Scanner(System.in);
    Scanner leerCarnet = new Scanner(System.in);
    Scanner leerApellido = new Scanner(System.in);
    Scanner leer = new Scanner(System.in);
    int opcion;
    boolean estado = false;
    String nombre;
    String apellido;
    int carnet;

    public Menu() {

        System.out.println("-Ingresa tu primer nombre: ");
        this.nombre = this.leerNombre.next();
        
        System.out.println("-Ingresa tu primer apellido: ");
        this.apellido = this.leerApellido.next();
        
        System.out.println("-Ingresa tu carnet: ");
        this.carnet = this.leerCarnet.nextInt();

        eleccion();
    }

    public void eleccion() {

        System.out.println("---> Que seccion quieres asignarte: ");
        System.out.println("1. Seccion A");
        System.out.println("2. seccion B");

        opcion = this.leer.nextInt();

        do {
            switch (opcion) {
                case 1:
                    System.out.println("-- Puedes asignarte a la seccion A!");
                    System.out.println("-- Los asignados a la seccion A son:");
                    SeccionA secA = new SeccionA();

                    System.out.println(this.nombre + " "+this.apellido +" " + this.carnet);

                    break;

                case 2:

                    System.out.println("-- No puedes asignarte a la seccion B, esta llena!");
                    System.out.println("-- Los asignados a la seccion B son:");
                    SeccionB secB = new SeccionB();
                    System.out.println("--> Intenta en otra seccion.");

                    eleccion();
                    break;
                    
                default:System.out.println("X Ingresa una opcion valida! X");
                eleccion();
            }

        } while (estado);

    }
}
