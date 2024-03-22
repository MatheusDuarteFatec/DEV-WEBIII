package br.fatec.ProjetoSpringConfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ProjetoSpringConfigApplication {

	@Autowired
	@Qualifier("appName")
	private String appName;

	// @getMapping
	public String olaMundo() {
		return appName;
	}

	public static void main(String[] args) {
		SpringApplication.run(ProjetoSpringConfigApplication.class, args);
	}
}