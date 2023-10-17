package com.example.PrimerApiRest.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "libro")
@AllArgsConstructor
@NoArgsConstructor
@Data
@EqualsAndHashCode(callSuper = true)
public class Libro extends Base{

    @Column(name = "titulo")
    private String titulo;
    @Column(name = "fecha")
    private int fecha;
    @Column(name = "genero")
    private String genero;
    @Column(name = "paginas")
    private int paginas;

    @ManyToMany(cascade = CascadeType.REFRESH, fetch = FetchType.EAGER)
    @EqualsAndHashCode.Exclude
    private List<Autor> autores;
}
