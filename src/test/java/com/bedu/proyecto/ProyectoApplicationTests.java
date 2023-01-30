package com.bedu.proyecto;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ProyectoApplicationTests {

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
