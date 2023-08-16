package com.silviprojeto.demo.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.silviprojeto.demo.entities.User;
import com.silviprojeto.demo.repositories.UserRepository;

@Configuration
@Profile("test") //"test" is the name in application.properties
public class TestConfig implements CommandLineRunner{ //this interface runs everything in method
	                                                  //run when the application starts
	@Autowired //makes the connection with other class
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception { 
		
		User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456");
		User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456");
		
		userRepository.saveAll(Arrays.asList(u1,u2));
		
	}

}
