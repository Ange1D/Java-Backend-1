package org.bedu.java.backend.sesion4.controllers;


import org.bedu.java.backend.sesion4.model.Saludo;
import org.springframework.web.bind.annotation.*;

@RestController
public class SaludoController {
    @GetMapping("/saludo")
    public Saludo saluda() {

        Saludo saludo = new Saludo();
        saludo.setMensaje("¡¡Hola Mundo!!");

        return saludo;
    }

    @GetMapping("/saludo/{nombre}")
    public Saludo saluda(@PathVariable String nombre){

        Saludo saludo = new Saludo();
        saludo.setMensaje("¡¡Hola Mundo!!");
        saludo.setNombre(nombre);

        return saludo;
    }

    @PostMapping("/saludo")
    public Saludo saludaPost(@RequestBody Saludo saludo){
        return saludo;
    }

    @PutMapping("/saludo")
    public Saludo saluda(@RequestBody Saludo saludo){

        saludo.setFechaNacimiento(saludo.getFechaNacimiento().plusDays(1));

        return saludo;
    }

    @DeleteMapping("/saludo/{id}")
    public String saludaDel(@PathVariable int id){

        return id + " eliminado";

    }

}
