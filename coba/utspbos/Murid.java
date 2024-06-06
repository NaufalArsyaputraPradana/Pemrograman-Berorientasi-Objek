public class Murid extends Orang {
    private int noInduk;

    public Murid() {
    }

    public Murid(String nama, String alamat, int noInduk) {
        super(nama, alamat);
        setNoInduk(noInduk);
    }

    public int getNoInduk() {
        return noInduk;
    }

    public void setNoInduk(int noInduk) {
        this.noInduk = noInduk;
    }

    public void cetak() {
        super.display();
        System.out.println("No.Induk = " + getNoInduk());
    }
}
