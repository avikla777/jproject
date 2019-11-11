package edu.jcourse.lesson2.dadatypes;

public class LiteralsDemo {
    public static void main(String[] args) {
        long var1 = 12_345L;

        float f = var1 * 2.54F;

        int hex = 0xFF;
        System.out.println(hex);
        System.out.println("It\'s my computer");

        System.out.println("\"Java\" is a programming language");
        System.out.println("My path is: C:\\devtools");

        System.out.println("First line.\nSecond line.");

        System.out.println("Text\b\b\b");

        System.out.println("\u2764");

        System.out.println("Nr\tItem\tComment\t");

        System.out.println("1\tOne\t\tMy Comment\t");
    }
}
