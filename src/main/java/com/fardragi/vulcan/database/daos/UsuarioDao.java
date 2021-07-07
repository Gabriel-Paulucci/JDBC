package com.fardragi.vulcan.database.daos;

import com.fardragi.vulcan.database.ConnectionFactory;
import com.fardragi.vulcan.models.Usuario;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UsuarioDao {
    public List<Usuario> getUsuarios() {
        List<Usuario> usuarios = new ArrayList<>();

        try (Connection conn = ConnectionFactory.getConnection()) {
            PreparedStatement statement = conn.prepareStatement("SELECT * FROM Usuarios");

            ResultSet query = statement.executeQuery();

            while (query.next()) {
                Usuario usuario = new Usuario(
                        query.getLong("codigo_usuario"),
                        query.getLong("id_usuario"),
                        query.getString("nome_usuario")
                );

                usuarios.add(usuario);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        return  usuarios;
    }
}
