package com.fardragi.vulcan;

import com.fardragi.vulcan.database.ConnectionFactory;
import com.fardragi.vulcan.database.daos.UsuarioDao;
import com.fardragi.vulcan.models.Usuario;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        UsuarioDao usuarioDao = new UsuarioDao();
        List<Usuario> usuarios = usuarioDao.getUsuarios();
        usuarios.forEach(x -> System.out.println(x.getNomeUsuario()));
    }
}
