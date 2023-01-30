package com.bedu.proyecto;

import com.bedu.proyecto.model.Usuario;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class UsuarioTest {

    UsuarioValidador usuarioValidador = new UsuarioValidador();

    @Test
    public void valida1() {
        boolean result = usuarioValidador.valida(1);
        assertFalse( result );
    }

    @Test
    public void valida2() {
        boolean result = usuarioValidador.valida(99);
        assertTrue( result );
    }
}
