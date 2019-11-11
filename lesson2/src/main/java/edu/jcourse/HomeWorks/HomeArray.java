package edu.jcourse.HomeWorks;

//vivod revers massiva 0-9
public class HomeArray {

    public static void main(String[] args) {
        int arraySize = 10;
        int a[] = new int[arraySize];

        for (int i = 0; i < a.length; i++) {
            a[i] = i;

            System.out.println(a[a.length - i - 1]);

        }
    }
}