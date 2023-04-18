/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sc404.proyect_basededatos.logica;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author usuario
 */
public class conexion {

    Connection conectar = null;
    
    String usuario = "sa";
    String pass = "1003";
    String bd = "webReciclaje";
    String ip = "localhost";
    String puerto = "1433";

    public Connection establecerConxion(){

        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String cadena = "jdbc:sqlserver://"+ip+":"+puerto+";databaseName="+bd+";"+
                    "encrypt=true;trustServerCertificate=true";
            conectar = DriverManager.getConnection(cadena,usuario,pass);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al conectar la BD" + e.toString());
        }
        return conectar;
    }
    
    public int Login(String user, String pass) {
        
        conexion objetoConexion = new conexion();
        int resultado = 0;

        try {
            Statement st;
            st = objetoConexion.establecerConxion().createStatement();
            ResultSet rs = st.executeQuery("select * from usuario Where cedula = " + user + " and contraseña = " + pass + "");

            if (rs.next()) {

                JOptionPane.showMessageDialog(null, "bienvenido");
                resultado = 1;
            } else {
                JOptionPane.showMessageDialog(null, "Problemas con el usuaio o contrasena");
                resultado = 0;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "error al conectar" + e.toString());

        }
        return resultado;
    }
}
