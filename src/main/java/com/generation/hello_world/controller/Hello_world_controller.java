package com.generation.hello_world.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello_world_controller {

	//Primeiro endpoint
	@GetMapping("/helloWorld")
	public String helloWorld() {
		return "Hello World!";
	}
	
	//Segundo endpoint
	@GetMapping("/bsms")
	public List<String> bsms(){
		return Arrays.asList(
				"Mentalidade de Crescimento", 
				"Responsabilidae Pessoal", 
				"Persistência",
				"Orientação ao Futuro"
		);
	}
	
	//Terceiro endpoint
	@GetMapping("/objetivosAprendizagem")
	public List<String> objetivosAprendizagem(){
		return Arrays.asList(
				"Revisar Banco de Dados",
				"Passar a limpo meu resumo de Spring",
				"Tirar dúvidas"
		);
	}
}
