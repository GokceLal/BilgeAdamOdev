package org.example.Bilgisayar;

public class Tablet extends Bilgisayar{


    public Tablet(String renk, String ram, int inc, String fare, String anakart) {
        super(renk, ram, inc, fare, anakart);
    }

    @Override
    public String toString() {
        return "Tablet{" +
                "renk='" + renk + '\'' +
                ", ram='" + ram + '\'' +
                ", inc=" + inc +
                ", fare='" + fare + '\'' +
                ", id='" + id + '\'' +
                ", anakart='" + anakart + '\'' +
                '}';
    }
}

