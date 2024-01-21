interface A{
    int age=21;
    String area="Up";

    void show();
    void config();

}


interface X{
    void run();
}

interface Y extends X{

}

class B implements A,Y{
    public void show(){
        System.out.println("in show");
    }
    public void config(){
        System.out.println("in config");
    }
    public void run(){
        System.out.println("running");
    }
}

public class Interface {
    public static void main(String[] args) {
        A obj=new B();
        obj.show();
        obj.config();

        X obj1=new B();
        obj1.run();
    }
    
}
