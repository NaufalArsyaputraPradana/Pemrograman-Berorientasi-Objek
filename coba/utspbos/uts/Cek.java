//atribute
class Orang {
    private String nama,alamat; // atribute nama dan alamat bertipe data string
 
//konstruktor
    public Orang() {
        //konstruktor orang() tidak melakukan apapun
    }

    public Orang(String nama, String alamat) { 
        this.nama = nama;
        this.alamat = alamat;
    }

//method
    public String getNama() { //getNama() string
        return this.nama; //method getter, kembalikan nilai nama
    }

    public void setNama(String nama) { //method setter, set nama dari class dengan nama baru dari parameter
        this.nama = nama;
    }

    public String getAlamat() { //getAlamat() string
        return this.alamat; //method getter, kembalikan nilai alamat
    }

    public void setAlamat(String alamat) { //method setter, set alama dari class dengan nama baru dari parameter
        this.alamat = alamat;
    }

    public void display() {
        System.out.println("Nama = " + nama); //menampilkan nama dan alamat dalam vertikal
        System.out.println("Alamat = " + alamat);
    }
}

//atribut
class Murid extends Orang {
    private int noInduk; //nomer induk berdata integer

//konstruktor
    public Murid() { //tidak melakukan apapun
    }

    public Murid(String nama, String alamat, int noInduk) {
        super(nama, alamat); //memanggil konstraktor super class
        this.noInduk = noInduk;
    }

// method 
    public int getNoInduk() { //method getter, kembalikan nilai nomer induk
        return this.noInduk;
    }

    public void setNoInduk(int noInduk) { //method setter, set nomer induk dari class no induk baru dari parameter inputan
        this.noInduk = noInduk;
    }

    @Override
    public void display() {
        super.display(); //menampilkan cetak dari super class
        System.out.println("No.Induk = " + this.noInduk); //menampilkan nomer induk
    }
}

//atribut 
class Sarjana extends Murid {
    private double ipk; //ipk bertipe data double

//konstruktor
    public Sarjana() { //tidak melakukan apapun
    }

    public Sarjana(String nama, String alamat, int nim, double ipk) {
        super(nama, alamat, nim); //memanggil konstruktor super class
        this.ipk = ipk;
    }

//method
    public double getIpk() {
        return this.ipk; //method getter kembalikan nilai ipk
    }

    public void setIpk(double ipk) {
        if (ipk >= 0.0 && ipk <= 4.0) { //method setter,jika ipk diantara 0.0 sampai 4.0 maka set ipk dari class dengan ipk baru dari parameter inputan
            this.ipk = ipk;
        }
    }

    public void reset(String nama, String alamat, int nim, double ipk) {
        setNama(nama); //set nama dari class dengan nama baru dari parameter inputan
        setAlamat(alamat); //set alamat dari class dengan alamat baru dari parameter inputan
        setNoInduk(nim); //set no induk dari class dengan no induk baru dari parameter inputan
        setIpk(ipk);//set ipk dari class dengan ipk baru dari parameter inputan
    }

    public String predikat() {
        if (this.ipk >= 2.0 && this.ipk <= 2.75) {
            return "Memuaskan"; //jika ipk diantara 2.0 - 2.75 kembalikan string memuaskan
        } else if (this.ipk > 2.75 && this.ipk <= 3.5) {
            return "Sangat Memuaskan"; //jika ipk diantara 2.76 - 3.5 kembalikan string sangat memuaskan
        } else if (this.ipk > 3.5 && this.ipk <= 4.0) {
            return "Dengan Pujian"; //jika ipk diantara 3.51 - 4.0 kembalikan string dengan pujian
        } else {
            return "-";
        }
    }

    @Override
    public void display() {
        super.display(); //menampilkan cetak dari superclass 
        System.out.println("IPK = " + this.ipk); // menampilkan ipk
        System.out.println("Predikat = " + this.predikat()); //menampilkan predikat
    }
}

//attribut -
//konstruktor - 
class SarjanaDemo {

//method
    public static boolean isAlamatSama(Sarjana s1, Sarjana s2) {
        return s1.getAlamat().toLowerCase().equals(s2.getAlamat().toLowerCase());
    }

    public static double min2(double a, double b) { //mengembalikan nilai terkecil dari parameter inputan
        return (a < b) ? a : b; //jika a < b maka kembalikan nilai a
                                //jika tidak, maka kembalikan nilai b
    }

  
//program utama
    public static void main(String[] args) {
        Sarjana[] s = new Sarjana[3]; //membuat objek dari class sarjana
        s[0] = new Sarjana("Dilan", "Bandung", 1, 3.51);
        s[1] = new Sarjana("Milea", "Jakarta", 2, 3.0);
        s[2] = new Sarjana("Cinta", "Bandung", 3, 1.75);

        // Cetak informasi Sarjana
        for (Sarjana sarjana : s) {
            sarjana.display();
            System.out.println("");
        }

        System.out.print("Alamat Dilan dan Cinta ");
        if (isAlamatSama(s[0], s[2])) {
            System.out.println("sama");
        } else {
            System.out.println("tidak sama");
        }

        double minIPK = min2(s[1].getIpk(), s[2].getIpk());
        if (s[0].getIpk() < minIPK) {
            System.out.println("IPK terkecil adalah: " + s[0].getIpk() + " milik " + s[0].getNama());
        } else if (s[1].getIpk() < minIPK) {
            System.out.println("IPK terkecil adalah: " + s[1].getIpk() + " milik " + s[1].getNama());
        } else {
            System.out.println("IPK terkecil adalah: " + s[2].getIpk() + " milik " + s[2].getNama());
        }
    }
}
