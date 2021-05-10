package com.sda.dalsze.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Zadanie1b {
    public static void main(String[] args) {
        String regex = "[A-Z]{2}[0-9]{28}";
        String input1 = "93122112345";
        String input2 = "PL1234567123456712345671234567";

        validate(regex, input1);
        validate(regex, input2);

    }

    public static void validate(String regex, String input){
        Pattern pattern = Pattern.compile(regex);
        if(pattern.matcher(input).matches()){
            System.out.println("pasuje");
        }
        else {
            System.out.println("nie pasuje");
        }
    }
}
