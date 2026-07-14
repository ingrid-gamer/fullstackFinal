package com.example.resenasmix.repository;

import com.example.resenasmix.model.Videojuego;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VideojuegoRepository extends JpaRepository<Videojuego, Long> {
}