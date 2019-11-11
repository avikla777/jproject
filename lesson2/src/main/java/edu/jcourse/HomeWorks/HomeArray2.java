package edu.jcourse.HomeWorks;

public class HomeArray2 {
    public static void main(String[] args) {
    int arraySize = 10;
    int a[] = new int[arraySize];
    int b = Integer.parseInt(args[0]);  //argument 0 =  7 (po zadaniju nado umnizhitj na 7
    int sum=0;

    for (int i = 0; i < a.length; i++) {

      a[i] = i * b;
        for (int element : a)
            sum += element;

           //sum = sum + a[i];

          //  System.out.println(sum);


    System.out.println(sum);

    }
}
}
