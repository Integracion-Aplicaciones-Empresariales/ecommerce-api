package com.ecommerce.service.controller;

import com.ecommerce.service.service.ProductoService;
import com.ecommerce.service.utility.GenericResponse;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/platillo")
public class ProductoController {
    private final ProductoService service;

    public ProductoController(ProductoService service) {
        this.service = service;
    }

    @GetMapping
    public GenericResponse<?> listarPlatillosRecomendados(){
        return this.service.listarPlatillosRecomendados();
    }
    @GetMapping("/{idC}")
    public GenericResponse<?> listarPlatillosPorCategoria(@PathVariable int idC){
        return this.service.listarPlatillosPorCategoria(idC);
    }
}
