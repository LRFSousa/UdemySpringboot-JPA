package com.LuisRicardo.CursoUdemy.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.LuisRicardo.CursoUdemy.entities.Order;
import com.LuisRicardo.CursoUdemy.entities.User;
import com.LuisRicardo.CursoUdemy.repository.OrderRepository;
import com.LuisRicardo.CursoUdemy.repository.UserRepository;

@Configuration
@Profile("test")
//database seeding                   
public class TestConfig implements CommandLineRunner{

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private OrderRepository orderRepository;
	
	@Override
	public void run(String... args) throws Exception {//para executar quando a aplicação iniciar
		
		User u1 = new User(null, "Maria Brow", "maria@gmail.com", "48900003333", "123456");
		User u2 = new User(null, "Alex Green", "alex@gmail.com", "49944445555", "123456");

		Order o1 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"), u1);
		Order o2 = new Order(null, Instant.parse("2019-07-21T03:42:10Z"), u2);
		Order o3 = new Order(null, Instant.parse("2019-07-22T15:21:22Z"), u1);
		
		userRepository.saveAll(Arrays.asList(u1,u2));
		orderRepository.saveAll(Arrays.asList(o1,o2,o3));
	}
	
	
}