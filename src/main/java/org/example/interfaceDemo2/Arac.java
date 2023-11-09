package org.example.interfaceDemo2;

public class Arac  implements IHaraket{
    private  int hiz;


    public int getHiz() {
        return hiz;
    }

    public void setHiz(int hiz) {
        this.hiz = hiz;
    }

    @Override
    public String toString() {
        return "Arac{" +
                "hiz=" + hiz +
                '}';
    }

    @Override
    public void hizlan() {
        System.out.println(getClass().getSimpleName()+ "  hızlanıyor");
    }

    @Override
    public void yavasla() {
        System.out.println(getClass().getSimpleName()+"  yavaslıyor");
    }
    public void yukAlma(){
        System.out.println(getClass().getSimpleName()+ " yük aldı");
    }
    public void yukVerme(){
        System.out.println(getClass().getSimpleName()+ " yükü teslim etti ");
    }
}
