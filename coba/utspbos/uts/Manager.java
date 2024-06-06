class rekrutan {
    private String nama;
    private String alamat;

    public rekrutan() {

    }

    public rekrutan(String nama, String alamaString) {
        this.nama = nama;
        this.alamat = alamat;
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
        System.out.println("nama :" + nama);
        System.out.println("alamat :" + alamat);
    }
}

class pegawai extends rekrutan {
    private int noInduk;

    public pegawai() {

    }

    public pegawai(String nama, String alamat, int noInduk) {
        this.noInduk = noInduk;
    }

    public void setNoInduk(int noInduk) {
        this.noInduk = noInduk;
    }

    public int getNoInduk() {
        return noInduk;
    }

    public void display() {
        super.display();
        System.out.println("noInduk :" + noInduk);
    }
}

class manager extends pegawai {
    private double gaji;

    public manager() {

    }

    public manager(String nama, String alamat, double gaji, int nim) {
        super(nama, alamat, nim);
        this.gaji = gaji;
    }

    public double getGaji() {
        return gaji;
    }

    public void setGaji(double gaji) {
        if (gaji >= 0.0 && gaji <= 4000000) {
            this.gaji = gaji;
        }
    }

    public void reset(String nama, String alamat, int noInduk, double gaji) {
        setNama(nama);
        setAlamat(alamat);
        setNoInduk(noInduk);
        setGaji(gaji);
    }

    public String kualifikasi(double gaji) {
        if (gaji >= 2000000 && gaji <= 2750000) {
            return "memuaskan";
        } else if (gaji >= 2760000 && gaji <= 3500000) {
            return " sangat memuaskan";
        } else if (gaji >= 3510000 && gaji <= 4000000) {
            return "sensational";
        } else {
            return "-";
        }
    }

    public void display() {
        super.display();
        System.out.println("gaji :" + gaji);
        System.out.println("kualifikasi :" + kualifikasi(gaji));
    }
}

public class Manager {
    public static boolean isAlamatSama(Manager a1, Manager a2) {
        /* isi – skor 10 */
        return a1.getAlamat().tolowerCase().equals(a2.getAlamat().tolowerCase());
    }

    public static double min2(double a, double b) {
        /* isi – skor 5 */
        return Math.min(a, b);
    }

    public static void main(String[] args){
        Manager s[] = new Manager[3];
        s[0] = new Manager("Dilan", "Bandung", 1, 3.510000);
        s[1] = new Manager ("Milea", "Jakarta", 2, 3.000000);
        s[2] = new Manager ();
        s[2].reset("Cinta", "Bandung", 3, 1.75);
       
        for(int i=0; i<s.length; i++){
        s[i].display(); System.out.println("");
        }
       
        System.out.print("Alamat Dilan dan Cinta ");
        if(/*isi – skor 2, gunakan method isAlamatSama */)
        System.out.println("sama");
        else
        System.out.println("tidak sama");
       
        if(/*isi – skor 2.5*/)
        /*Jika gaji s[0] paling kecil*/
        /*in detail = gaji s[0] lebih kecil dari hasil method min2
       gaji s[1] dan gaji s[2]*/
        System.out.println("Gaji terkecil adalah"+s[0].getGaji()+" milik "+s[0].getNama());
        else if(/*isi – skor 2.5*/)
        /*Jika gaji s[1] paling kecil*/
        /*in detail = gaji s[1] lebih kecil dari hasil method min2
       gaji s[0] dan gaji s[2]*/
        System.out.println("Gaji terkecil adalah"+s[1].getGaji()+" milik "+s[1].getNama());
        else
        System.out.println("Gaji terkecil adalah"+s[2].getGaji()+" milik "+s[2].getNama());
        }
}}