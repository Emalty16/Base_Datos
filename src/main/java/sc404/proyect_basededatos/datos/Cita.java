/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sc404.proyect_basededatos.datos;

/**
 *
 * @author usuario
 */
public class Cita {
    private int idCita;
    private int idCorreoUsuario;
    private String nombreUsuario;
    private String correo;
    private String correoUsuario;

    public Cita() {
    }

    public Cita(int idCita, int idCorreoUsuario, String nombreUsuario, String correo, String correoUsuario) {
        this.idCita = idCita;
        this.idCorreoUsuario = idCorreoUsuario;
        this.nombreUsuario = nombreUsuario;
        this.correo = correo;
        this.correoUsuario = correoUsuario;
    }

    public int getIdCita() {
        return idCita;
    }

    public void setIdCita(int idCita) {
        this.idCita = idCita;
    }

    public int getIdCorreoUsuario() {
        return idCorreoUsuario;
    }

    public void setIdCorreoUsuario(int idCorreoUsuario) {
        this.idCorreoUsuario = idCorreoUsuario;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getCorreoUsuario() {
        return correoUsuario;
    }

    public void setCorreoUsuario(String correoUsuario) {
        this.correoUsuario = correoUsuario;
    }
    
    
}
