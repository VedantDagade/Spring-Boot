package com.introSpringFramwork.springFramework;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application implements CommandLineRunner {

	//Dependency Injections -:
    @Autowired
	Apple obj;

	@Autowired
	Food obj1;

	@Autowired
	DBService dbService;


	public static void main(String[] args) {

		//IOC Container -: scans all beans @component, @service @bean etc.
		SpringApplication.run(Application.class, args);

	}


	//runs after spring boot start -: all beans already created and injection from above IOC.
	@Override
	public void run(String... args) throws Exception{
		obj.eatApple();
		obj.sellApple();
		obj1.eatFood();
		System.out.println(dbService.getData());
	}
}
