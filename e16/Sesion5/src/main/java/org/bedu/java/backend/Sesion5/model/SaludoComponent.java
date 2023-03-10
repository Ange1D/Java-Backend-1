package org.bedu.java.backend.Sesion5.model;

import org.springframework.stereotype.Component;

@Component
public class SaludoComponent {
    private final String nombre;

    public SaludoComponent() {
        this.nombre = "2-Angel";
    }

    public String getNombre() {
        return nombre;
    }
}
