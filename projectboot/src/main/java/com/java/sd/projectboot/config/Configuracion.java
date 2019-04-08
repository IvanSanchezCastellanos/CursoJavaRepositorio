package com.java.sd.projectboot.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.java.sd.projectboot.model.SbRepository;
import com.java.sd.projectboot.model.entities.Cliente;

@Configuration
public class Configuracion {
	@Bean
	public CommandLineRunner iniciarBaseDeDatos(SbRepository repo) {
		return args -> {
			repo.save(new Cliente("Junior", "fernandez", "madrid"));
			repo.save(new Cliente("junior2", "fernandez2", "madrid"));
			repo.save(new Cliente("junior3", "fernandez3", "madrid"));

		};
	}
}