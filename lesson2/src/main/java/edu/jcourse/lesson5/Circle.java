package edu.jcourse.lesson5;

public class Circle {

    private float radius;
    private final float PI = 3.14F;

    private final float YEAR = 2019; //konstanta pishetsja boljshimi bukvami

    public float area() {
        return PI * (radius * radius);
    }


//    public float getRadius() {
//        return radius;
//    }
//    get nenuzhno

    public void setRadius(float radius) { this.radius = radius; }
}
