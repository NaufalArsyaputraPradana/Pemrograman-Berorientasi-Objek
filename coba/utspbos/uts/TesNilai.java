import java.util.Scanner;
import java.io.*;
public class TesNilai{
	public static void main(String[] a){
		Scanner input=new Scanner(System.in);
				
		String jawab="";
Nilai nilaiku=new Nilai();
nilaiku.nim="A11.2022.14021";
nilaiku.nama="Heppy Sentoso";
nilaiku.nilaitugas=90;
nilaiku.nilaiuts=85;
nilaiku.nilaiuas=90;
nilaiku.hitungnilai();
nilaiku.cetaknilai();

Nilai nilaimu=new Nilai();
nilaimu.nim="A11.202";
nilaimu.nama="Heppy";
nilaimu.nilaitugas=87;
nilaimu.nilaiuts=80;
nilaimu.nilaiuas=70;
nilaimu.hitungnilai();
nilaimu.cetaknilai();

Nilai nilainya=new Nilai();
nilainya.nim="A11.14021";
nilainya.nama="Sentoso";
nilainya.nilaitugas=70;
nilainya.nilaiuts=95;
nilainya.nilaiuas=84;
nilainya.hitungnilai();
nilainya.cetaknilai();



	do {
		Nilai nilaidia = new Nilai();
		nilaidia.inputdata();
		nilaidia.hitungnilai();
		nilaidia.cetaknilai();
		System.out.println("Input data lagi?[Y/T]");
		jawab = input.nextLine();
	}while (jawab.equalsIgnoreCase("Y"));
	
	
	//latihan array objek
	System.out.println("Jumlah Mahasiswa: ");
	int n=input.nextInt();
	Nilai[] nilaibyk=new Nilai[n]; //array objek
	for (int i=0; i<n; i++){
		System.out.println("Mahasiswa ke : "+(i+1));
		nilaibyk[1]=new Nilai();
		nilaibyk[1].inputdata();
		nilaibyk[1].hitungnilai();
		nilaibyk[1].cetaknilai();
	}
	nilaibyk[0].judul();
	for (int i=0; i<n; i++){
		nilaibyk[i].DaftarNilai();
	}
}
}
		
	
		

