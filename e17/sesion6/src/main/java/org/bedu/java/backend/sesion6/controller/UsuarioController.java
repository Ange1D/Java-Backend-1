package org.bedu.java.backend.sesion6.controller;

import org.bedu.java.backend.sesion6.model.Direccion;
import org.bedu.java.backend.sesion6.model.Usuario;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/usuario")
public class UsuarioController {

    /*
    @PostMapping
    public String creaUsuario(@RequestBody Usuario usuario) {
        System.out.println("Creando usuario");
        System.out.println("Nombre: " + usuario.getNombre());
        System.out.println("Apellido: " + usuario.getApellido());
        System.out.println("Usuario: " + usuario.getUsuario());
        System.out.println("E-Mail: " + usuario.getCorreoElectronico());

        return "Usuario Creado";
    }
     */

    @PostMapping("/{id}")
    public String creaUsuarioParams(@RequestBody Usuario usuario, @PathVariable("id") long id) {
        System.out.println("Creando UsuarioParams");
        System.out.println("Nombre: " + usuario.getNombre());
        System.out.println("Apellido: " + usuario.getApellido());
        System.out.println("Usuario: " + usuario.getUsuario());
        System.out.println("E-Mail: " + usuario.getCorreoElectronico());

        return "Usuario " + id + " Creado";
    }

    @PostMapping("/rol")
    public String creaUsuarioRol(@RequestBody Usuario usuario, @RequestParam("id") long id, @RequestParam("rol") String rol) {
        System.out.println("Creando UsuarioRol");
        System.out.println("Nombre: " + usuario.getNombre());
        System.out.println("Apellido: " + usuario.getApellido());
        System.out.println("Usuario: " + usuario.getUsuario());
        System.out.println("E-Mail: " + usuario.getCorreoElectronico());
        System.out.println("Rol: " + rol);

        return "Usuario " + id + " creado con el rol "+ rol;
    }

    @PostMapping
    public ResponseEntity<Usuario> creaUsuario(@RequestBody Usuario usuario) {
        System.out.println("Creando usuario");
        System.out.println("Nombre: " + usuario.getNombre());
        System.out.println("Apellido: " + usuario.getApellido());
        System.out.println("Usuario: " + usuario.getUsuario());
        System.out.println("E-Mail: " + usuario.getCorreoElectronico());

        Direccion direccion = new Direccion();
        direccion.setCalle("Córdoba");
        direccion.setNumero("56");
        direccion.setCodigoPostal("06700");

        usuario.setDireccion(direccion);

        return ResponseEntity.ok(usuario);
    }
}
