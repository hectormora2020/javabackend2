package com.bedu.proyecto;


public class UsuarioValidador {

    public boolean valida( long idUsuario ) {

        if( idUsuario == 1) {
            // Es usuario Administrador
            return false;
        }

        return true;
    }
}