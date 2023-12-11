package com.polimorfizm;

public class Car {

    public int numOfSeets = 4;
    int maxSpeed = 300;
    public void driving(){
        System.out.println("driving");
    }
    int getMaxSpeed(){
        return maxSpeed;
    }

    int getNumOfSeets(){
        return numOfSeets;
    }

}
