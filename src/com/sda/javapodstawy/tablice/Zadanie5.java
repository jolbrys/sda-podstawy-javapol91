package com.sda.javapodstawy.tablice;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Zadanie5 {
    //stworz tablice int i napisz metode ktora wypisze najwieksza i najmniejsza wartosc z niej
    //nastepnie napisz metode która zwraca lub drukuje drugą największą liczbe w tablicy
    // podpowiedz: spróbuj wewnatrz niej użyć metody Arrays.sort()
    //podpowiedz 2: można łatwo wypisać tablice metoda Arrays.toString(tablica) (niekoniecznie w tym zadaniu)
    public static void main(String[] args) {
        //deklaracja tablicy
        int[] tablica = {431, 344, 564, 1, 32, 5, 403, 999};

        Arrays.sort(tablica);
        System.out.println(Arrays.toString(tablica));
        System.out.println("min: " + tablica[0]);
        System.out.println("max: " + tablica[tablica.length-1]);
        System.out.println("second biggest: " + tablica[tablica.length-2]);


        //petla iterujaca po elementach tablicy (tzw. for each)
        for(int element : tablica){


        }
    }
}
