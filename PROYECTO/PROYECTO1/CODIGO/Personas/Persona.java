
package Personas;

public class Persona {
    
    private String nombres;
    private String apellidos;
    private String dpi;
    private String telefono;
    private String valorVehiculo;

    public Persona(String nombres, String apellidos, String dpi, String telefono, String valorVehiculo) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.dpi = dpi;
        this.telefono = telefono;
        this.valorVehiculo = valorVehiculo;
    }

    /**
     * @return the nombres
     */
    public String getNombres() {
        return nombres;
    }

    /**
     * @param nombres the nombres to set
     */
    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    /**
     * @return the apellidos
     */
    public String getApellidos() {
        return apellidos;
    }

    /**
     * @param apellidos the apellidos to set
     */
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    /**
     * @return the dpi
     */
    public String getDpi() {
        return dpi;
    }

    /**
     * @param dpi the dpi to set
     */
    public void setDpi(String dpi) {
        this.dpi = dpi;
    }

    /**
     * @return the telefono
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * @param telefono the telefono to set
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     * @return the valorVehiculo
     */
    public String getValorVehiculo() {
        return valorVehiculo;
    }

    /**
     * @param valorVehiculo the valorVehiculo to set
     */
    public void setValorVehiculo(String valorVehiculo) {
        this.valorVehiculo = valorVehiculo;
    }
    
    
    
}
