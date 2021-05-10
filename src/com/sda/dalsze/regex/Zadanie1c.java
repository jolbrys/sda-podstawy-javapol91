package com.sda.dalsze.regex;

public class Zadanie1c {
    //napisz walidator dla adresu email
    //umówmy się że adres e-mail składa się z:
    //przed małpą: dowolne litery(male, w mailu nie rozrozniamy), dowolne cyfry, znaki: . - _
    //potem małpa
    //po małpie nazwa domeny - znowu dowolna ilosc liter i cyfr   <-- ad. do gwiazdki
    //po nazwie domeny kropka i od 2 do 10 liczba malych liter
    //zaden element nie moze byc pusty (np brak tego co przed malpa)

    //z gwiazdka: zeby nazwa nie mogla sie konczyc kropka. tzn moze byc kropka w nazwie, ale nie na koncu
    //np asdf@ab.cd.com, ale nie asdf@ab..com
    //tzn zeby nie bylo np adres asdf@gmail..com

}
