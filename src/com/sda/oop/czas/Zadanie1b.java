package com.sda.oop.czas;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class Zadanie1b {
    //wypisz date i czas w strefie America/Detroit
    //podpowiedz: do zmiany strefy uzyj obiektu klasy Clock
    public static void main(String[] args) {

        Clock clock = Clock.system(ZoneId.of("America/Denver"));
        LocalDateTime localDateTime = LocalDateTime.now(clock);
        LocalDate localDate = LocalDate.now(clock);
        LocalTime localTime = LocalTime.now(clock);



        System.out.println(localDateTime);
        System.out.println(localDate);
        System.out.println(localTime);
    }



}
//jesli juz macie to sobie zostawcie do kolejnego zadania:
//wczytaj czas od uzytkownika i wypisz date
//podpowiedz: wczytaj string i uzyj parsera