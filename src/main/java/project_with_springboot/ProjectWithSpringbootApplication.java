package project_with_springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import project_with_springboot.services.ApiConsumption;

@SpringBootApplication
public class ProjectWithSpringbootApplication {
	public static void main(String[] args) {
		System.gc();
		SpringApplication.run(ProjectWithSpringbootApplication.class, args);




	}

}
