package config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.java.sd.model.Cliente;
import com.java.sd.model.SbRepository;

@Configuration
public class Configuracion {
	@Bean
	public CommandLineRunner iniciarBaseDeDatos(SbRepository repo) {
		return args -> {
			repo.save(new Cliente("Junior", "fernandez", "madrid", "z154145"));
			repo.save(new Cliente("junior2", "fernandez2", "madrid", "c26451"));
			repo.save(new Cliente("junior3", "fernandez3", "madrid", "e144466"));

		};
	}
}