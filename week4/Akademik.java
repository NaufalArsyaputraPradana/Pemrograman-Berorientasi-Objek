package week4;

import week1.Mahasiswa;
import java.util.*;

public class Akademik {
    public static void main(String[] args) {
        int n;
        System.out.print("Masukkan Jumlah Data : ");

    // Buat Objek dari class Scanner untuk menginput data
        Scanner inp = new Scanner(System.in);
        n = inp.nextInt();

    // Buat Variable array tipe Mahasiswa
        Mahasiswa[] mhs = new Mahasiswa[n];

        String nim;
        String nama;
        Double ipk;

        for (int i = 0; i < n; i++) {
            System.out.println("Data ke-" + (i+1));
            System.out.print("Masukkan NIM : ");
            nim = inp.next();
            System.out.print("Masukkan IPK : ");
            ipk = inp.nextDouble();
            System.out.print("Masukkan Nama : ");
            nama = inp.next();

            mhs[i] = new Mahasiswa(nim,nama,ipk);
        }

        System.out.println("");

        for (int i = 0; i < n; i++){
            System.out.println("Data ke-" + (i+1));
            mhs[i].getIdentitas();
            System.out.println("");
            
        }

        System.out.println("");

    }
}