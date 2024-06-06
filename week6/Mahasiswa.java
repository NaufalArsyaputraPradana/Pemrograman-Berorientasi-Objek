package week6;

public class Mahasiswa
{
    private String nama;
    private int semester;
    private int sks;
    private String nim;

    // Constructor
     public Mahasiswa(String nama, int semester, int sks, String nim) 
    {
		this.nama = nama;
        this.semester = semester;
        this.sks = sks;
        this.nim = nim;
	}

    // Getter
    public String getNama()
    {
        return nama;
    }

    public int getSemester()
    {
        return semester;
    } 

    public int getSks()
    {
        return sks;
    } 

    public String getNim()
    {
        return nim;
    } 

    // Fungsi Tagihan
    public int hitungTagihan() 
    {
        int biayaPerSks;
        int biayaSpp;

        if(semester < 2){
            biayaPerSks = 300000;
            biayaSpp = 3000000;
        } else if(semester > 2 && semester < 7){
            biayaPerSks = 275000;
            biayaSpp = 2900000;
        } else {
            biayaPerSks = 250000;
            biayaSpp = 2750000;
        }

        return (biayaPerSks*sks) + biayaSpp;
    }

    public void getIdentitas()
    {
        System.out.println("Nama mahasiswa: "+nama);
        System.out.println("Semester: "+semester);
        System.out.println("Jumlah SKS: "+sks);
        System.out.println("NIM Mahasiswa: "+nim);
        
    }
    
}