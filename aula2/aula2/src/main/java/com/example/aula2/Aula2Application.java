package com.example.aula2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
@RestController
public class Aula2Application {

	@Autowired
	@Qualifier("nomeAplicacao")
	private String nomeAplicacao;

	@Autowired
	private Integer versao;

	@GetMapping(value = "/")
	public String getNomeAplicacao() {
		return nomeAplicacao + " - " + versao;
	}

	public static void main(String[] args) {
		SpringApplication.run(Aula2Application.class, args);
	}

}
