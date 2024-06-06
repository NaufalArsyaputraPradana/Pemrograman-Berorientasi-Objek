package week10;
import week10.BangunDatar;

public class Main{
    public static void main(String[] args){
        PersegiPanjang rectangle = new PersegiPanjang(3,2);
        Persegi square = new Persegi(3);
        Lingkaran circle = new Lingkaran(2);

        System.out.println("Luas: " + rectangle.hitungLuasPersegiPanjang());
        rectangle.luas();
        
        System.out.println("Keliling: " + rectangle.hitungKelilingPersegiPanjang());
        rectangle.keliling();

        System.out.println(" ");

        System.out.println("Luas: " + square.hitungLuasPersegi());
        square.luas();
        
        System.out.println("Keliling: " + square.hitungKelilingPersegi());
        square.keliling();

        System.out.println(" ");

        System.out.println("Luas: " + rectangle.hitungLuasLingkaran());
        circle.luas();
        
        System.out.println("Keliling: " + circle.hitungKelilingLigkaran());
        circle.keliling();
    }
}