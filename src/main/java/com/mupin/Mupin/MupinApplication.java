package com.mupin.Mupin;

import com.mupin.Controller.mainController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackageClasses = mainController.class)
public class MupinApplication {

	public static void main(String[] args) {
		SpringApplication.run(MupinApplication.class, args);
	}

}
