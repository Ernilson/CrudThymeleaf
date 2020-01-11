package br.com.Thymeleaf;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class ThymeleafApplication extends SpringBootServletInitializer{

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
//        return super.configure(builder); //To change body of generated methods, choose Tools | Templates.
return builder.sources(ThymeleafApplication.class);
    }

    
	public static void main(String[] args) {
		SpringApplication.run(ThymeleafApplication.class, args);
	}

}
