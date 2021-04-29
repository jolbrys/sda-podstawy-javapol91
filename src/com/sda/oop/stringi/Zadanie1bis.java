package com.sda.oop.stringi;

public class Zadanie1bis {
    //jest zadany string
    //i trzeba napisac metode, ktory kazdy znak zdubluje
    //np string abc wypisze jako aabbcc
    // drugie zadanie: to samo tylko ze dubluje słowa
    //np "atos portos aramis" jako "atos atos portos portos aramis aramis"

    public static void main(String[] args) {
        System.out.println(doubleLetters("ASDF"));
        System.out.println(doubleWords("atos portos aramis"));
    }

    public static String doubleLetters(String input){
        String result = "";

        for(int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            result = result + c;
            result = result + c;
        }
        return result;
    }
    public static String doubleWords(String input){
        String result = "";

        for (String word : input.split(" ")){
            result = result + word + " " + word + " ";
        }

        return result;
    }

}
