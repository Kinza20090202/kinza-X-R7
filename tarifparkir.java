package siswa.siswa;

import java.util.Scanner;

public class tarifparkir {
    public static void main(String[] args) {
        String platnomor;
        int jumlahjam;
        double harga;

        Scanner s = new Scanner(System.in);
        System.out.println("masukkan nomor plat: ");
        platnomor = s.nextLine();
        System.out.println("jumlah jam: ");
        jumlahjam = s.nextInt();

        if(jumlahjam >0 && jumlahjam <=1){
            harga = 3000;
        }else if(jumlahjam >1 && jumlahjam<=4){
            harga = 7000;
        }else if(jumlahjam > 4){
            harga = 10000;
        }else{
            harga = 0;
            System.out.println("System error");
        }
        System.out.println(platnomor);
        System.out.println("tarif parkir "+harga);
    }
}
