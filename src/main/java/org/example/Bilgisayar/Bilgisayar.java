package org.example.Bilgisayar;

public class Bilgisayar {
    String renk;
    String ram;
    int inc;
    String fare;
    String id;
    String anakart;

    public Bilgisayar(String renk, String ram, int inc, String fare, String anakart) {
        this.renk = renk;
        this.ram = ram;
        this.inc = inc;
        this.fare = fare;
        this.anakart = anakart;

    }

    public Bilgisayar() {
    }

    @Override
    public String toString() {
        return "Bilgisayar{" +
                "renk='" + renk + '\'' +
                ", ram='" + ram + '\'' +
                ", inc=" + inc +
                ", fare='" + fare + '\'' +
                ", id='" + id + '\'' +
                ", anakart='" + anakart + '\'' +
                '}';
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }


    public int getInc() {
        return inc;
    }

    public void setInc(int inc) {
        this.inc = inc;
    }

    public String getFare() {
        return fare;
    }

    public void setFare(String fare) {
        this.fare = fare;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAnakart() {
        return anakart;
    }

    public void setAnakart(String anakart) {
        this.anakart = anakart;
    }
}
