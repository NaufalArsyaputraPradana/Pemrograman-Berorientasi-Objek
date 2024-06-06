class Rekrutan {
    private String nama;
    private String alamat;

    public Rekrutan() {

    }

    public Rekrutan(String nama, String alamat) {
        setAlamat(alamat);
        setNama(nama);
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void cetak() {
        System.out.println("nama: " + nama);
        System.out.println("Alamat: " + alamat);
    }
}

class Pegawai extends Rekrutan {
    private int noInduk;

    public Pegawai() {

    }

    public Pegawai(String nama, String alamat, int noInduk) {
        super(nama, alamat);
        setNoInduk(noInduk);
    }

    public void setNoInduk(int noInduk) {
        this.noInduk = noInduk;
    }

    public int getNoInduk() {
        return noInduk;
    }

    public void cetak() {
        super.cetak();
        System.out.println("No Induk: " + noInduk);
    }
}

class Manager extends Pegawai {
    private double Gaji;

    public Manager() {

    }

    public Manager(String nama, String alamat, int nim, double Gaji) {
        super(nama, alamat, nim);
        setGaji(Gaji);

    }

    public void setGaji(double gaji) {
        if (Gaji >= 0.0 && Gaji <= 4.000000) {
            Gaji = gaji;
        } else {
            System.out.println("Invalid Gaji");
        }

    }

    public double getGaji() {
        return Gaji;
    }

    public void reset(String nama, String alamat, int nim, double Gaji) {
        super.setNama(nama);
        super.setAlamat(alamat);
        setNoInduk(nim);
        setGaji(Gaji);
    }

    public String kualifikasi(double gaji) {
        if (gaji >= 2.000000 && gaji <= 2.750000) {
            return "Memuaskan";
        } else if (gaji >= 2.760000 && gaji <= 3.500000) {
            return "Sangat memuaskan";
        } else if (gaji >= 3.510000 && gaji <= 4.000000) {
            return "Sensasional";
        } else {
            return "-";
        }
    }

    public void cetak() {
        super.cetak();
        System.out.println("Gaji " + Gaji);
        System.out.println("Kualifikasi: " + kualifikasi(Gaji));
    }

}

public class ManagerDemo {
    public static boolean isAlamatSama(Manager a1, Manager a2) {
        return a1.getAlamat().toLowerCase().equals(a2.getAlamat().toLowerCase());
    }

    public static double min2(double a, double b) {
        return Math.min(a, b);
    }

    public static void main(String[] args) {

        Manager s[] = new Manager[3];
        s[0] = new Manager("Dilan", "Bandung", 1, 3.510000);
        s[1] = new Manager("Milea", "Jakarta", 2, 3.000000);
        s[2] = new Manager();
        s[2].reset("Cinta", "Bandung", 3, 1.75);

        for (int i = 0; i < s.length; i++) {
            s[i].cetak();
            System.out.println("");
        }

        System.out.print("Alamat Dilan dan Cinta ");
        if (isAlamatSama(s[0], s[2])) {
            System.out.println("sama");
        } else {
            System.out.println("tidak sama");
        }

        double smallestGaji = min2(min2(s[0].getGaji(), s[1].getGaji()), s[2].getGaji());
        if (s[0].getGaji() == smallestGaji) {
            System.out.println("IPK terkecil adalah " + s[0].getGaji() + " milik " + s[0].getNama());
        } else if (s[1].getGaji() == smallestGaji) {
            System.out.println("IPK terkecil adalah " + s[1].getGaji() + " milik " + s[1].getNama());
        } else {
            System.out.println("IPK terkecil adalah " + s[2].getGaji() + " milik " + s[2].getNama());
        }

    }

}
