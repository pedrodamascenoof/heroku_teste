package com.pedro.pedrosburgerdelivery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.boaglio")
public class PedrosBurgerDelivery {

	public static void main(String[] args) {
		SpringApplication.run(PedrosBurgerDelivery.class, args);
	}
}
