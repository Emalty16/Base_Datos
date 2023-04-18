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
import sc404.proyect_basededatos.datos.Actividad;
import sc404.proyect_basededatos.datos.Usuario;

/**
 *
 * @author adria
 */
public class FuncionesActividades {
    
    private conexion sql = new conexion();
    private Connection cn = sql.establecerConxion();
    private String sSQL = "";
    
    public void motrarActividad(JTable paramTablaActividad) {

        conexion objetoConexion = new conexion();

        DefaultTableModel modelo = new DefaultTableModel();

        String sql = "";

        modelo.addColumn("idActividad");
        modelo.addColumn("fecha");
        modelo.addColumn("descripcion");
        modelo.addColumn("nombreEmpresa");
        modelo.addColumn("ubicacion");
        modelo.addColumn("HORA");

        paramTablaActividad.setModel(modelo);
        sql = "select * from actividad;";

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

            paramTablaActividad.setModel(modelo);

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "no se pudieron mostrar los datos" + e.toString());
        }

    }
    
    public boolean insertar(Actividad dts) {
        sSQL = "insert into actividad (idActividad,fecha,descripcion,nombreEmpresa,ubicacion,HORA)" + "values (?,?,?,?,?,?)";
        try {
            PreparedStatement pst = cn.prepareStatement(sSQL);
            pst.setInt(1, dts.getIdActividad());
            pst.setString(2, dts.getFecha());
            pst.setString(3, dts.getDescripcion());
            pst.setString(4, dts.getNomEmpresa());
            pst.setString(5, dts.getUbicacion());
            pst.setString(6, dts.getHora());
            
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
    
    public boolean eliminar(Actividad dts) {
        sSQL = "delete from actividad where idActividad=?";
        try {
            PreparedStatement pst = cn.prepareStatement(sSQL);
            pst.setInt(1, dts.getIdActividad());
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
