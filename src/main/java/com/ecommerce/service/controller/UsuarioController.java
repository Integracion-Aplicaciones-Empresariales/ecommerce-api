package com.ecommerce.service.controller;

import com.ecommerce.service.entity.Usuario;
import com.ecommerce.service.service.EmailSenderService;
import com.ecommerce.service.service.UsuarioService;
import com.ecommerce.service.utility.GenericResponse;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/usuario")
public class UsuarioController {

    private final UsuarioService usuarioService;

    private EmailSenderService emailSenderService;

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
        System.out.println(u);
        emailSenderService.sendEmail(u.getEmail(),"Bienvenido a El Mana", "¡Hola!\n" +
                "\n" +
                "¡Nos alegra saber que planeas visitarnos en Panadería El Maná! En nuestra panadería, nos dedicamos a ofrecerte los panes y postres más frescos y deliciosos, elaborados con ingredientes de la más alta calidad. Desde croissants y baguettes crujientes hasta pasteles y galletas irresistibles, tenemos algo para satisfacer todos tus antojos.\n" +
                "\n" +
                "Nuestro horario de atención es de lunes a sábado, de 7:00 a.m. a 7:00 p.m., y los domingos de 8:00 a.m. a 2:00 p.m. Nos encontramos en [dirección de la panadería].\n" +
                "\n" +
                "Estamos ansiosos por darte la bienvenida y hacer de tu visita una experiencia deliciosa.\n" +
                "\n" +
                "¡Te esperamos pronto!");
        return this.usuarioService.guardarUsuario(u);
    }
    @PutMapping("/{id}")
    public GenericResponse<?> update(@PathVariable int id, @RequestBody Usuario u){
        return this.usuarioService.guardarUsuario(u);
    }

}
