package week7;

import week6.Mahasiswa;
import java.util.*;

public class Akademik {
    public static void main(String[] args) {
        int jumlahMahasiswa;
        System.out.print("Masukkan Jumlah Mahasiswa : ");

    // Buat Objek dari class Scanner untuk menginput data
        Scanner inp = new Scanner(System.in);
        jumlahMahasiswa = inp.nextInt();

    // Buat Variable array tipe Mahasiswa
        Mahasiswa[] mhs = new Mahasiswa[jumlahMahasiswa];

        String nama;
        int semester;
        int sks; 
        String nim;

        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.println("Mahasiswa ke-" + (i+1));

            System.out.print("Masukkan Nama : ");
            nama = inp.next();

            System.out.print("Semester : ");
            semester = inp.nextInt();

            System.out.print("SKS : ");
            sks = inp.nextInt();

            System.out.print("NIM : ");
            nim = inp.next();
            

            mhs[i] = new Mahasiswa(nama,semester,sks,nim);
        }

        System.out.println("");

        for (int i = 0; i < jumlahMahasiswa; i++){
            System.out.println("Mahasiswa ke-" + (i+1));
            mhs[i].getIdentitas();
            System.out.println("Tagihan: Rp" + mhs[i].hitungTagihan());
            System.out.println("");
            
        }

        System.out.println("");
    }
}
