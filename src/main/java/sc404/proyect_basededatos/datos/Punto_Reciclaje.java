/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sc404.proyect_basededatos.datos;

/**
 *
 * @author usuario
 */
public class Punto_Reciclaje {
    
    private int idPunto;
    private String tipo;
    private int telefono;
    private String horario;
    private String provincia;
    private String canton;

    public Punto_Reciclaje() {
    }

    public Punto_Reciclaje(int idPunto, String tipo, int telefono, String horario, String provincia, String canton) {
        this.idPunto = idPunto;
        this.tipo = tipo;
        this.telefono = telefono;
        this.horario = horario;
        this.provincia = provincia;
        this.canton = canton;
    }

    public int getIdPunto() {
        return idPunto;
    }

    public void setIdPunto(int idPunto) {
        this.idPunto = idPunto;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getCanton() {
        return canton;
    }

    public void setCanton(String canton) {
        this.canton = canton;
    }
}
