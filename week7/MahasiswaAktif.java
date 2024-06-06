package week7;

import java.time.Period;
import java.time.LocalDate;

import week1.Mahasiswa;

public class MahasiswaAktif extends Mahasiswa
{
    public int usia;
    public int semester;

    public MahasiswaAktif(String nim, String nama, String tanggal_lahir, int semester)
    {
        super(nim,nama,tanggal_lahir);

        this.semester = semester;
    }

    // Getter
    public int getUsia()
    {
        // return usia;
        
        String tglLhr = super.getTanggal_lahir();
        String tgl = tglLhr.substring(0,2);
        String bulan = tglLhr.substring(3, 5);
        String tahun = tglLhr.substring(6);

        LocalDate today = LocalDate.now();
        LocalDate birthdate = LocalDate.of(Integer.parseInt(tahun), Integer.parseInt(bulan), Integer.parseInt(tgl));

        Period period = Period.between(birthdate, today);
        int thn = Period.between(birthdate, today).getYears();
        int bln = Period.between(birthdate, today).getMonths();
        int hari = Period.between(birthdate, today).getDays();

        if (today.isBefore(birthdate.plusYears(years))) {
            years--;
            months = 12 - birthdate.getMonthValue() + today.getMonthValue();
            if (today.getDayOfMonth() < birthdate.getDayOfMonth()) {
                months--;
            }
        }

        return Integer.toString(thn)+" tahun "+Integer.toString(bln)+" bulan";

        // return years + " tahun " + months + " bulan";

    }

    public int getSemester()
    {
        return semester;
    } 

    public void getIdentitas()
    {
        super.getIdentitas();
        System.out.println("Semester: "+semester);

        // System.out.println("Nama: "+super.getNama());
        // System.out.println("Nama: "+super.getNim());
        // System.out.println("Nama: "+super.getTanggal_lahir());

        // System.out.println("Nama: "+getSemester());
    
    }

}