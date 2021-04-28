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
//w mainie: switch case lub ify, w zależości od znaku (który pobieramyz klasy)
//wolamy odpowiednie metody z klasy kalkulator

// 2 wariant: robimy prywatne metody do dzialan w kalkulatorze i jedna statyczna
// która ma w sobie ify i wywołuje odpowiednia metode