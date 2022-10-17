package br.com.belderrama.financesapi.config;

import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.VendorExtension;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@Configuration
public class SpringFoxConfig {
    @Bean
    public Docket api(){
        return new Docket(DocumentationType.SWAGGER_2)
            .select()
            .apis(RequestHandlerSelectors.basePackage("br.com.belderrama.financesapi.controller"))
            .paths(PathSelectors.any())
            .build()
            .apiInfo(metaInfo());
    }

    private ApiInfo metaInfo(){
        ApiInfo apiInfo = new ApiInfo(
        "Finances API REST",
        "API FinancesApp", 
        "1.0", 
        "Termos do Serviço", 
        new Contact("Anderson Belderrama", "http://andersonbelderrama.com.br", "andersonbelderrama@gmail.com"), 
        "Apache License Version 2.0", 
        "http://www.apache.org/licenses/LICENSE-2.0", new ArrayList<VendorExtension>()
        );
        return apiInfo;
    }
}
