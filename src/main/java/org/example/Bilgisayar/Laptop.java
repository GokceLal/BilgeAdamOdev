package org.example.Bilgisayar;

public class Laptop extends Bilgisayar{
    public Laptop(String renk, String ram, int inc, String fare, String anakart) {
        super(renk, ram, inc, fare, anakart);
    }


    @Override
    public String toString() {
        return "Laptop{" +
                "renk='" + renk + '\'' +
                ", ram='" + ram + '\'' +
                ", inc=" + inc +
                ", fare='" + fare + '\'' +
                ", id='" + id + '\'' +
                ", anakart='" + anakart + '\'' +
                '}';
    }
}
