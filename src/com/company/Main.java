package com.company;
import java.util.Scanner;
import java.util.ArrayList;


public class Main {
    //this class will contain the main method
    //in the main method create an instance of a car

    public static void main(String[] args){
//create an instance of a cars
        ArrayList<Car> cars = new ArrayList<> (  );
        Car car = new Car ();
//prompt from user and populate car class

//add car to the cars arraylist
Scanner input = new Scanner(System.in);
//        System.out.println ("What is the description?");
//        String desc = input.nextLine ();
//        Car b = new Car();
//        System.out.println ( car.getDesc () );

//        cars.add(car);
//        for(Car item: cars) {




        Car a = new Car();     //create an object
        a.setMake("Toyota");
        a.setColor("Black");
        a.setSpeed(65);

        print(a.starting());
        print(a.accelerate());
        print(a.speed());
        print(a.stop());

        System.out.println ("");

        Car a1 = new Car();
        a1.setMake("BMW");
        a1.setColor("Yellow");
        a1.setSpeed(105);

      print(a1.starting());
        print(a1.accelerate());
        print(a1.speed());
        print(a1.stop());
    }

    private static void print(String p) {
        System.out.println(p);
    }
}

