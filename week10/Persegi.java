package week10;
import week10.BangunDatar;

public class Persegi extends BangunDatar{
    private int sisi;

    public Persegi(int sisi) {
        this.sisi = sisi;
    }

    public int getSisi(){
        return sisi;
    }

    public int hitungLuasPersegi(){
        return sisi*sisi;
    }

    public void luas(){
        System.out.println("Luas Persegi Panjang dengan Panjang Sisi "+sisi+" adalah "+hitungLuasPersegi());
    }

    public int hitungKelilingPersegi(){
        return 4*sisi;
    }

    public void keliling(){
        System.out.println("Keliling Persegi dengan Panjang Sisi "+sisi+" adalah "+hitungKelilingPersegi());
    }
    
}