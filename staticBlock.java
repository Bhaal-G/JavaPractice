


class Mobile{
    String brand;
    int price;
    static String name;

    static{
        name="Phone";
        System.out.println("inside static block");

    }
    
    public Mobile(){
        brand="";
        price=200;
        System.out.println("inside constructor");
    }

    public void show(){
        System.out.println(brand+ " : " + price + " : " + name);
    }

}

public class staticBlock {
   public static void main(String[] args) throws ClassNotFoundException {
        // Mobile obj1=new Mobile();
        // Mobile obj2=new Mobile();

        // obj1.show();
        // obj2.show();
        Class.forName("Mobile");

   }

    
}
