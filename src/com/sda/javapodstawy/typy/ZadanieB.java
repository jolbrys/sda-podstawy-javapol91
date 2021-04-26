package com.sda.javapodstawy.typy;

import java.util.Scanner;

public class ZadanieB {

    //tresc 1:
    //napisz prosty program, ktory przelicza temperature zadana w stopniach celsiusa na stopnie fahrenheita
    //wzor przeliczajacy celsjusze na fahrenheity: F = 32 + 1.8 * C

    public static void main(String[] args) {
        Integer wzrost;
        Double waga;
        Double BMI;
        System.out.println("prosze podac wzrost w metrach:");
        Scanner input = new Scanner (System.in);
        wzrost = input.nextInt();
        System.out.println("prosze podac wage:");
        Scanner input2 = new Scanner (System.in);
        waga = input2.nextDouble();

        BMI = waga / (Math.pow(wzrost, 2));

        System.out.println("wynik" + BMI);
    }
}