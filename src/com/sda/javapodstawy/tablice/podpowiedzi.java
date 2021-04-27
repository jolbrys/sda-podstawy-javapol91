package com.sda.javapodstawy.tablice;

import java.util.Random;
import java.util.Scanner;

public class podpowiedzi {
//pobieranie liczby
    Scanner in = new Scanner(System.in);
    int a = in.nextInt();

    //losowa liczba
    Random rand = new Random();
    int losowa_liczba = rand.nextInt(100);

//deklaracja tablicy o zadanej wielkosci
    int[] tablica = new int[a];
    String[] tablicaString = {"Andrzej", "Alicja", "Bob", "Jakub", "Marian"};
//for each
/*    for (int element : tablica ){
        //
    }
    //dlugosc stringa
    String a = "1111";
    dlugosc = a.length();
*/
/*

1. stwórz tablice z jakimis wartosciami i przepisz ją do drugiej tablicy za pomocą pętli for


2 * to samo, ale druga tablica w odwrotnej kolejności

*/


}
