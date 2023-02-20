package com.javatechie.crud.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SpringProjectPrep {

	public static void main(String[] args) {
		ConfigurableApplicationContext context =
				SpringApplication.run(SpringProjectPrep.class, args);

//		SpringCar car = context.getBean(SpringCar.class);
//		System.out.println(car.getEngineName());


//		Vehicle vehicle = context.getBean(Vehicle.class);
//		vehicle.myVehicle();


		SpringBike bike = context.getBean(SpringBike.class);
		System.out.println("application is running -> " + bike.getPortNum());

		SpringEngine engine = context.getBean(SpringEngine.class);
		System.out.println(engine.getEngine());

	}

}
