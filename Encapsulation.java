package com.company;

import encapsulation.EncapsulationIntro;
// Encapsulation is used for data hiding or security purpose
// The methods and variables are kept in a single entity
public class Encapsulation {
    public static void main(String[] args) {
        EncapsulationIntro obj = new EncapsulationIntro();
        obj.doWork();
    }
}
/* Access Specifiers
public : It can be acccessed from anywhere like from any package or any class, etc
private : It cannot be acessed by anyone not even its own class
protected : It can be accessed only by its parent and child classes
 */