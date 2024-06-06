// Yulian Dwi(A11.2022.145346)

public class Manager extends Pegawai{
    private double gaji;

    public void setGaji(double gaji) {
        this.gaji = gaji;
    }
    public double getGaji() {
        return gaji;
    }

    public Manager(){

    }
    public Manager(String nama, String alamat, int noInduk, double gaji){
        super(nama, alamat, noInduk);
        setGaji(gaji);
    }

    public void reset(String nama, String alamat, int noInduk, double gaji){
        setGaji(gaji);
        setNama(nama);
        setAlamat(alamat);
        setNoInduk(noInduk);
    }

    public String Kualifikasi(double gaji){

        if(gaji <= 4000000 && gaji > 3510000){
            return"SENSASIONAL";
        }
        else if(gaji <= 3500000 && gaji > 2760000){
            return"SANGAT MEMUASKAN";
        }
        else if(gaji <= 27500000 && gaji > 2000000){
            return"MEMUASKAN";
        }
        else{
            return"-";
        }
    }
    public void cetak() {
        super.cetak();
        System.out.println("Gaji= "+ gaji);
        System.out.println("Kualifikasi = " + Kualifikasi(getGaji()));
    }
}
