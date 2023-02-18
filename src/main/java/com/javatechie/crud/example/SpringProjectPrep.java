package com.javatechie.crud.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringProjectPrep {

	public static void main(String[] args) {
		ConfigurableApplicationContext context =
				SpringApplication.run(SpringProjectPrep.class, args);

//		SpringCar car = context.getBean(SpringCar.class);
//		System.out.println(car.getEngineName());

//
//		Vehicle vehicle = context.getBean(Vehicle.class);
//		vehicle.myVehicle();


		SpringBike bike = context.getBean(SpringBike.class);
		System.out.println(bike.getPortNum());

	}

}
