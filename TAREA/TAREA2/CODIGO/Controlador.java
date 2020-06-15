package tarea2;

public class Controlador {

    private Avion avionComercial;
    private Avion avionPrivado;

    private Caballo caballoCarga;
    private Caballo caballoMascota;

    private Coche carroLujo;
    private Coche carroRegular;

    public Controlador() {

        this.avionComercial = new Avion(500, "Airbus", "B20");
        this.avionPrivado = new Avion(8, "Airbus Especial", "F15");

        this.caballoCarga = new Caballo("Abduzcan", "Frizone", 5);
        this.caballoMascota = new Caballo("Tupac II", "Español", 6);

        this.carroLujo = new Coche("Lexus", 2020, "Sedan");
        this.carroRegular = new Coche("Toyota", 1997, "Sedan");

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

    /**
     * @return the caballoMascota
     */
    public Caballo getCaballoMascota() {
        return caballoMascota;
    }

    /**
     * @param caballoMascota the caballoMascota to set
     */
    public void setCaballoMascota(Caballo caballoMascota) {
        this.caballoMascota = caballoMascota;
    }

    /**
     * @return the carroLujo
     */
    public Coche getCarroLujo() {
        return carroLujo;
    }

    /**
     * @param carroLujo the carroLujo to set
     */
    public void setCarroLujo(Coche carroLujo) {
        this.carroLujo = carroLujo;
    }

    /**
     * @return the carroRegular
     */
    public Coche getCarroRegular() {
        return carroRegular;
    }

    /**
     * @param carroRegular the carroRegular to set
     */
    public void setCarroRegular(Coche carroRegular) {
        this.carroRegular = carroRegular;
    }

}
