package com.example.flywaydemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.flywaydb.core.Flyway;
import java.util.Map;
import java.util.HashMap;


@SpringBootApplication
public class FlywayDemoApplication {

	public static void main(String[] args) {
		Map<String, String> props = new HashMap<String, String>();
		props.put("flyway.driver", "org.postgresql.Driver");
		props.put("flyway.url", "jdbc:postgresql://localhost:5432/postgres");
		props.put("flyway.user", "postgres");
		props.put("flyway.password", "password");

		Flyway flyway = new Flyway();
		
		flyway.configure(props);
		flyway.migrate();		

		SpringApplication.run(FlywayDemoApplication.class, args);
	}

}
