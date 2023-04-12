/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sc404.proyect_basededatos.datos;

/**
 *
 * @author usuario
 */
public class Usuario {
    
    private int idCorreoUsuario;
    private int cedula;
    private String nombre;
    private String apellido;
    private String vivienda;
    private String contra;

    public Usuario() {
    }

    
    
    public Usuario(int idCorreoUsuario, int cedula, String nombre, String apellido, String vivienda, String contra) {
        this.idCorreoUsuario = idCorreoUsuario;
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.vivienda = vivienda;
        this.contra = contra;
    }

    public int getIdCorreoUsuario() {
        return idCorreoUsuario;
    }

    public void setIdCorreoUsuario(int idCorreoUsuario) {
        this.idCorreoUsuario = idCorreoUsuario;
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

    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }
    
    
    
    
}
