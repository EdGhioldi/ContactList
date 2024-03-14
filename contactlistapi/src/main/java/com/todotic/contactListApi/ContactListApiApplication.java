package com.todotic.contactListApi;

import com.todotic.contactListApi.entity.Contact;
import com.todotic.contactListApi.repository.ContactRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class ContactListApiApplication {

	public static void main(String[] args) {

		SpringApplication.run(ContactListApiApplication.class, args);
	}
	@Bean
	CommandLineRunner runner(ContactRepository contactRepository) {
		return args -> {

				List<Contact> contacts = Arrays.asList(
						new Contact("Carlos", "CarlosGomez@gmail.com", LocalDateTime.now()),
						new Contact("Churri", "churri@gmail.com", LocalDateTime.now()),
						new Contact("Dudi", "dudi@gmail.com", LocalDateTime.now()),
						new Contact("Fede", "fede@gmail.com", LocalDateTime.now()),
						new Contact("Fer", "fer@gmail.com", LocalDateTime.now()),
						new Contact("Sere","eliminado@ya",LocalDateTime.now())
				);
				contactRepository.saveAll(contacts)
		};
	}

}
