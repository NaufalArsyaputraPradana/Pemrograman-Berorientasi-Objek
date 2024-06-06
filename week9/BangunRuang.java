package week9;
import week9.BangunDatar;

public class BangunRuang extends BangunDatar {
    
    private int tinggi; // tinggu untuk bentuk 3 dimensi

    // Constructor untuk kubus
    public BangunRuang(int sisi) {
        super(sisi); //memanggil constructor dari BangunDatar dengan satu parameter (sisi)
    }

    // Constructor untuk balok
    public BangunRuang(int panjang, int lebar, int tinggi) {
        super(panjang, lebar); // memanggil constructor dari BangunDatar dengan dua parameters (panjang, lebar)
        this.tinggi = tinggi; // Set untuk tinggi
    }

    // Constructor untuk tabung
    public BangunRuang(double diameter, int tinggi) {
        super(diameter); // memanggil constructor dari BangunDatar dengan satu parameter (diameter)
        this.tinggi = tinggi; // Set untuk tinggi
    }

    public int getTinggi()
    {
        return tinggi;
    }

    // Method untuk menghitung volume kubus
    public int volumeKubus() {
        int area = super.luasPersegi(); // memanggil luas (persegi)
        return area * super.sisi; // Volume = area * tinggi (yang mana panjang sisinya sama)
    }

    // Method untuk menghitung volume balok 
    public int volumeBalok() {
        int area = super.luasPersegiPanjang(); // memanggil luas (persegi panjang)
        return area * tinggi; // Volume = area * tinggi
    }

    // Method untuk menghitung volume tabung
    public double volumeTabung() {
        double area = super.luasLingkaran(); // memanggil luas (circle)
        return area * tinggi; // Volume = area * tinggi
    }
}
