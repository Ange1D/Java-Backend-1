package org.bedu.java.backend.Sesion5.model;

import org.springframework.stereotype.Component;

@Component
public class SaludoProperties {
    private String nombre;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
}
