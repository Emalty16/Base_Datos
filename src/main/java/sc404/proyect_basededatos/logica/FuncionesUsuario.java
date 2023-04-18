/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sc404.proyect_basededatos.logica;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import sc404.proyect_basededatos.datos.Usuario;
import sc404.proyect_basededatos.logica.conexion;

/**
 *
 * @author adria
 */
public class FuncionesUsuario {

    public void motrarUsuario(JTable paramTablaUsuario) {

        conexion objetoConexion = new conexion();

        DefaultTableModel modelo = new DefaultTableModel();

        String sql = "";

        modelo.addColumn("correoUsuario");
        modelo.addColumn("cedula");
        modelo.addColumn("nombre");
        modelo.addColumn("apellido");
        modelo.addColumn("vivienda");
        modelo.addColumn("contrasena");

        paramTablaUsuario.setModel(modelo);
        sql = "select * from usuario;";

        String[] datos = new String[6];

        Statement st;

        try {

            st = objetoConexion.establecerConxion().createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {

                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);
                datos[3] = rs.getString(4);
                datos[4] = rs.getString(5);
                datos[5] = rs.getString(6);

                modelo.addRow(datos);
            }

            paramTablaUsuario.setModel(modelo);

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "no se pudieron mostrar los datos" + e.toString());
        }

    }

    private conexion sql = new conexion();
    private Connection cn = sql.establecerConxion();
    private String sSQL = "";

    public boolean insertar(Usuario dts) {
        sSQL = "insert into usuario (correoUsuario,cedula,nombre,apellido,vivienda,contraseña)" + "values (?,?,?,?,?,?)";
        try {
            PreparedStatement pst = cn.prepareStatement(sSQL);
            pst.setString(1, dts.getCorreoUsuario());
            pst.setInt(2, dts.getCedula());
            pst.setString(3, dts.getNombre());
            pst.setString(4, dts.getApellido());
            pst.setString(5, dts.getVivienda());
            pst.setString(6, dts.getContrasena());
            
            int n = pst.executeUpdate();
            if (n != 0) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return false;
        }
    }

    public boolean editar(Usuario dts) {
        sSQL = "update persona set cedula=?,nombre=?,apellido=?,vivienda=?,contrasena=?" + " where correoUsuario=?";
        try {
            PreparedStatement pst = cn.prepareStatement(sSQL);
            pst.setInt(1, dts.getCedula());
            pst.setString(2, dts.getNombre());
            pst.setString(3, dts.getApellido());
            pst.setString(4, dts.getVivienda());
            pst.setString(5, dts.getContrasena());
            pst.setString(6, dts.getCorreoUsuario());
            int n = pst.executeUpdate();
            if (n != 0) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return false;
        }
    }

    public boolean eliminar(Usuario dts) {
        sSQL = "delete from Usuario where correoUsuario=?";
        try {
            PreparedStatement pst = cn.prepareStatement(sSQL);
            pst.setString(1, dts.getCorreoUsuario());
            int n = pst.executeUpdate();
        if (n != 0) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return false;
        }
    }
}
