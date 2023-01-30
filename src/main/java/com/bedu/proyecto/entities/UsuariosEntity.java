package com.bedu.proyecto.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;


import org.springframework.data.rest.core.annotation.RestResource;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
@Data
@RestResource( rel="usuarios", path = "usuario")
public class UsuariosEntity {

    @Id
    long id;

    @Column
    String nombre;

    @Column
    String direccion;
} // ./class
