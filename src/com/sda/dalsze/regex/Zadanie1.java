package com.sda.dalsze.regex;

import java.util.regex.Pattern;

public class Zadanie1 {
    //napisz walidator dla numeru PESEL
    public static void main(String[] args) {
        Pattern peselPattern = Pattern.compile("[a-zA-Z0-9.-_%]+@[a-zA-Z0-9]*\\.[a-zA-Z]+");
        if(peselPattern.matcher("asdf@gma.il.com").matches())
        {
            System.out.println("email legit");
        };


    }

}

//przeniesiemy to na koniec do metody
//Dopisz kolejne walidatory dla maila i dla IBAN i dla NIP