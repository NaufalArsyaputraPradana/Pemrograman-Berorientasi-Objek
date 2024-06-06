package uts;

import uts.MahasiswaWisuda;
import java.util.*;

public class MahasiswaMain {
    public static void main(String[] args) {
        
        MahasiswaWisuda mhs = new MahasiswaWisuda("A11.2022.14606","Budi","12-01-2001","Udinus",1,"A11","Pemrograman PBO");

        mhs.getIdentitas();
        System.out.println("Tagihan: Rp" + mhs.getBiaya("A11",50));

    }
}