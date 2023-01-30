package com.bedu.proyecto.controller;

import com.bedu.proyecto.model.Usuario;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import javax.validation.Valid;
import java.net.URI;

@RestController
@RequestMapping("/usuario")
public class UsuariosController {

    @GetMapping("/{usuarioId}")
    public ResponseEntity<Usuario> getUsuario(@PathVariable long usuarioId) {

        if( usuarioId == 1) {
            // CONFIDENCIAL (403) Usuario Administrador
            throw new ResponseStatusException( HttpStatus.FORBIDDEN, "Confidencial" );
        }

        Usuario usuario = new Usuario();
        usuario.setId( usuarioId );
        usuario.setNombre("HECTOR");
        usuario.setCorreo("h.hector.mora@gmail.com");

        return ResponseEntity.ok(usuario);
    }


    @PostMapping
    public ResponseEntity<Usuario> crearUsuario(@Valid @RequestBody Usuario usuario) {
        return ResponseEntity.created( URI.create("") ).build();

    }
}
