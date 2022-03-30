package com.company;

public class CompilePolymorphism { //Compile time polymorphism
    public static void main(String[] args) {
        Person p1 = new Person();  // Object created named as p1 //Here we are calling constructor Person()
        Person p2 = new Person();  // Object created named as p2 //Here we are calling constructor Person()

        //values assigned to objects
        p1.age = 14;
        p1.name = "Piyush";
//        System.out.println(p1.name + " " + p1.age );

        p2.age = 55;
        p2.name = "Ram";

//        p1.walk();
//        p2.eat();
//        p1.walk(12);

        Person p3 = new Person(22, "Raj"); //Here we are calling constructor Person() with arguments or default values
        p3.walk();
        System.out.println(Person.count);
    }
}
class Person { //Class created named as Person
    String name; // Properties of Person class
    int age; // Properties of Person class


    static int count;

    public Person(){ // Person() is a constructor
        count++;
        System.out.println("Creating a Constructor");
    }
    public Person(int newAge, String newName){ //Person() constructor is created
        this(); //With the help of this
        name = newName;
        age = newAge;
    }

    void walk() { // walk method is created   // Behaviour of Person class
        System.out.println(name + " is walking");
    }
    void eat() { //eat method is created // Behaviour of Person class
        System.out.println(name + " is eating");
    }
    void walk(int steps){ // walk method created again but with arguments // Behaviour of Person class
        System.out.println(name + " walked " + steps );
    }

}
