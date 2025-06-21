package com.example.springdi;

import com.example.springdi.model.Student;
import com.example.springdi.service.RegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

@SpringBootApplication
public class SpringdiApplication {

	public static void main(String[] args) {

		SpringApplication.run(SpringdiApplication.class, args);
	}

}
@Component
class AppRunner implements CommandLineRunner {

	private final RegistrationService registrationService;

	@Autowired
	public AppRunner(RegistrationService registrationService) {
		this.registrationService = registrationService;
	}

	@Override
	public void run (String... args) {
		Student student = new Student(1L, "Liam Dan");
		registrationService.register(student);
	}
}
