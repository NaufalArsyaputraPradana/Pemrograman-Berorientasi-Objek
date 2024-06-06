import java.io.*;

public class Karyawan {
    String nip, nama;
    int sts_peg;

    public void inputKar() throws IOException {
        BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Data Karyawan: ");
        System.out.print("Nip       : ");
        nip = keyboard.readLine();
        System.out.print("Nama       : ");
        nama = keyboard.readLine();
        System.out.print("sts Pegawai       : ");
        sts_peg = Integer.parseInt(keyboard.readLine());
    }
}