package week10;
import week10.BangunDatar;

public class Lingkaran extends BangunDatar{

    private double diameter; // diameter for circleuntuk lingkaran
    private static final double pi = 3.14; // nilai konstan untuk pi

    // Constructor untuk lingkaran
    public Lingkaran(double diameter) {
        this.diameter = diameter;
    }

    public double getDiameter() {
        return diameter;
    }

   // Method untuk menghitung lingkaran
    public double hitungLuasLingkaran() {
        double r = diameter / 2;
        return pi * (r * r);
    }

    public void luas(){
        System.out.println("Luas Lingkaran dengan Panjang Diameter "+diameter+" adalah "+hitungLuasLingkaran());
    }

    public double hitungKelilingLigkaran(){
        return pi * diameter;
    }

    public void keliling(){
        System.out.println("Keliling Lingkaran dengan Panjang Diameter "+diameter+" adalah "+hitungKelilingLigkaran());
    }
    
}