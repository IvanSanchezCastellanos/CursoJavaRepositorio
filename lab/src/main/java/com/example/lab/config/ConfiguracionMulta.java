package com.example.lab.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.lab.model.Multa;
import com.example.lab.model.MultaRepository;

@Configuration
public class ConfiguracionMulta {

	@Bean
	public CommandLineRunner iniciarBaseDeDatos(MultaRepository repo) {
		return args -> {
			repo.save(new Multa("1111 AAA", "Exceso de velocidad", 100.00));
			repo.save(new Multa("2222 BBB", "Conducir en estado de embriaguez", 200.00));
			repo.save(new Multa("3333 CCC", "Copiloto tirando huevos podridos a los ciudadanos", 10.00));
		};
	}
}
