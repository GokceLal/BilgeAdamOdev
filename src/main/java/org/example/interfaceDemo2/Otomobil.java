package org.example.interfaceDemo2;

public class Otomobil  extends Arac implements IKaraTasiti{


    @Override
    public void sur() {
        System.out.println(getClass().getSimpleName()+" hareket ediyor");
    }
}
