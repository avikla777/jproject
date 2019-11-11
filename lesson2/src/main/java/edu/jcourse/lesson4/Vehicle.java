package edu.jcourse.lesson4;

public class Vehicle {

    String name;
    int passengers;
    int tank;
    float fuelPer100km;

    Vehicle() {
    } //cchtobi rabotal this.parametri
    // vse int naverhu eto svojstva ili polja klassa
    //esli zapravitj polnij bak to skoljko km smozhet proehatj

//    float distance() {
//        return (tank * 100) / fuelPer100km; // dobavili metod


    public Vehicle(String name, int passengers, int tank, float fuelPer100km) {
        this.name = name;
        this.passengers = passengers;
        this.tank = tank;
        this.fuelPer100km = fuelPer100km;
    }

    void distance() {
        float distance = (tank * 100) / fuelPer100km;
        System.out.println("Distance for " + name + " is " + distance + " km");
    }


}
