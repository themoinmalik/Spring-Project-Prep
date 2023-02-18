package com.javatechie.crud.example;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;



@Component
class SpringEngine {

    public String getEngine(){
        return "I am a spring Engine... ";
    }

}


@Component
public class SpringCar {


    @Autowired
    SpringEngine engine;

    public String getEngineName(){
        return engine.getEngine();
    }

}
