package edu.jcourse.lesson4;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Vehicle miniVan = new Vehicle(); //operator new i operator tochka
        miniVan.passengers = 7;
        miniVan.tank = 70;
        miniVan.fuelPer100km = 8.5F; // tip s plav.tochkoj
        miniVan.name = "Multivan";
        miniVan.distance(); // vivod km na polnij bak


        //System.out.println("Distance: " + miniVan.distance()); proshlij metod
     //   System.out.println("MiniVan: " + miniVan.passengers + " " + miniVan.tank + " " + miniVan.fuelPer100km);


        Vehicle sportCar = new Vehicle();
        sportCar.passengers = 2;
        sportCar.tank = 50;
        sportCar.fuelPer100km = 18.5F;
        sportCar.name = "Porsche";
        sportCar.distance(); // vivod km na polnij bak

       // System.out.println("Distance: " + sportCar.distance()); proshlij metod

        //System.out.println("SportCar: " + sportCar.passengers + " " + sportCar.tank + " " + sportCar.fuelPer100km);
    }
}
