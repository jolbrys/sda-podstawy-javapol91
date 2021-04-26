package com.sda.javapodstawy.warunkowe;

import java.util.Scanner;

public class Zadania1a {
    //zmodyfikuj program tak, aby
    // - pobieral liczbe od uzytkownika
    // - jesli liczba jest podzielna przez 3 wypisz słowo Fizz
    // - jesli liczba jest podzielna przez 5 wypisz słowo Buzz
    // - jesli liczba jest podzielna przez 3 oraz 5 wypisz słowo FizzBuzz
    // - jesli nie jest podzielna ani podzielna przez ani 3 ani 5, wypisz tę liczbę (iterator)

    public static void main(String[] args) {
        int liczba;
        Scanner wejscie = new Scanner(System.in);
        System.out.println("Podaj liczbe");
        liczba = wejscie.nextInt();
        if (liczba % 5 == 0 && liczba % 3 == 0) {
            System.out.println("Liczba jest podzielna przez 5 i 3");
        } else if (liczba % 3 == 0){
            System.out.println("Liczba jest podzielna przez 3");
        }else if (liczba % 5 == 0){
            System.out.println("Liczba jest podzielna przez 5");
        }
        else {
            System.out.println("Liczba nie jest podzielna ani przez 3 ani przez 5");
        }
    }
}
