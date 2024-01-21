class A{
    public void show()throws ClassNotFoundException{
        Class.forName("calc");
    }
}




public class throwsKeyword {
    static{
        System.out.println("Class Loaded");
    }
    public static void main(String[] args) {
        A obj=new A();
        try {
            obj.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
