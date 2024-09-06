package siswa.siswa;

import java.util.Scanner;

public class seleksiprakerin {
    public static void main(String[] args) {
        String nama,kelas,perilaku;
        int nilai;

        Scanner s = new Scanner(System.in);
        System.out.println("nama: ");
        nama = s.nextLine();
        System.out.println("kelas: (X/XI/XII)");
        kelas = s.next();

        if(kelas.equalsIgnoreCase("XII")){
            System.out.println("perilaku siswa: (baik/cukup)");
            perilaku=s.next();
            if(perilaku.equalsIgnoreCase("baik")){
                System.out.println("niai siswa: ");
                nilai = s.nextInt();
                if(nilai >=85){
                    System.out.println(nama+ "dinyatakan bisa mengikuti prakerin");
                }else{
                    System.out.println("maaf anda gagal karena nilai");
                }
            }else{
                System.out.println("anda gagal karena perilaku");
            }
        }else{
            System.out.println("anda gagal karena buka kelas XII");
        }
    }
}
