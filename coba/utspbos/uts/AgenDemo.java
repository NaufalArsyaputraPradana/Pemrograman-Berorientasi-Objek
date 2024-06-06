import java.util.Scanner;

public class AgenDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan cabang: ");
        String cabang = input.nextLine();

        Agen agen = new Agen(cabang);

        System.out.print("Masukkan nomor nota: ");
        int noNota = input.nextInt();
        agen.setNota(noNota);

        agen.inputProduk();
        agen.inputJumlah();
        agen.getHargaJual();
        agen.inputJenis();
        agen.hitungJual();
        agen.cetak();
    }
}