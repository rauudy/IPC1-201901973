package hojatrabajo2;

public class HojaTrabajo2 {

    public static void main(String[] args) {
        
        Control miControl = new Control();
        
        miControl.getCarroLujoso().avanzar();
        miControl.getCarroLujoso().frenar();
        
        miControl.getCarroNormal().avanzar();
        miControl.getCarroNormal().frenar();
        
        miControl.getAvionPrivado().avanzar();
        miControl.getAvionPrivado().frenar();
        
        miControl.getAvionComercial().avanzar();
        miControl.getAvionComercial().frenar();
        
        miControl.getCaballoCarreras().avanzar();
        miControl.getCaballoCarreras().frenar();
        
        miControl.getCaballoCarga().avanzar();
        miControl.getCaballoCarga().frenar();
        
        
        
        
        

    }

}
