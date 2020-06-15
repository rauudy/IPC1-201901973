package hojatrabajo2;

public class Avion implements Transporte {

    private int pasajeros;
    private String marca;
    private String modelo;

    public Avion(int pasajeros, String marca, String modelo) {
        this.pasajeros = pasajeros;
        this.marca = marca;
        this.modelo = modelo;
    }
    

    @Override
    public void avanzar() {
        System.out.println("AVANCE-AVION-" + this.getPasajeros() + "-"
                + this.getMarca() + "-" + this.getModelo());
    }

    @Override
    public void frenar() {
        System.out.println("FRENE-AVION-" + this.getPasajeros() + "-"
                + this.getMarca() + "-" + this.getModelo());
    }

    /**
     * @return the pasajeros
     */
    public int getPasajeros() {
        return pasajeros;
    }

    /**
     * @param pasajeros the pasajeros to set
     */
    public void setPasajeros(int pasajeros) {
        this.pasajeros = pasajeros;
    }

    /**
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * @return the modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

}
