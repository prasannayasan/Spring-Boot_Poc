package com.rgl.demoPoc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import com.rgl.demoPoc.service.EmployeeService;

@SpringBootApplication(scanBasePackages = {"com.rgl.demoPoc"})
public class DemoPocApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoPocApplication.class, args);
	}
}
