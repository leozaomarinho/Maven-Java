package com.projetoclientes.crud.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.projetoclientes.crud.entities.User;
import com.projetoclientes.crud.repositories.UserRepository;

@Configuration
@Profile("teste")
public class TestConfig implements CommandLineRunner {
	
	//Resolvendo injecao de dependencias
	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		//criando o user no banco
		User u1 = new User(null,"Maria Brow","maria@gmail.com","44445555","123456");
		User u2 = new User(null,"Alex green","alex@gmail.com","22225555","123456");

		userRepository.saveAll(Arrays.asList(u1,u2));
	}
	
}
