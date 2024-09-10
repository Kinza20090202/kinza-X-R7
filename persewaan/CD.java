package persewaan;

import java.util.Scanner;

//subclass
public class CD extends product {
    private String artist;
    private int totalsong;
    private String label;


    public CD(){
        number = 0;
        name = "DVD ryu goyang";
        quantity = 0;
        price = 0.0;
        artist = "yono";
        totalsong = 2;
        label = "sony music";
    }
     public void print() {
            System.out.println("number "+ number);
            System.out.println("nama "+ name);
            System.out.println("quantity "+ quantity);
            System.out.println("harga "+ price);
            System.out.println("artist "+ artist);
            System.out.println("nama lagu "+ number);
            System.out.println("number "+ number);
        }
}
