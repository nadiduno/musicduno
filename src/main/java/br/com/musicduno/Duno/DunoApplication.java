package br.com.musicduno.Duno;

import br.com.musicduno.Duno.principal.Principal;

import br.com.musicduno.Duno.repository.ArtistaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class DunoApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(DunoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Principal principal = new Principal();
		principal.showMenu();
	}

}
