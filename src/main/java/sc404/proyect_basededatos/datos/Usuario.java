package sc404.proyect_basededatos.datos;

/**
 * * * @author usuario
 */
public class Usuario {

    private String CorreoUsuario;
    private int cedula;
    private String nombre;
    private String apellido;
    private String vivienda;
    private String contrasena;

    public Usuario() {
    }

    public Usuario(String CorreoUsuario, int cedula, String nombre, String apellido, String vivienda, String contrasena) {
        this.CorreoUsuario = CorreoUsuario;
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.vivienda = vivienda;
        this.contrasena = contrasena;
    }

    public String getCorreoUsuario() {
        return CorreoUsuario;
    }

    public void setCorreoUsuario(String CorreoUsuario) {
        this.CorreoUsuario = CorreoUsuario;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getVivienda() {
        return vivienda;
    }

    public void setVivienda(String vivienda) {
        this.vivienda = vivienda;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
}
