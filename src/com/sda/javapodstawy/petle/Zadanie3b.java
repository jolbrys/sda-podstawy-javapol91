package com.sda.javapodstawy.petle;

import java.util.Scanner;

public class Zadanie3b {
    //zadanie 3b
    // napisz petle, ktora przyjmuje wartosci typu int
    // dodaje je do siebie a na koniec drukuje ich sume
    // mozecie ustalic umowna górną granice ilosci podanych cyfr
    // * niech jest tak, ze po dodaniu 0, program przerywa dzialanie

    public static void main(String[] args) {
        System.out.println("Podaj liczbę ");
        Scanner sc = new Scanner(System.in);
        int suma = 0;
        int liczba = 1;
        while (liczba != 0) {
            liczba = sc.nextInt();
            suma += liczba;
        }
        System.out.println("Suma tych liczb to: " + suma);
    }
}
