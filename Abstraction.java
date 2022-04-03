package com.company;

public class Abstraction {
    public static void main(String[] args) {
//        Car c1 = new Car();
//        c1.start();

        Audi a1 = new Audi();
        a1.start();

        BMW b1 = new BMW();
        b1.start();
    }
}

class Audi extends Car {
    @Override
    void start(){
        System.out.println("Audi is Starting");
    }
}
class BMW extends Car {
    @Override
    void start(){
        System.out.println("BMW is Starting");
    }
}
// If you abstract the function [start()] inside a class then you also have to add abstract to the class [Car]
abstract class Car{ // After adding abstract to class Car we cannot create a object like c1
    int price;
    abstract void start(); // adding abstract to function
}
