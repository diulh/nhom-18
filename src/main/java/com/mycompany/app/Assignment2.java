package com.mycompany.app;
class Number{
    public int i;
}
public class App {
    public static void main(String[] args) {
        Number n1 = new Number();
        Number n2 = new Number();
        n1.i = 2;
        n2.i = 5;
        n1 = n2 ;
        n2.i = 10;
        n1.i = 20;
        System.out.println("n1.i: " + n1.i);
        System.out.println("n2.i: " + n2.i);
    }
}