package com.example.r42.demo;

import com.example.r42.demo.funtions.r42;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);

		r42 myitem = new r42();
		myitem.main();
	}

}
