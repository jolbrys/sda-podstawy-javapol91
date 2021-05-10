package com.sda.oop.figury;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //tresc
        // chcemy miec kalkulator, ktory zczytuje od uzytkownika nazwe figury
        // oraz jej niezbede wymiary i oblicza obwod i pole powierzchni
        //zadanie: dodaj trojkat 

        System.out.println("Podaj figure");
        Scanner input = new Scanner(System.in);
        String figura = input.next();


        if(figura.equals("kolo")){
            Kolo kolo = new Kolo();
            kolo.zczytaj();

            System.out.println("wymiary kola");
            System.out.println("obwod: " + Kalkulator.obliczObwod(kolo));
            System.out.println("pole: " + Kalkulator.obliczPole(kolo));

        }
        else if(figura.equals("prostokat")){
            Prostokat prostokat = new Prostokat();
            prostokat.zczytaj();
            System.out.println("wymiary prostokata");
            System.out.println("obwod: " + Kalkulator.obliczObwod(prostokat));
            System.out.println("pole: " + Kalkulator.obliczPole(prostokat));
        }
        else{
            System.out.println("nie ma takiej figury!");
        }

    }
}
