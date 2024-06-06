// Yulian Dwi(A11.2022.145346)

public class Pegawai extends Rekrutan {
  private int noInduk;

  public Pegawai(){

  }
  public Pegawai(String nama, String alamat, int noInduk){
    super(nama, alamat);
    this.noInduk = noInduk;
  }
  public int getNoInduk() {
      return noInduk;
  }
  public void setNoInduk(int noInduk) {
      this.noInduk = noInduk;
  }

  public void cetak() {
      super.cetak();
      System.out.println("No Induk= "+ noInduk);
  }
}
