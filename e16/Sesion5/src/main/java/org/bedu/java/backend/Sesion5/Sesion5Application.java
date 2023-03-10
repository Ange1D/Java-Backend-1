package org.bedu.java.backend.Sesion5;

import org.bedu.java.backend.Sesion5.model.Saludo;
import org.bedu.java.backend.Sesion5.service.SaludoService;
import org.bedu.java.backend.Sesion5.service.SaludoServiceProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Sesion5Application implements CommandLineRunner {

	//poco seguro y lento
	//@Autowired
	//private Saludo saludo;

	//el metodo esta expuesto
	//private Saludo saludo;
	//@Autowired
	//public void setSaludo(Saludo saludo){
	//	this.saludo = saludo;
	//}


	//recomendado
	private final Saludo saludo;
	private final SaludoService saludoService;
	private final SaludoServiceProperties saludoServiceProperties;
	public Sesion5Application(@Autowired Saludo saludo, @Autowired SaludoService saludoService,@Autowired SaludoServiceProperties saludoServiceProperties) {
		this.saludo = saludo;
		this.saludoService = saludoService;
		this.saludoServiceProperties = saludoServiceProperties;
	}

	public static void main(String[] args) {
		SpringApplication.run(Sesion5Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println(saludo.getNombre());
		System.out.println(saludoService.saluda());
		System.out.println(saludoServiceProperties.saluda());
	}

}
