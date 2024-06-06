package week10;
import week10.BangunDatar;

public class PersegiPanjang extends BangunDatar{
    private int panjang;
    private int lebar;

    public PersegiPanjang(int panjang, int lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    public int getPanjang(){
        return panjang;
    }

    public int getLebar(){
        return lebar;
    }

    public int hitungLuasPersegiPanjang(){
        return panjang*lebar;
    }

    public void luas(){
        System.out.println("Luas Persegi Panjang dengan Panjang "+panjang+" dan Lebar "+lebar+" adalah "+hitungLuasPersegiPanjang());
    }

    public int hitungKelilingPersegiPanjang(){
        return 2*(panjang+lebar);
    }

    public void keliling(){
        System.out.println("Kelilig Persegi Panjang dengan Panjang "+panjang+" dan Lebar "+lebar+" adalah "+hitungKelilingPersegiPanjang());
    }

    public String hitungLuas() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'hitungLuas'");
    }

    public String hitungLuasLingkaran() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'hitungLuasLingkaran'");
    }
    
}