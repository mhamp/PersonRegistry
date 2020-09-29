package com.mhamp.personregister;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.*;
import com.mhamp.personregister.config.SwaggerConfiguration;

@SpringBootApplication
@Import(SwaggerConfiguration.class)
public class PersonregisterApplication {

	public static void main(String[] args) {
		SpringApplication.run(PersonregisterApplication.class, args);
	}

}
