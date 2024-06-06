import java.util.Scanner;

class Produk {
    String kdProduk;
    String nmProduk;
    double hrgBeli;
    double hrgJual;

    void inputProduk() {
        Scanner input = new Scanner(System.in);
        System.out.print("Kode Produk   : ");
        kdProduk = input.nextLine();
        System.out.print("Nama Produk   : ");
        nmProduk = input.nextLine();
        System.out.print("Harga Beli    : ");
        hrgBeli = input.nextDouble();
    }
}

class Agen extends Produk {
    String cabang;
    int noNota;
    int jmlJual;
    double totJual;
    int jnsByr;
    String ketByr;
    double ppn;
    double bunga;
    double totByr;
    String souvenir;

    Agen(String cabang) {
        this.cabang = cabang;
    }

    void setNota(int noNota) {
        this.noNota = noNota;
    }

    void inputJumlah() {
        Scanner input = new Scanner(System.in);
        System.out.print("Jumlah Jual   : ");
        jmlJual = input.nextInt();
    }

    double getHargaJual() {
        if (hrgBeli > 200000)
            hrgJual = hrgBeli * 1.10;
        else if (hrgBeli > 100000)
            hrgJual = hrgBeli * 1.15;
        else if (hrgBeli > 50000)
            hrgJual = hrgBeli * 1.20;
        else if (hrgBeli > 25000)
            hrgJual = hrgBeli * 1.30;
        else
            hrgJual = hrgBeli * 1.50;

        return hrgJual;
    }

    void inputJenis() {
        Scanner input = new Scanner(System.in);
        System.out.print("Jenis Bayar (1. Cash, 2. Tempo): ");
        jnsByr = input.nextInt();
        if (jnsByr == 1)
            ketByr = "Cash";
        else if (jnsByr == 2) {
            ketByr = "Tempo";
            System.out.print("Waktu Tempo (bulan): ");
            int waktuTempo = input.nextInt();
            if (waktuTempo > 1)
                bunga = 0.05 * totJual;
        }
    }

    void hitungJual() {
        totJual = jmlJual * hrgJual;
        ppn = 0.11 * totJual;
        totByr = totJual + ppn + bunga;
    }

    void cetak() {
        System.out.println("\nAgen Aksesoris HP - " + cabang);
        System.out.println("No. Nota        : " + noNota);
        System.out.println("Kode Produk     : " + kdProduk);
        System.out.println("Nama Produk     : " + nmProduk);
        System.out.println("Harga Jual      : " + hrgJual);
        System.out.println("Jumlah Jual     : " + jmlJual);
        System.out.println("Total           : " + totJual);
        System.out.println("Jenis Bayar     : " + ketByr);
        System.out.println("Keterangan Bayar: " + ketByr);
        if (ketByr.equals("Tempo"))
            System.out.println("Bunga: " + bunga);
        System.out.println("Total Bayar: " + totByr);

        if (ketByr.equals("Cash")) {
            if (totByr >= 100000 && totByr <= 500000)
                souvenir = "Mug";
            else if (totByr > 500000 && totByr <= 750000)
                souvenir = "Payung";
            else if (totByr > 750000 && totByr <= 1000000)
                souvenir = "Tas Belanja";
            else if (totByr > 1000000)
                souvenir = "Voucher 100rb";
            System.out.println("Souvenir: " + souvenir);
        }
    }
}


