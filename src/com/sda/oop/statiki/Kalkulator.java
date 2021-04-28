package com.sda.oop.statiki;

public class Kalkulator {

    public static String znak;

    public static double dodawanie(double a, double b){
        return a + b;
    }

}

// napisac statyczne metody dla kazdego z dzialan (dodawanie, odejmowanie
// mnozenie, dzielenie reszta z dzielenia (%)
// robimy zmienną statyczna ktora bedzie przechowywac znak dzialania
//w mainie: zczytujemy string ze znakiem i nadpisujemy nim zmienna w klasie Kalkulator
//w mainie lub Kalkulatorze: switch case lub ify, w zależości od znaku (który pobieramyz klasy)
//wolamy odpowiednie metody z klasy kalkulator

/*
 2 wariant:
 - w klasie Kalkulator, przerabiamy metody z dzialaniami arytmetycznymi na prywatne
 - rowniez w klasie Kalkulator, dodajemy publiczna metode ktora w zaleznosci od znaku wykonuje odpowiednie dzialanie
   wlasciwie chodzi o to zeby przerzucic tam ten switch-case ktory jest w mainie
 - w mainie zostaje pobranie liczb i znaku, przypisane znaku do zmienniej statycznej i wywolanie metody publicznej

*/