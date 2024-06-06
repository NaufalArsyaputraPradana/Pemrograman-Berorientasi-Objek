// Yulian Dwi(A11.2022.145346)

public class ManagerDemo {
    public static boolean isAlamatSama(Manager s1, Manager s2){
        String alamat1= s1.getAlamat().toLowerCase();
        String alamat2= s2.getAlamat().toLowerCase();
        return alamat1.equals(alamat2);
        }

        public static double min2(double a, double b){
            if(a<b){
                return a;
            }
            else{
                return b;
            }
            }
        
            public static void main(String[] args) {

                System.out.println("Nama: Yulian Dwi Nartriani");
                System.out.println("Nim: A11.2022.14546");
                System.out.println("=================================");

                Manager s[] = new Manager[3];
                    s[0] = new Manager("Dilan", "Bandung", 1, 3510000);
                    s[1] = new Manager ("Milea", "Jakarta", 2, 3000000);
                    s[2] = new Manager ();
                    s[2].reset("Cinta", "Bandung", 3, 1750000);

                for(int i=0; i<s.length; i++){
                    s[i].cetak(); 
                    System.out.println("");
                    }
                System.out.print("Alamat Dilan dan Cinta ");

                if(isAlamatSama(s[0], s[2]))
                System.out.println("sama");
                else
                System.out.println("tidak sama");

                double minGaji = min2(s[0].getGaji(), min2(s[1].getGaji(), s[2].getGaji()));

                if(minGaji== s[0].getGaji())
                    System.out.println("Gaji terkecil adalah "+s[0].getGaji()+" milik "+s[0].getNama());
                else if(minGaji == s[1].getGaji()){
                    System.out.println("Gaji terkecil adalah "+s[1].getGaji()+" milik "+s[1].getNama());
                }
                else
                    System.out.println("Gaji terkecil adalah " +s[2].getGaji()+" milik "+s[2].getNama());
                }

            }
