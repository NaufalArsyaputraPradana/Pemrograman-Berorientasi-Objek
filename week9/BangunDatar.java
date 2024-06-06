package week9;

public class BangunDatar {
    // Atribut untuk berbagai bentuk
    protected int sisi;       // sisi untuk persegi
    private int panjang;    // panjang untuk persegi panjang
    private int lebar;      // lebar untuk persegi panjang
    private double diameter; // diameter for circleuntuk lingkaran
    private static final double pi = 3.14; // nilai konstan untuk pi

    // Constructor untuk persegi
    public BangunDatar(int sisi) {
        this.sisi = sisi;
    }

    public int getSisi()
    {
        return sisi;
    }

    // Constructor untuk persegi panjang
    public BangunDatar(int panjang, int lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    public int getPanjang()
    {
        return panjang;
    }

    public int getLebar()
    {
        return lebar;
    }

    // Constructor untuk lingkaran
    public BangunDatar(double diameter) {
        this.diameter = diameter;
    }

    public double getDiameter()
    {
        return diameter;
    }

    // Method untuk menghitung luas persegi
    public int luasPersegi() {
        return sisi * sisi;
    }

    // Method untuk menghitung luas persegi panjang
    public int luasPersegiPanjang() {
        return panjang * lebar;
    }

    // Method untuk menghitung lingkaran
    public double luasLingkaran() {
        double r = diameter / 2;
        return pi * (r * r);
    }

    public String luasSegitiga(double panjangSegitiga, double tinggiSegitiga) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'luasSegitiga'");
    }
}
