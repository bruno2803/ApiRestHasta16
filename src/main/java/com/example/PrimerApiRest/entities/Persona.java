package com.example.PrimerApiRest.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name="persona")
@AllArgsConstructor
@NoArgsConstructor
@Data
@EqualsAndHashCode(callSuper = true)
@Builder
public class Persona extends Base {

    @Column(name = "nombre")
    private String nombre;
    @Column(name = "apellido")
    private String apellido;
    @Column(name = "dni")
    private int dni;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_domicilio")
    private Domicilio domicilio;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
    @JoinTable(name = "persona_libro",joinColumns = @JoinColumn(name = "persona_id"),inverseJoinColumns = @JoinColumn(name = "libro_id"))
    @EqualsAndHashCode.Exclude
    @Builder.Default
    private List<Libro> libros = new ArrayList<Libro>();
}
