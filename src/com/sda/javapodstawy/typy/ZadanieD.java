package com.sda.javapodstawy.typy;

import java.util.Scanner;

public class ZadanieD {
    //napisz program ktory
    //  1. zczytuje od uzytkownika dystans i czas jego pokonania
    //  2. a nastepnie podaje predkosc wyrazona w
    //      - metrach na sekunde
    //      - metrach na godzine
    //      - milach na godzine
    //
    //przyjmij ze 1 mila to 1609 metrow

    public static void main(String[] args) {
        //dane
        double dystans;
        int godziny;
        int minuty;
        int sekundy;

        Scanner input = new Scanner(System.in);

        //zczytywanie
        System.out.println("Podaj dystans w metrach");
        dystans = input.nextDouble();

        System.out.println("Podaj godziny");
        godziny = input.nextInt();

        System.out.println("Podaj minuty");
        minuty = input.nextInt();

        System.out.println("Podaj sekundy");
        sekundy = input.nextInt();

        //obliczenia
        int suma_sekund = godziny * 3600 + minuty * 60 + sekundy;
        double metry_na_sekunde = dystans / suma_sekund;

        //drukowanie
        System.out.println("metry na sekunde:");
        System.out.println(metry_na_sekunde);

        //dalej analogicznie

    }
}
