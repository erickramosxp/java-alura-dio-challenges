package com.alura.aluraMusic.repository;

import com.alura.aluraMusic.model.Artista;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArtistaRepository extends JpaRepository<Artista, Long> {
}
