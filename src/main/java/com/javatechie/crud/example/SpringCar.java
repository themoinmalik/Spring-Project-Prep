package com.javatechie.crud.example;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


@Service
class SpringEngine {

    public String getEngine(){
        return "I am a spring Engine... ";
    }

}

@Component
class SpringBike {
    public String getStart(){
        return "bike started ...  ";
    }
}


@Component
public class SpringCar {


    SpringEngine engine;

    @Autowired
    public SpringCar(SpringEngine engine) {
        this.engine = engine;
    }

    public String getEngineName(){
        return engine.getEngine();
    }

}

@Component
class Vehicle {

    SpringBike bike;
    SpringCar car;

    @Autowired
    public Vehicle(SpringBike bike, SpringCar car) {
        this.bike = bike;
        this.car = car;
    }

    public String myVehicle(){
        System.out.println(bike.getStart() + car.getEngineName());
        return  bike.getStart() + car.getEngineName();
    }

}
