package com.example.demo3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Demo3Application {

	public static void main(String[] args) {
		SpringApplication.run(Demo3Application.class, args);
	}
/*scrivi una applicazione web Spring Boot con:
NameController dove si mappa il parametro name per:
restituire il nome alla chiamata GET
restuiture il nome al contrario (es. da John a nhoJ, usando StringBuilder) alla chiamata POST
testare le chiamate del API endpoint usando Postman*/
}
