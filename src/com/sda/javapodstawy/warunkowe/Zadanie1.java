package com.sda.javapodstawy.warunkowe;

import java.util.Scanner;

public class Zadanie1 {
    //napisz program który sprawdza czy liczba jest parzysta
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int liczba = input.nextInt();

        if (liczba % 2 == 0) {
            System.out.println("liczba jest parzysta");
        } else {
            System.out.println("liczba jest nieparzysta");
        }

    }
}

