package week2;
import week1.Mahasiswa;
import java.util.*;

public class Identitas
{
    public static void main(String[] args)
    {
        int jumlahMahasiswa;
        System.out.print("Masukkan Jumlah Mahasiswa : ");

    // Buat Objek dari class Scanner untuk menginput data
        Scanner inp = new Scanner(System.in);
        jumlahMahasiswa = inp.nextInt();

    // Buat Variable array tipe Mahasiswa
        Mahasiswa[] mhs = new Mahasiswa[jumlahMahasiswa];

        String nama;
        String nim;
        String tanggal_lahir;

        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.println("Mahasiswa ke-" + (i+1));

            System.out.print("Masukkan Nama : ");
            nama = inp.next();

            System.out.print("NIM : ");
            nim = inp.next();

            System.out.print("Tanggal Lahir : ");
            tanggal_lahir = inp.next();
            

            mhs[i] = new Mahasiswa(nama,nim,tanggal_lahir);
        }

        System.out.println("");

        for (int i = 0; i < jumlahMahasiswa; i++){
            System.out.println("Mahasiswa ke-" + (i+1));
            mhs[i].getIdentitas();

            System.out.println("");
            
        }

        System.out.println("");
    }
}