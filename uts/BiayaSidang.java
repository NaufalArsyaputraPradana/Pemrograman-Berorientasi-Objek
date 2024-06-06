package uts;

public class BiayaSidang
{
    private int biaya_wisuda;
    private int biaya_sidang;

    // Constructor
     public BiayaSidang(int biaya_wisuda, int biaya_sidang) 
    {
        this.biaya_wisuda = biaya_wisuda;
        this.biaya_sidang = biaya_sidang;
	}

    // Getter
    public int getBiaya_sidang()
    {
        return biaya_sidang;
    }

    public int getBiaya_wisuda()
    {
        return biaya_wisuda;
    } 


}