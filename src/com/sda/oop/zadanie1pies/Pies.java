package com.sda.oop.zadanie1pies;

public class Pies {
    public Pies(String rasa, String plec){
        this.wiek = 0;
        this.rasa = rasa;
        this.plec = plec;
    }

    private String rasa;
    private int wiek;
    private String plec;

    public void setWiek(int wiek){
        this.wiek = wiek;
    }
    public int getWiek(){
        return this.wiek;
    }
    public void szczekansko(){
        System.out.println("Hau Hau");
    }
    public void wydrukujParametry(){
        System.out.println(this.rasa);
        System.out.println(this.wiek);
        System.out.println(this.plec);
    }
}
