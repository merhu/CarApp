package com.company;
//This is the parent class
public class Vehicle {

//getter and setter here

    private String color;
    private String name;
    private String Desc;

private Car car;


    public Vehicle (){

    }
    public Vehicle(String color, String name) {
        this.color = color;
        this.name = name;
    }
    public String getColor() {
        return color;
    }
    public String getDesc(){
        return Desc;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
