package com.sda.javapodstawy.petle;

import java.util.Random;

public class przyklad {
    public static void main(String[] args) {
        Random r = new Random();
        int i = -1;
        while( i % 5 != 0 ){
            i = r.nextInt(100);
            System.out.println("wartosc = " + i);
        }
    }
}
//zadanie 3b
// napisz petle, ktora przyjmuje wartosci typu int
// dodaje je do siebie a na koniec drukuje ich sume
// mozecie ustalic umowna górną granice ilosci podanych cyfr
// * niech jest tak, ze po dodaniu 0, program przerywa dzialanie

