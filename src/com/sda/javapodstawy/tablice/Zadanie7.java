package com.sda.javapodstawy.tablice;

public class Zadanie7 {
    //stworz tablice typu string z co najmniej jednym powtarzajacym sie elementem
    //napisz program który wypisuje te powtarzajace sie elementy
    //pamietajcie że String jest typem obiektowym i nie mozna go porównywać przez
    // == tylko trzeba użyć metody .equals

    public static void main(String[] args) {
        String[] tablica = {"aaa", "bbb", "ccc", "bbb", "ddd", "aaa"};
        //output:
        // aaa bbb

        String a = "aaa";
        if(a.equals("aaa")){
            System.out.println("sie zgadza");
        }

    }
}
