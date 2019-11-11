package edu.jcourse.lesson2.dadatypes;

public class InchesToCm {
    public static void main(String[] args) {

        double Inches = Double.parseDouble(args[0]);
        double cm = Inches * 2.54F;
        System.out.println("Result: " + cm);

    }
}
