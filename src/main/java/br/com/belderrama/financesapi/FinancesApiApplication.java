package br.com.belderrama.financesapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableWebMvc
@SpringBootApplication
public class FinancesApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(FinancesApiApplication.class, args);
	}

}
