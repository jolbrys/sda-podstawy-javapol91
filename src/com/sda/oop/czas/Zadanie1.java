package com.sda.oop.czas;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Zadanie1 {
    public static void main(String[] args) {
        //wypisz biezaca date, czas i datetime korzystajac z wybranych formatterow
        LocalDateTime localDateTime = LocalDateTime.now();
        LocalDate localDate = LocalDate.now();
        LocalTime localTime = LocalTime.now();

        DateTimeFormatter dateFormatter = DateTimeFormatter.ISO_DATE;
        DateTimeFormatter timeFormatter = DateTimeFormatter.ISO_TIME;

        System.out.println(dateFormatter.format(localDateTime));
        System.out.println(dateFormatter.format(localDate));
        System.out.println(timeFormatter.format(localTime));
    }
}
// drugie zadanie: o dla strefy America/Detroit
//podpowiedz: wczytaj string i uzyj parsera (linijki 23-25 w przykladzie)