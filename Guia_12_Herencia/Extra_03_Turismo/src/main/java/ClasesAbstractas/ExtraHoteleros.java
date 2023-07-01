/*

 */
package ClasesAbstractas;

public abstract class ExtraHoteleros extends Alojamiento {
    protected boolean privacidad;
    protected double metrosCuadrados;

    public ExtraHoteleros() {
    }

    public ExtraHoteleros(boolean privacidad, double metrosCuadrados, String nombre, String direccion, String localidad, String gerente) {
        super(nombre, direccion, localidad, gerente);
        this.privacidad = privacidad;
        this.metrosCuadrados = metrosCuadrados;
    }

    public boolean isPrivacidad() {
        return privacidad;
    }

    public void setPrivacidad(boolean privacidad) {
        this.privacidad = privacidad;
    }

    public double getMetrosCuadrados() {
        return metrosCuadrados;
    }

    public void setMetrosCuadrados(double metrosCuadrados) {
        this.metrosCuadrados = metrosCuadrados;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getGerente() {
        return gerente;
    }

    public void setGerente(String gerente) {
        this.gerente = gerente;
    }

    @Override
    public String toString() {
        String priv;
        if(isPrivacidad()){
             priv = "Privado";
        }else{
            priv = "Publico";
        }
        
        return "[ Nombre: " + nombre + "Localidad: " + localidad + "Privacidad: " + priv + " ]";
    }

    
    
    
    
}
