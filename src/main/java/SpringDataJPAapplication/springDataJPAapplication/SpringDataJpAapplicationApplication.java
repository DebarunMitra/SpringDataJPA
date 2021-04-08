package SpringDataJPAapplication.springDataJPAapplication;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import SpringDataJPAapplication.springDataJPAapplication.Models.Students;
import SpringDataJPAapplication.springDataJPAapplication.Repositories.StudentRepository;

@SpringBootApplication
public class SpringDataJpAapplicationApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringDataJpAapplicationApplication.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner(StudentRepository studentRepository) {
		return args -> {
			Students Deba = new Students("Deba", "M", "d@test.m", 25);

			studentRepository.save(Deba);
		};
	}
}
