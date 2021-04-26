package com.sda.javapodstawy.typy;


import java.util.Scanner;

public class ZadanieA {
    //tresc:
    //napisz prosty program, ktory przelicza centymetry na cale
    //przyjmij ze 1 cal to 2.54 cm

    public static void main(String[] args) {
        //dane
        double cm ;
        double inch;

        System.out.println("prosze podac liczbe");
        Scanner wejscie = new Scanner(System.in);
        cm = wejscie.nextDouble();

        //obliczenia
        System.out.println("podana dlugosc w cm to bedzie w calach:");
        inch = cm / 2.54;

        //wynik
        System.out.println(inch);
    }
}
//tresc 1:
//napisz prosty program, ktory przelicza temperature zadana w stopniach celsiusa na stopnie fahrenheita
//wzor przeliczajacy celsjusze na fahrenheity: F = 32 + 1.8 * C
