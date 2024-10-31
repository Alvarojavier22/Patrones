package org.utec.dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class UsuarioDAO {

    private Connection conexion;

    public UsuarioDAO() throws SQLException {
        this.conexion = ConexionBDSingleton.obtenerInstancia().getConexion();
    }
    private static final String INSERTAR_USUARIO = "INSERT INTO usuarios(nombre, email, password) VALUES(?,?,?)";
    private static final String OBTENER_USUARIOS = "SELECT * FROM usuarios ";
    private static final String MODIFIFCAR_USUARIO = "UPDATE usuarios SET nombre = ?, email = ?, password = ? WHERE id = ?";
    private static final String ELIMINAR_USUARIO = "DELETE FROM usuarios WHERE id = ?";

    public void agregarUsuario(Usuario usuario) throws SQLException {

        try(PreparedStatement stmt = conexion.prepareStatement(INSERTAR_USUARIO)){
            stmt.setString(1, usuario.getNombre());
            stmt.setString(2, usuario.getEmail());
            stmt.setString(3, usuario.getPassword());
            stmt.executeUpdate();
            System.out.println("Usuario agregado exitosamente");
        }
    }


    public List<Usuario> obtenerUsuarios(Usuario usuario) throws SQLException {
        List<Usuario> usuarios = new ArrayList<>();
        try (Statement stmt = conexion.createStatement()) {
            ResultSet rs = stmt.executeQuery(OBTENER_USUARIOS);
            while (rs.next()) {
                usuarios.add(new Usuario(
                        rs.getInt("id"),
                        rs.getString("nombre"),
                        rs.getString("email"),
                        rs.getString("password")));
            }
        }
        return usuarios;
    }
    public void actualizarUsuario(Usuario usuario)throws SQLException {
        try(PreparedStatement stmt = conexion.prepareStatement(MODIFIFCAR_USUARIO)){
            stmt.setString(1, usuario.getNombre());
            stmt.setString(2, usuario.getEmail());
            stmt.setString(3, usuario.getPassword());
            stmt.setInt(4, usuario.getId());
            int filasAfectadas = stmt.executeUpdate();
            if(filasAfectadas > 0){
                System.out.println("Usuario actualizado exitosamente");
            }else {
                System.out.println("No se encontró el usuario con ID: " + usuario.getId());
            }
        }
    }
    public void eliminarUsuario(int id) throws SQLException {
        try(PreparedStatement stmt = conexion.prepareStatement(ELIMINAR_USUARIO)){
            stmt.setInt(1, id);
            int filasAfectadas = stmt.executeUpdate();
            if(filasAfectadas > 0){
                System.out.println("Usuario eliminado exitosamente");
            }else {
                System.out.println("No se encontro el usuario con ID: " + id);
            }
        }
    }
    public void cerrarConexion() throws SQLException {
        if(conexion != null && !conexion.isClosed()) {
            conexion.close();
            System.out.println("Conexion cerrada");
        }
    }
}
