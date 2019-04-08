package config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.java.sd.model.*;


@Configuration

public class Configuration {
	@Bean
	public CommandLineRunner iniciarBaseDeDatos(ClienteRepository repo) {
		return args -> {
			repo.save(new Cliente("Ruben", 100));
			repo.save(new Cliente("Ruben2", 40));
			repo.save(new Cliente("Ruben3", 2300));

}
