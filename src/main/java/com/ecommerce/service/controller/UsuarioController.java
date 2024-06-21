package com.ecommerce.service.controller;

import com.ecommerce.service.entity.Usuario;
import com.ecommerce.service.service.UsuarioService;
import com.ecommerce.service.utility.GenericResponse;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/usuario")
public class UsuarioController {

    private final UsuarioService usuarioService;

    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    @PostMapping("/login")
    public GenericResponse<Usuario> login(HttpServletRequest request){
        String email = request.getParameter("email");
        String clave = request.getParameter("pass");
        return this.usuarioService.login(email, clave);
    }

    @PostMapping
    public GenericResponse<?> save(@RequestBody Usuario u){
        return this.usuarioService.guardarUsuario(u);
    }
    @PutMapping("/{id}")
    public GenericResponse<?> update(@PathVariable int id, @RequestBody Usuario u){
        return this.usuarioService.guardarUsuario(u);
    }

}
