public class Sarjana extends Murid {
    private double ipk;

    public Sarjana() {
    }

    public Sarjana(String nama, String alamat, int noInduk, double ipk) {
        super(nama, alamat, noInduk);
        setIpk(ipk);
    }

    public double getIpk() {
        return ipk;
    }

    public void setIpk(double ipk) {
        if (ipk >= 0.0 && ipk <= 4.0) {
            this.ipk = ipk;
        } else {
            System.out.println("Invalid IPK value.");
        }
    }

    public void reset(String nama, String alamat, int noInduk, double ipk) {
        super.setNama(nama);
        super.setAlamat(alamat);
        super.setNoInduk(noInduk);
        setIpk(ipk);
    }

    public String predikat(double ipk) {
        if (ipk >= 2.0 && ipk <= 2.75) {
            return "Memuaskan";
        } else if (ipk >= 2.76 && ipk <= 3.5) {
            return "Sangat memuaskan";
        } else if (ipk >= 3.51 && ipk <= 4.0) {
            return "Dengan Pujian";
        } else {
            return "-";
        }
    }

    public void cetak() {
        super.cetak();
        System.out.println("IPK      = " + getIpk());
        System.out.println("Predikat = " + predikat(ipk));
    }
}
