package com.corenetworks.presentacion;

import com.corenetworks.persistencia.AccesoProductoTabla;
import com.corenetworks.persistencia.Conexion;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        Conexion c1 =new Conexion();
        try {
            c1.abrirConexion();
        } catch (ClassNotFoundException e) {
            System.out.println(e.toString());
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        AccesoProductoTabla ap1= new AccesoProductoTabla();
//        try {
//            System.out.println(ap1.obtenerUno(5));
//        } catch (SQLException | ClassNotFoundException e) {
//            System.out.println(e.toString());
//        }
        try {
            System.out.println(ap1.obtenerTodos());
        } catch (SQLException e) {
            System.out.println(e.toString());
        } catch (ClassNotFoundException e) {
            System.out.println(e.toString());
        }
    }

}
