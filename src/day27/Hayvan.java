package day27;

public class Hayvan {
    private int yas;
    private double agirlik;
    private String isim;



    //private yas değişkeni okunup, çağırıldığı yere döndürülür.
    public int yasiGetir(){
        return yas;
    }
    public void yasiKaydet(int yas){
        this.yas=yas;
    }


    public double agirligiGetir(){
        return agirlik;
    }

    public void agirligiKaydet(double agirlik){
        this.agirlik=agirlik;
    }

    public String ismiGetir(){
        return isim;
    }

    public void ismiKaydet(String isim){
        this.isim=isim;
    }





    void beslen(){
        System.out.println("Hayvan besleniyor.");
    }

    void uyu(){
        System.out.println("Hayvan uyuyor");
    }
}
