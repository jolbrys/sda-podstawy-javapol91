package com.sda.oop.stringi;

public class Zadanie1 {

    public static void main(String[] args) {
        String napis = "asdf";
        System.out.println(doubleLetters(napis));
    }

    public static String doubleLetters(String input) {
        String s = "abc";
        String result = "";
        int i = 0;
        while (i < s.length()) {
            char c = s.charAt(i);
            result = result + c + c;
            i++;
        }
        return result;
    }

    public static String doubleWords(String input) {

        return "";
    }
}
