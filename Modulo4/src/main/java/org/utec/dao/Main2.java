package org.utec.dao;

import java.sql.SQLException;

public class Main2 {
    public static void main(String[] args)  throws SQLException{

        UsuarioDAO usuarioDAO = null;

        try{
            ConexionBDSingleton conexionBDSingleton = ConexionBDSingleton.obtenerInstancia();
            System.out.println("Conexión establecida con éxito.");

            usuarioDAO = new UsuarioDAO();

            Usuario nuevoUsuario = new Usuario(1, "Alvaro 2", "alvaro2@algo.com", "12345");
            usuarioDAO.agregarUsuario(nuevoUsuario);

            System.out.println("Lis ta de usuarios en la DB: ");
            usuarioDAO.obtenerUsuarios().forEach(System.out::println);

            nuevoUsuario.setNombre("Alvaro Javier 2");
            usuarioDAO.actualizarUsuario(nuevoUsuario);

            usuarioDAO.eliminarUsuario(nuevoUsuario.getId());
        }catch (SQLException e){
            e.printStackTrace();
            System.out.println("Error al establecer la conexion a la DB");
        }finally {
            if(usuarioDAO != null){
                usuarioDAO.cerrarConexion();
            }
        }
    }
}
