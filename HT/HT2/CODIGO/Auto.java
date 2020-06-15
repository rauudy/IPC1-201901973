
package hojatrabajo2;

public class Auto implements Transporte {
    private String marca;
    private int modelo;
    private String tipo;

    public Auto(String marca, int modelo, String tipo) {
        this.marca = marca;
        this.modelo = modelo;
        this.tipo = tipo;
    }
    
    @Override
    public void avanzar() {
        System.out.println("AVANCE-AUTO-" + this.getMarca() + "-" + this.getModelo()
        + "-" + this.getTipo());
        
    }

    @Override
    public void frenar() {
        System.out.println("FRENE-AUTO-" + this.getMarca() + "-" + this.getModelo()
        + "-" + this.getTipo());
        
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
    public int getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    /**
     * @return the tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    
    
}
