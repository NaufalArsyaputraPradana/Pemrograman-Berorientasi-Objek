import java.util.Scanner;

public class Nilai {
	String nim, nama, nHuruf, predikat;
	float nilaiuts, nilaitugas, nilaiuas, pnilaiuts, pnilaitugas, pnilaiuas, nilaiakhir;
	Scanner myObj = new Scanner(System.in);

	void isidata(String nim, String nama, float nilaiuts, float nilaitugas, float nilaiuas) {
		this.nim = nim;
		this.nama = nama;
		this.nilaitugas = nilaitugas;
		this.nilaiuts = nilaiuts;
		this.nilaiuas = nilaiuas;
	}

	void setnim(String nim) {
		this.nim = nim;
	}

	String getnim() {
		return nim;
	}

	void inputdata() {
		System.out.print("Nim   			: ");
		nim = myObj.nextLine();
		System.out.print("Nama   			: ");
		nama = myObj.nextLine();
		System.out.print("Nilai Tugas   	: ");
		nilaitugas = myObj.nextFloat();
		System.out.print("Nilai UTS  		 : ");
		nilaiuts = myObj.nextFloat();
		System.out.print("Nilai UAS  		 : ");
		nilaiuas = myObj.nextFloat();
	}

	void hitungnilai() {
		pnilaiuts = .35f * nilaiuts;
		pnilaitugas = .3f * nilaitugas;
		pnilaiuas = .35f * nilaiuas;
		nilaiakhir = pnilaiuts + pnilaitugas + pnilaiuas;
	}

	String getNilHuruf(float nilai) {
		if (nilai >= 85)
			nHuruf = "A";
		else if (nilai >= 80 && nilai < 85)
			nHuruf = "AB";
		else if (nilai >= 70 && nilai < 80)
			nHuruf = "B";
		else if (nilai >= 65 && nilai < 70)
			nHuruf = "BC";
		else if (nilai >= 60 && nilai < 65)
			nHuruf = "C";
		else if (nilai >= 40 && nilai < 60)
			nHuruf = "BC";
		else
			nHuruf = "E";
		return nHuruf;
	}

	String getPredikat(String huruf) {
		switch (huruf) {
			case "A":
				predikat = "Apik";
				break;
			case "AB":
				predikat = "Baik";
				break;
			case "B":
				predikat = "Cukup";
				break;
			case "BC":
				predikat = "Dablek";
				break;
			case "C":
				predikat = "Cukup";
				break;
			case "D":
				predikat = "Jelek";
				break;
			default:
				predikat = "Elek";
		}
		return predikat;
	}

	void cetaknilai() {		
		System.out.println("Nim   			: " + nim);
		System.out.println("Nama   			: " + nama);
		System.out.println("Nilai Tugas  	: " + nilaitugas + " 30% : " + pnilaitugas);
		System.out.println("Nilai UTS   	: " + nilaiuts + " 35% : " + pnilaiuts);
		System.out.println("Nilai UAS  		: " + nilaiuas + " 35% : " + pnilaiuas);
		System.out.println("Nilai Akhir   	: " + nilaiakhir);
		System.out.println("Nilai Huruf 	: " + getNilHuruf(nilaiakhir));
		System.out.println("Predikat 		: " + getPredikat(nHuruf));
	}

	void judul() {
		System.out.println("Daftar Nilai PBO");
		System.out.println("=================");
		System.out.println("Nim\tNama\tN.Tgs\tn.Uts\tN.Uas\tN.Akhir\tN.Huruf\tPredikat");
	}

	void DaftarNilai() {
		System.out.println(nim + "\t" + nama + "\t" + nilaitugas + "\t" + nilaiuts + "\t" + nilaiuas + "\t" + nilaiakhir
				+ "\t" + nHuruf + "\t" + predikat);

	}
}