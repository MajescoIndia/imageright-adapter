package com.majesco.digitalio.imageright;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author Biplab Nayak
 */
@SpringBootApplication
@ComponentScan
@EnableCircuitBreaker
public class ImagerightAdapterApplication {

	public static void main(String[] args) {
		SpringApplication.run(ImagerightAdapterApplication.class, args);
	}
}
