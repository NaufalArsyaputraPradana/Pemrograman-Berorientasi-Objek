public class Orang {
    private String nama;
    private String alamat;

    public Orang() {
    }

    public Orang(String nama, String alamat) {
        setNama(nama);
        setAlamat(alamat);
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getAlamat() {
        return alamat;
    }
    
    public void display() {
        System.out.println("Nama     = " + getNama());
        System.out.println("Alamat   = " + getAlamat());
    }
}
