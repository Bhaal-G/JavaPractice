class A
{
    public void show(){
        System.out.println("In A Show");
    }
}

abstract class B{
    public abstract void show();
    public abstract void config();
}

public class anonymusInnerClass {
    public static void main(String[] args) {
        A obj=new A()
        {
            public void show(){
                System.out.println("In new show");
            }
        };
        obj.show();


        B obj1=new B() {
            public void show(){
                System.out.println("In B show");
            }
            public void config(){
                System.out.println("In B config");
            }
        };

        obj1.show();
        obj1.config();


    }
    




}
