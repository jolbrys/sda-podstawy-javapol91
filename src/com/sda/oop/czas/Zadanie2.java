package com.sda.oop.czas;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Zadanie2 {
    public static void main(String[] args) {
        //wczytaj date od uzytkownika w formacie 2019-12-07 i wydrukuj jako 07.12.2019
        //podpowiedz: pobierz jako string, uzyc parsera
        //podpowiedz 2: potem do wydruku uzyc customowego formattera

        System.out.println("podaj date w formacie yyyy-MM-dd");
        Scanner input = new Scanner(System.in);
        String inString = input.next();

        LocalDate parsedLocalDate = LocalDate.parse(inString);
        DateTimeFormatter custom = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        System.out.println(custom.format(parsedLocalDate));

    }
}
