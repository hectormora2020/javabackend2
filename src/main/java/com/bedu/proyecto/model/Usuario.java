package com.bedu.proyecto.model;

import javax.validation.constraints.*;

public class Usuario {

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    @PositiveOrZero(message="El id no puede ser negativo")
    private long id;

    @NotEmpty(message="El nombre no pueder ser vacío")
    @Size(min=5, max=30, message = "El nombre debe contener entre 5 y 30 caracteres")
    private String nombre;

    @Email(message = "El correo no es válido")
    private String correo;

}