package week5;

public class Matakuliah
{
    private String Matkul;
    private int Sks;
    private String Kelompok;

    public Matakuliah(String Matkul, int Sks, String Kelompok) 
    {
		this.Matkul = Matkul;
		this.Sks = Sks;
		this.Kelompok = Kelompok;
	}

    public String getMatkul()
    {
        return Matkul;
    }

    public int getSks()
    {
        return Sks;
    } 

    public String getKelompok()
    {
        return Kelompok;
    } 

    public void getMatakuliah()
    {
        System.out.println("Mata Kuliah: "+Matkul);
        System.out.println("Jumlah SKS: "+Sks);
        System.out.println("Kelompok Kelas: " +Kelompok);
    }
}