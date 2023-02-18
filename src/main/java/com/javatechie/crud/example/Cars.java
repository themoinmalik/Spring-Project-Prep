package com.javatechie.crud.example;


class Engine {

    public void getEngine(){
        System.out.println("I am a 1.5 l vtech engine. ");
    }

}



public class Cars{

    public static void main(String[] args) {

        Engine engine = new Engine();
        engine.getEngine();


    }
}
