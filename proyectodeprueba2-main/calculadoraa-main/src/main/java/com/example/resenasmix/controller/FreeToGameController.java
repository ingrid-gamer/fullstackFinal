package com.example.resenasmix.controller;

import com.example.resenasmix.dto.JuegoExternoDTO;
import com.example.resenasmix.service.FreeToGameService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/juegos-gratis")
public class FreeToGameController {

    private final FreeToGameService service;

    public FreeToGameController(FreeToGameService service) {
        this.service = service;
    }

    @GetMapping
    public List<JuegoExternoDTO> listar() {
        return service.listarJuegosExternos();
    }
}