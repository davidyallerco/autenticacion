package com.partnerdigital.autenticacion;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AutenticacionApplication {

	public static void main(String[] args) {
		SpringApplication.run(AutenticacionApplication.class, args);
	}

	/*
	previamente cargar el mysql , hay dos tablas hibernate... y user
	pagina a cargar http://localhost:8081
	una vez pesionado se redireccionara a http://localhost:8081:login
 	usuario: user
 	password: 66f0d4ec-a2fc-4814-ab35-d61fc6424e98   <-- es copias de la consola donde se genera
	 */
}
