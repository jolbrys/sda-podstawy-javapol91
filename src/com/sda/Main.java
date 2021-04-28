package com.sda;

public class Main {
    public static void main(String[] args) {

        metodaJeden();
        metodaDwa(10);
        System.out.println(metodaPomnoz(11));

    }

    public static void metodaJeden(){
        System.out.println("Hello, World!");
    }

    public static void metodaDwa(int a){
        System.out.println("Podano " + a);
    }

    public static int metodaPomnoz(int a){
        return a * 2;
    }



}
