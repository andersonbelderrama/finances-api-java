package br.com.belderrama.financesapi;

import java.util.Date;
import java.util.TimeZone;

import javax.annotation.PostConstruct;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.ulisesbocchio.jasyptspringboot.annotation.EnableEncryptableProperties;

@Configuration
@EnableEncryptableProperties
@EnableWebMvc
@SpringBootApplication
public class FinancesApiApplication {
	@PostConstruct
	public void init(){
        TimeZone.setDefault(TimeZone.getTimeZone("America/Sao_Paulo"));   
        System.out.println("Spring boot application running in UTC timezone :"+new Date()); 
    }

	public static void main(String[] args) {
		SpringApplication.run(FinancesApiApplication.class, args);
	}

}
