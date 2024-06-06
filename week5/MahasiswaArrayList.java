package week5;
import week1.Mahasiswa;
import java.util.*;

public class MahasiswaArrayList
{
    public static void main(String[] args)
    {
        Mahasiswa mhs = new Mahasiswa("Budi","12345");

        mhs.insertMatakuliah("PBO",3,"A11.4411");
        mhs.insertMatakuliah("PBW",2,"A11.4422");
        mhs.insertMatakuliah("Kalkulus",4,"A11.4433");

        mhs.getMatkul();
    }
}