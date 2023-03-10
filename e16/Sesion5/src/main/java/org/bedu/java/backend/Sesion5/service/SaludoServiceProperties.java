package org.bedu.java.backend.Sesion5.service;

import org.bedu.java.backend.Sesion5.model.SaludoProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
public class SaludoServiceProperties {
    private final SaludoProperties saludoProperties;

    @Autowired
    public SaludoServiceProperties(SaludoProperties saludoProperties) {
        this.saludoProperties = saludoProperties;
    }


    @PostConstruct
    public void init(){
        saludoProperties.setNombre("3-Anggel");
    }

    public String saluda(){
        return "Hola " + saludoProperties.getNombre();
    }
}
