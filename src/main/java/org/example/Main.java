package org.example;

import org.example.Bilgisayar.Bilgisayar;
import org.example.Bilgisayar.Laptop;
import org.example.Bilgisayar.Tablet;
import org.example.Bilgisayar.Telefon;

public class Main {
    public static void main(String[] args) {

        /**
         * Bir bilgisayar sınıfı soyutlayacagız
         *
         * bu bilgisayar sınıfnı kalıtım uygulayarak alt sınıflarını olusturalım (en az 2 tane alt sınıf)
         * ve bilgisayarlarımıza
         * anakart
         * ram ..mouse gibi 5 6 tane ozellik yazıp bu ozellikler içinde sınıflar yaratalım
         *
         * test sınıfndada denemelerle nesnelerimiz olusturalım
         */
        Bilgisayar bilgisayar = new Bilgisayar("pembe","500",16,"lenova","anakart");
        Laptop laptop = new Laptop("siyah","1",15,"fare","anakart");
        Tablet tablet= new Tablet("lacivelt","1",14,"toshiba","anakart");
        Telefon telefon= new Telefon("beyaz","2",15,"samsung","anakart");
        System.out.println(bilgisayar.toString());
        System.out.println(laptop.toString());
        System.out.println(tablet.toString());
        System.out.println(telefon.toString());




    }
}