package uts;
import java.util.ArrayList;
import java.util.Iterator;
import week1.Mahasiswa;
import uts.BiayaWisuda;


public class MahasiswaWisuda extends Mahasiswa
{
    private int no_urut;
    private String judul_skripsi;
    private int potongan;
    private String progdi;

    private ArrayList<BiayaWisuda> biaya_wisuda = new ArrayList<BiayaWisuda>();
    private ArrayList<BiayaSidang> biaya_sidang = new ArrayList<BiayaSidang>();


    public MahasiswaWisuda(String nim, String nama, String tanggal_lahir, String asal_sekolah, int no_urut, 
    String progdi, String judul_skripsi)
    {
        super(nim,nama,tanggal_lahir,asal_sekolah);
        this.no_urut = no_urut;
        this.judul_skripsi = judul_skripsi;
        this.progdi = progdi;
    }

    public int getNo_urut()
    {
        return no_urut;
    } 

    public String getJudul_skripsi()
    {
        return judul_skripsi;
    } 

    public String getProgdi()
    {
        return progdi;
    } 

    public void getIdentitas()
    {
        super.getIdentitas();
    }

    public int getBiaya(String progdi, int diskon)
    {
        int biaya_sidang = 350000;
        int biaya_wisuda;
        int total;

        switch(progdi)
        {
            case "A11" : biaya_wisuda = 2000000; break;
            case "A12" : biaya_wisuda = 2000000; break;
            case "A14" : biaya_wisuda = 17500000; break;
            case "A15" : biaya_wisuda = 15000000; break;
            default : biaya_wisuda = 1250000; break;
        }

        potongan = (biaya_sidang + biaya_wisuda) * diskon/100;
        total = (biaya_sidang + biaya_wisuda) - potongan;
        return total;

    }

    // public int hitungTotal_tagihan() {

    //     biaya_sidang = 350000;

    //      if(super.getNim() == "A11" ){
    //         biaya_wisuda = 2000000;
    //     } else if(super.getNim() == "A12"){
    //         biaya_wisuda = 2000000;
    //     } else if(super.getNim() == "A14"){
    //         biaya_wisuda = 1750000;
    //     } else if(super.getNim() == "A15"){
    //         biaya_wisuda = 1500000;
    //     } else {
    //         biaya_wisuda = 1250000;
    //     }

    //     return biaya_wisuda + biaya_sidang;
    // }
}