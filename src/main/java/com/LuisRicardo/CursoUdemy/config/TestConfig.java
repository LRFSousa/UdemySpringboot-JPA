package com.LuisRicardo.CursoUdemy.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.LuisRicardo.CursoUdemy.entities.User;
import com.LuisRicardo.CursoUdemy.repository.UserRepository;

@Configuration
@Profile("test")
//database seeding                   
public class TestConfig implements CommandLineRunner{

	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {//para executar quando a aplicação iniciar
		
		User u1 = new User(null, "Maria Brow", "maria@gmail.com", "48900003333", "123456");
		User u2 = new User(null, "Alex Green", "alex@gmail.com", "49944445555", "123456");

		userRepository.saveAll(Arrays.asList(u1,u2));
	}
	
	
}