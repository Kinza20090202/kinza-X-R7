package siswa.siswa;

import java.util.Scanner;

public class PembelianBarang {
    
        public static void main(String[] args) {

        double total, diskon, pothar;

        Scanner input = new Scanner(System.in);
        System.out.println("masukkan total pembelian;  ");
        total = input.nextDouble();
        
        if (total > 150000) {
            pothar = 0;
            diskon = 0.1 * total;
            total -= diskon;
        }   else {
            diskon = 0;
            pothar = 5000;
            total -= pothar;
            System.out.println("diskon: " + diskon);
            System.out.println("potongan harga: " + pothar);
            System.out.println("total yang harus dibayarkan: " + total);

    } 
}
}