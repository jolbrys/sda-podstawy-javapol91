package com.sda.oop.czas;

import java.time.LocalDate;
import java.util.Scanner;

public class Zadanie3 {
    public static void main(String[] args) {
        //wczytaj date (bez godziny) od uzytkownika, dodaj do niej 10 dni i wyswietl

        //podpowiedz: w trakcie pisania kodu, wpisz kropke po obiekcie i zobacz jakie metody podpowiada intellij
        System.out.println("podaj date w formacie yyyy-MM-dd");
        Scanner input = new Scanner(System.in);
        String inString = input.next();

        LocalDate parsedLocalDate = LocalDate.parse(inString);
        parsedLocalDate.plusDays(10);
        System.out.println(parsedLocalDate);


    }
}
