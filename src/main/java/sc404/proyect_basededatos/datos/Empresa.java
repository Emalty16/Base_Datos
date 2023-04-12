
package sc404.proyect_basededatos.datos;


public class Empresa {
    
    private int idCedJuridica;
    private String nombre;
    private String ubicacion;
    private String provincia;
    private String Canton;
    private int idActividad;

    public Empresa() {
    }

    public Empresa(int idCedJuridica, String nombre, String ubicacion, String provincia, String Canton, int idActividad) {
        this.idCedJuridica = idCedJuridica;
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.provincia = provincia;
        this.Canton = Canton;
        this.idActividad = idActividad;
    }

    public int getIdCedJuridica() {
        return idCedJuridica;
    }

    public void setIdCedJuridica(int idCedJuridica) {
        this.idCedJuridica = idCedJuridica;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getCanton() {
        return Canton;
    }

    public void setCanton(String Canton) {
        this.Canton = Canton;
    }

    public int getIdActividad() {
        return idActividad;
    }

    public void setIdActividad(int idActividad) {
        this.idActividad = idActividad;
    }
    
    
    
}
