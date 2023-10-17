package com.example.PrimerApiRest.repositories;

import com.example.PrimerApiRest.entities.Libro;
import org.springframework.stereotype.Repository;

@Repository
public interface LibroRepository extends BaseRepository <Libro,Long> {
}
