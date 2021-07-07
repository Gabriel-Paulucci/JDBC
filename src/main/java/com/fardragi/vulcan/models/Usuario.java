package com.fardragi.vulcan.models;

public class Usuario {
    private Long codigoUsuario;
    private Long idUsuario;
    private String nomeUsuario;

    public Usuario(Long codigoUsuario, Long idUsuario, String nomeUsuario) {
        this.codigoUsuario = codigoUsuario;
        this.idUsuario = idUsuario;
        this.nomeUsuario = nomeUsuario;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }
}
