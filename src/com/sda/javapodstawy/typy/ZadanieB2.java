package com.sda.javapodstawy.typy;

import java.util.Scanner;

public class ZadanieB2 {
    //tresc 2
    //oblicz BMI na podstawie zadanego wzrostu i wagi
    //BMI = masa w kg  podzielona przez wzrost (w metrach) podniesiony do kwadratu

    public static void main(String[] args) {
        Integer wzrost;
        Double waga;
        Double BMI;
        System.out.println("prosze podac wzrost w metrach:");
        Scanner input = new Scanner (System.in);
        wzrost = input.nextInt();
        System.out.println("prosze podac wage:");
        Scanner input2 = new Scanner(System.in);
        waga = input2.nextDouble();
        BMI = waga / (wzrost*wzrost);
        System.out.println("wynik" + BMI);
    }
}
