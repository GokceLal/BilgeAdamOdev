package org.example.Bilgisayar;

public class Telefon extends Bilgisayar{
    public Telefon(String renk, String ram, int inc, String fare, String anakart) {
        super(renk, ram, inc, fare, anakart);


    }

    @Override
    public String toString() {
        return "Telefon{" +
                "renk='" + renk + '\'' +
                ", ram='" + ram + '\'' +
                ", inc=" + inc +
                ", fare='" + fare + '\'' +
                ", id='" + id + '\'' +
                ", anakart='" + anakart + '\'' +
                '}';
    }
}
