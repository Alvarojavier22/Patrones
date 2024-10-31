package org.utec.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBDSingleton {

    private static ConexionBDSingleton instanciaUnica;

    private Connection conexion;
    private String url = "jdbc:postgresql://localhost:5432/patrones";
    private String usuario = "patrones";
    private String password = "patrones";

    private ConexionBDSingleton() throws SQLException{
        this.conexion = DriverManager.getConnection(url, usuario, password);
    }
    public static ConexionBDSingleton obtenerInstancia() throws SQLException{
        if (instanciaUnica == null) {
            instanciaUnica = new ConexionBDSingleton();
        }
        return instanciaUnica;
    }
    public Connection getConexion() {
        return conexion;
    }
}
