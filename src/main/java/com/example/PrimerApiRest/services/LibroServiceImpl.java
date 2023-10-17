package com.example.PrimerApiRest.services;

import com.example.PrimerApiRest.entities.Libro;
import com.example.PrimerApiRest.repositories.BaseRepository;
import com.example.PrimerApiRest.repositories.LibroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LibroServiceImpl extends BaseServiceImpl<Libro,Long> implements LibroService {

    @Autowired
    private LibroRepository libroRepository;

    public LibroServiceImpl(BaseRepository<Libro, Long> baseRepository, LibroRepository libroRepository) {
        super(baseRepository);
        this.libroRepository = libroRepository;
    }
}
