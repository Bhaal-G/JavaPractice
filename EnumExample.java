enum Status{
    Running, Failed,  Pending, Success;
}
enum Laptop{
    Macbook(2000),XPS(1500),Acer(1000);

    private int price;

    private Laptop(int price) {
        this.price = price;
    }

    private Laptop(){
        price=500;
    }

    public int getPrice() {
        return price;
    }
    
    public void setPrice(int price){
        this.price=price;
    }
}


public class EnumExample {
  public static void main(String[] args) {
    Status s=Status.Running;
    System.out.println(s);

    Status [] ss = Status.values();

    for (Status x:ss){
        System.out.println(x + " : " + x.ordinal());
    }

    for (Laptop lap:Laptop.values()){
        System.out.println(lap+ " : "+ lap.getPrice());
    }

  }  
  
}
