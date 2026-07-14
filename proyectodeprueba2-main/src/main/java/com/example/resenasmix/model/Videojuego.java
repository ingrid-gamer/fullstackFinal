package com.example.resenasmix.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "videojuegos")
public class Videojuego {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "El título es obligatorio")
    @Size(min = 2, max = 100, message = "El título debe tener entre 2 y 100 caracteres")
    private String titulo;

    @NotBlank(message = "La consola es obligatoria")
    @Size(min = 2, max = 50, message = "La consola debe tener entre 2 y 50 caracteres")
    private String consola;

    @NotBlank(message = "El género es obligatorio")
    @Size(min = 2, max = 50, message = "El género debe tener entre 2 y 50 caracteres")
    private String genero;

    @OneToMany(mappedBy = "videojuego", cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonIgnoreProperties("videojuego")
    private List<Resena> resenas = new ArrayList<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getConsola() {
        return consola;
    }

    public void setConsola(String consola) {
        this.consola = consola;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public List<Resena> getResenas() {
        return resenas;
    }

    public void setResenas(List<Resena> resenas) {
        this.resenas = resenas;
    }
}