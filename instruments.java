package music;

public class instruments {
  protected String name;
  protected double price;

  public String getName() {
      return this.name;
  }

  public void setName(String name) {
      this.name = name;
  }

  public double getPrice() {
      return this.price;
  }

  public void setPrice(double price) {
      this.price = price;
  }

  public instruments() {
      name = "empty";
      price= 0;
  }
  public instruments(String name,double price){
      this.name=name;
      this.price=price;
  }
  public void print(){
      System.out.println("name: "+name);
      System.out.println("price: "+price);
  }
}