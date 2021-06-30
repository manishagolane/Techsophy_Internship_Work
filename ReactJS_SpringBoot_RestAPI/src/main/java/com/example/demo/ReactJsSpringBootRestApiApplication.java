package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;

@SpringBootApplication
public class ReactJsSpringBootRestApiApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ReactJsSpringBootRestApiApplication.class, args);
	}
	
	@Autowired
	private UserRepository userRepository;
	
	@Override
	public void run(String... args) throws Exception{
		// TODO Auto-generated method stub
		this.userRepository.save(new User("Manisha", "Golane", "manishagolane@gmail.com"));
		this.userRepository.save(new User("Aditi", "Jain", "ajain@gmail.com"));
		this.userRepository.save(new User("Shikha", "Upadhyay", "shikaup@gmail.com"));

	}
}
