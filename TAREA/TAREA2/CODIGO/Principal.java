
package tarea2;

public class Principal {

    public static void main(String[] args) {

        Controlador realizarPruebas = new Controlador();
        realizarPruebas.getAvionComercial().avanzar();
        realizarPruebas.getAvionComercial().frenar();
        
        realizarPruebas.getAvionPrivado().avanzar();
        realizarPruebas.getAvionPrivado().frenar();
        
        realizarPruebas.getCaballoCarga().avanzar();
        realizarPruebas.getCaballoCarga().frenar();
        
        realizarPruebas.getCaballoMascota().avanzar();
        realizarPruebas.getCaballoMascota().frenar();
        
        realizarPruebas.getCarroLujo().avanzar();
        realizarPruebas.getCarroLujo().frenar();
        
        realizarPruebas.getCarroRegular().avanzar();
        realizarPruebas.getCarroRegular().frenar();
    }
    
}
