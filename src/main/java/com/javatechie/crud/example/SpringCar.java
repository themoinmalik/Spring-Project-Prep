package com.javatechie.crud.example;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SpringCar {


    @Autowired
    SpringEngine engine;

    public String getEngineName(){
        return engine.getEngine();
    }


}
