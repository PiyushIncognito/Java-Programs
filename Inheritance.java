package com.company;

class GrandFather{
    String name;
    int age;
    public GrandFather(int age, int String){
        this.age = age;
        this.name = name;
        } void walk(){
        System.out.println(name + " can walk");
    }
}
class Father extends GrandFather{
    public Father(int age, int String){
        super(age, String);
    }
}


public class Inheritance {
    public static void main(String[] args) {

    }
}

