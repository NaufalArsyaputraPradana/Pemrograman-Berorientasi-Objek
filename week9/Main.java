package week9;
import week9.BangunDatar;
import week9.BangunRuang;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 

        System.out.println("Pilih bangun:");
        System.out.println("1. Bangun Datar");
        System.out.println("2. Bangun Ruang");
        int pilih = scanner.nextInt(); 

        switch (pilih) {
            case 1:
                System.out.println("Pilih jenis bangun datar:");
                System.out.println("1. Persegi");
                System.out.println("2. Persegi Panjang");
                System.out.println("3. Lingkaran");
                int choiceDatar = scanner.nextInt(); 
                
                switch (choiceDatar) {
                    case 1:
                        System.out.print("Masukkan sisi: ");
                        int sisi = scanner.nextInt();
                        BangunDatar persegi = new BangunDatar(sisi);
                        System.out.println("Luas Persegi: " + persegi.luasPersegi());
                        break;
                    case 2:
                        System.out.print("Masukkan panjang: ");
                        int panjang = scanner.nextInt();
                        System.out.print("Masukkan lebar: ");
                        int lebar = scanner.nextInt();
                        BangunDatar persegiPanjang = new BangunDatar(panjang, lebar);
                        System.out.println("Luas Persegi Panjang: " + persegiPanjang.luasPersegiPanjang());
                        break;
                    case 3:
                        System.out.print("Masukkan diameter: ");
                        double diameter = scanner.nextDouble();
                        BangunDatar lingkaran = new BangunDatar(diameter);
                        System.out.println("Luas Lingkaran: " + lingkaran.luasLingkaran());
                        break;
                    default:
                        System.out.println("Pilihan tidak valid.");
                }
                break;
                
            case 2:
                System.out.println("Pilih jenis bangun ruang:");
                System.out.println("1. Kubus");
                System.out.println("2. Balok");
                System.out.println("3. Tabung");
                int choiceRuang = scanner.nextInt(); 
                
                switch (choiceRuang) {
                    case 1:
                        System.out.print("Masukkan sisi: ");
                        int sisi = scanner.nextInt();
                        BangunRuang kubus = new BangunRuang(sisi);
                        System.out.println("Volume Kubus: " + kubus.volumeKubus());
                        break;
                    case 2:
                        System.out.print("Masukkan panjang: ");
                        int panjang = scanner.nextInt();
                        System.out.print("Masukkan lebar: ");
                        int lebar = scanner.nextInt();
                        System.out.print("Masukkan tinggi: ");
                        int tinggi = scanner.nextInt();
                        BangunRuang balok = new BangunRuang(panjang, lebar, tinggi);
                        System.out.println("Volume Balok: " + balok.volumeBalok());
                        break;
                    case 3:
                        System.out.print("Masukkan diameter: ");
                        double diameter = scanner.nextDouble();
                        System.out.print("Masukkan tinggi: ");
                        int tinggiTabung = scanner.nextInt();
                        BangunRuang tabung = new BangunRuang(diameter, tinggiTabung);
                        System.out.println("Volume Tabung: " + tabung.volumeTabung());
                        break;
                    default:
                        System.out.println("Pilihan tidak valid.");
                }
                break;
                
            default:
                System.out.println("Pilihan tidak valid.");
        }
    }
}
