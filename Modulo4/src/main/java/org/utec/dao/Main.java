package org.utec.dao;

import java.sql.SQLException;

public class Main{
    public static void main(String[] args) throws SQLException {
        try {
            ConexionBDSingleton conexionBDSingleton = ConexionBDSingleton.obtenerInstancia();
            System.out.println("Conexión establecida exitosamente");

            UsuarioDAO usuarioDAO = new UsuarioDAO();

            Usuario nuevoUsuario = new Usuario(1, "Alvaro", "alvaro@algo.com", "1234");
            usuarioDAO.agregarUsuario(nuevoUsuario);

            System.out.println("Lista de Usuarios de la DB: ");
            usuarioDAO.obtenerUsuarios().forEach(System.out::println);

            nuevoUsuario.setNombre("Alvaro Javier");
            usuarioDAO.agregarUsuario(nuevoUsuario);

            usuarioDAO.eliminarUsuario(nuevoUsuario.getId());

            usuarioDAO.cerrarConexion();

        } catch (
                SQLException e) {
            e.printStackTrace();
            System.out.println("Error al obtener la conexion");
        }
    }
}
