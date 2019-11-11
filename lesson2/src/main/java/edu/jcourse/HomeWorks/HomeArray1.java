package edu.jcourse.HomeWorks;

public class HomeArray1 {

    public static void main(String[] args) {
        int arraySize = 10;
        int a[] = new int[arraySize];
        int b = Integer.parseInt(args[0]);  //argument 0 =  7 (po zadaniju nado umnizhitj na 7


        for (int i = 0; i < a.length; i++) {
            a[i] = i; //+1 10 raz


            System.out.println(a[i] *= b); //vivod ot 0 do 9 i kazhdij element umnozhen na 7


        }
    }
}
