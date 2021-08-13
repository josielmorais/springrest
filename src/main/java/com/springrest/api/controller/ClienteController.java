package com.springrest.api.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.domain.model.Cliente;


@RestController
public class ClienteController {
	
	
	@GetMapping("/clientes")
	public List<Cliente> listar() {
		
	
		var c1 = new Cliente();
		c1.setId(1L);
		c1.setEmail("moraisjosiel1@gmail.com");
		c1.setNome("Josiel");
		c1.setTelefone("86 99999 9999");
		
		var c2 = new Cliente();
		c2.setId(1L);
		c2.setEmail("moraisjoao@gmail.com");
		c2.setNome("João");
		c2.setTelefone("86 99999 9999");
		
	
		return Arrays.asList(c1,c2);
	}

}
