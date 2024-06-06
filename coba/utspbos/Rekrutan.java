// Yulian Dwi(A11.2022.145346)

public class Rekrutan{
   private String nama;
   private String alamat;

    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public String getAlamat() {
        return alamat;
    }
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public Rekrutan(){

    }
    public Rekrutan(String nama, String alamat){
        this.nama = nama;
        this.alamat = alamat;
    }
   public void cetak(){
    System.out.println("Nama= " + getNama());
    System.out.println("Alamat= " + getAlamat());
    }
}
