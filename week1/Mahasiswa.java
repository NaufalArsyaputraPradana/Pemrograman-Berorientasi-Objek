package week1;
import java.util.ArrayList;
import java.util.Iterator;
import week5.Matakuliah;

public class Mahasiswa
{
    private String nama;
    private String nim;

    private ArrayList<Double> nilai = new ArrayList<Double>();
    private ArrayList<Matakuliah> matkul = new ArrayList<Matakuliah>();


    private String tanggal_lahir;
    private String asal_sekolah;
    
    public Mahasiswa(String nama, String nim, String tanggal_lahir, String asal_sekolah) 
    {
		this.nama = nama;
        this.nim = nim;

        this.tanggal_lahir = tanggal_lahir;
        this.asal_sekolah = asal_sekolah;
    }


    // public Mahasiswa(String nama, String nim) 
    // {
	// 	this.nama = nama;
    //     this.nim = nim;
	// }


    // Getter
    public String getNama()
    {
        return nama;
    }

    public String getNim()
    {
        return nim;
    } 

    public String getTanggal_lahir()
    {
        return tanggal_lahir;
    } 

    public String getAsal_sekolah()
    {
        return asal_sekolah;
    } 

    
    public void insertNilai(double nl)
    {
        nilai.add(nl);
    }

    public void insertMatakuliah(String Nama, int Sks, String Kelompok)
    {
        matkul.add(new Matakuliah(Nama,Sks,Kelompok));
    }

    public void belajar()
    {
        System.out.println(nama + " Belajar");
    }   
    public void mainGame()
    {
        System.out.println(nama + " main game");
    }

    public void getIdentitas()
    {
        System.out.println("Nama mahasiswa: "+nama);
        System.out.println("NIM mahasiswa: "+nim);
       // System.out.println("Mata Kuliah : " +matkul);
        System.out.println("Tanggal Lahir mahasiswa: "+tanggal_lahir);
        System.out.println("Asal Sekolah mahasiswa: "+asal_sekolah);
    }

    private void getNilai()
    {
        Iterator<Double> it = nilai.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }
    }

    public void getMatkul()
    {
        Iterator<Matakuliah> it = matkul.iterator();
        while(it.hasNext())
        {
            Matakuliah matkul = it.next();
            System.out.println(matkul.getMatkul() + " - " + matkul.getKelompok() + " - " + matkul.getSks());
        }
    }
    
}