package com.example.aula1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

import com.example.aula1.model.NumeroDTO;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@SpringBootApplication
@RestController
public class Aula1Application {
	@PutMapping(value = "/numero/{id}")
	public String editarNumero(@PathVariable("id") Integer id,
			@RequestBody NumeroDTO numeros) {
		return "Editado com sucesso.";
	}

	@DeleteMapping(value = "/numero/{id}")
	public String deleteNumeroPorId(@PathVariable("id") Integer id) {
		return "O id excluído foi: " + id;
	}

	@PostMapping(value = "/objetonumero")
	public NumeroDTO postObjNumero(@RequestBody NumeroDTO numeros) {
		return numeros;
	}

	@GetMapping(value = "/olamundo")
	public String getOlaMundo() {
		return "Olá Mundo";
	}

	@GetMapping(value = "/numero")
	public String getNumero(@RequestParam Double numero) {
		return "O número é: " + numero;
	}

	@GetMapping(value = "/numero2/{id}")
	public String getNumero2(@PathVariable("id") Double numero) {
		return "O número é: " + numero;
	}

	@GetMapping(value = "/somar")
	public String getSomar(@RequestParam("n1") Double numero1,
			@RequestParam("n2") Double numero2) {
		return "A soma é: " + (numero1 + numero2);
	}

	public static void main(String[] args) {
		SpringApplication.run(Aula1Application.class, args);
	}

}
