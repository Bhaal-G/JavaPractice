class Human{
    int age;
    String name;


    public Human(){
        this.age=12;
        this.name="Ellen";
    }
    
    public Human(int age,String name){
        this.age=age;
        this.name=name;
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}




public class constructors {
    public static void main(String[] args) {
        Human obj=new Human();
        Human obj1=new Human(12,"john");
        System.out.println(obj.getAge()+" : "+ obj.getName());
        System.out.println(obj1.getAge()+" : "+ obj1.getName());
        
    }
}
