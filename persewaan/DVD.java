package persewaan;
//superclass
public class DVD extends product {
    private int length;
    private String rating;
    private String studio;

    public DVD (){
        number = 0;
        name = "DVD ryu goyang";
        quantity = 50;
        price = 1000000;
        length = 100;
        rating = "NC-13";
        studio = "ryu botak cling";
    }
        public void print() {
            System.out.println("number "+ number);
            System.out.println("nama lagu "+ name);
            System.out.println("quantity "+ quantity);
            System.out.println("harga DVD "+ price);
            System.out.println("artist "+ length);
            System.out.println("jumlah lagu "+ rating);
            System.out.println("label "+ studio);

    }
}
