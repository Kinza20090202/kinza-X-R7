package persewaan;
import java.util.Scanner;

public class driver {
    public static void main(String[] args) {
        String choice;
        CD CD = new CD();
        DVD DVD = new DVD();
        Scanner j = new Scanner(System.in);

        System.out.println("ingin membeli CD/DVD?");
        choice = j.nextLine();

        if(choice.equalsIgnoreCase("CD")) {
            CD.print();
        } else if(choice.equalsIgnoreCase("DVD")) {
            DVD.print();
        }
        
    }
}
