
package hojatrabajo2;

public class Control {
    
    private Auto carroLujoso;
    private Auto carroNormal;
    
    private Avion avionPrivado;
    private Avion avionComercial;
    
    private Caballo caballoCarreras;
    private Caballo caballoCarga;

    public Control() {
        
        this.carroLujoso = new Auto("Lamborghini",2020,"Sedan");
        this.carroNormal = new Auto("Suzuki",2000,"Sedan");
        
        this.avionPrivado = new Avion(10,"Bombardier","8000");
        this.avionComercial = new Avion(250,"McDonnell Douglas","MD-80");
        
        this.caballoCarreras = new Caballo("Tupac","Arabe",2);
        this.caballoCarga = new Caballo("Burrius","Catalan",3);
        
        
    }

    /**
     * @return the carroLujoso
     */
    public Auto getCarroLujoso() {
        return carroLujoso;
    }

    /**
     * @param carroLujoso the carroLujoso to set
     */
    public void setCarroLujoso(Auto carroLujoso) {
        this.carroLujoso = carroLujoso;
    }

    /**
     * @return the carroNormal
     */
    public Auto getCarroNormal() {
        return carroNormal;
    }

    /**
     * @param carroNormal the carroNormal to set
     */
    public void setCarroNormal(Auto carroNormal) {
        this.carroNormal = carroNormal;
    }

    /**
     * @return the avionPrivado
     */
    public Avion getAvionPrivado() {
        return avionPrivado;
    }

    /**
     * @param avionPrivado the avionPrivado to set
     */
    public void setAvionPrivado(Avion avionPrivado) {
        this.avionPrivado = avionPrivado;
    }

    /**
     * @return the avionComercial
     */
    public Avion getAvionComercial() {
        return avionComercial;
    }

    /**
     * @param avionComercial the avionComercial to set
     */
    public void setAvionComercial(Avion avionComercial) {
        this.avionComercial = avionComercial;
    }

    /**
     * @return the caballoCarreras
     */
    public Caballo getCaballoCarreras() {
        return caballoCarreras;
    }

    /**
     * @param caballoCarreras the caballoCarreras to set
     */
    public void setCaballoCarreras(Caballo caballoCarreras) {
        this.caballoCarreras = caballoCarreras;
    }

    /**
     * @return the caballoCarga
     */
    public Caballo getCaballoCarga() {
        return caballoCarga;
    }

    /**
     * @param caballoCarga the caballoCarga to set
     */
    public void setCaballoCarga(Caballo caballoCarga) {
        this.caballoCarga = caballoCarga;
    }
    
    
    
    
}
