package com.example.PrimerApiRest.repositories;

import com.example.PrimerApiRest.entities.Base;
import com.example.PrimerApiRest.entities.Domicilio;
import org.springframework.stereotype.Repository;

@Repository
public interface DomicilioRepository extends BaseRepository<Domicilio, Long> {
}
