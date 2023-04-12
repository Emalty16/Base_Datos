/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sc404.proyect_basededatos.datos;

/**
 *
 * @author usuario
 */
public class Actividad {
    private int idActividad;
    private String fecha;
    private String Descripcion;
    private String nomEmpresa;
    private String ubicacion;
    private String hora;

    public Actividad() {
    }

    public Actividad(int idActividad, String fecha, String Descripcion, String nomEmpresa, String ubicacion, String hora) {
        this.idActividad = idActividad;
        this.fecha = fecha;
        this.Descripcion = Descripcion;
        this.nomEmpresa = nomEmpresa;
        this.ubicacion = ubicacion;
        this.hora = hora;
    }

    public int getIdActividad() {
        return idActividad;
    }

    public void setIdActividad(int idActividad) {
        this.idActividad = idActividad;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public String getNomEmpresa() {
        return nomEmpresa;
    }

    public void setNomEmpresa(String nomEmpresa) {
        this.nomEmpresa = nomEmpresa;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }
    
    
    
}
