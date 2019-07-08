
//child class, inherites from vehicle class
package com.company;

import java.util.ArrayList;

//Vehicle class. Car should contain the following:
//private member variables
//a default constructor
//an overloaded constructor
//methods which return a
// string indicating each task the car is performing.
//member variables
//default constructor
// overloaded constructor
//methods which return a string indicating each tas the car is performing
    public class Car extends Vehicle {
    //Private member variables

    private String make, model;
    private int speed;

    //default constructor

    public Car() {
    }

    //Overloaded constructor

    public Car (String color, String name, String make) {
        super ( color, name );
        this.make = make;
    }


    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;

    }

    //methods returning a string indicating each task the car is performing.

    public String starting(){
        return "The " + getColor() + " " + getMake()   + " is starting.";
    }
    public String accelerate(){
        return "The " + getColor() + " " + getMake ()  + " is accelerating.";
    }
    public String speed(){
        return "The " + getColor() + " " + getMake ()  + " is going " + getSpeed () + " mph.";
    }
    public String stop(){
        return "The " + getColor() + " " + getMake ()  + " has stopped.";


    }

}
