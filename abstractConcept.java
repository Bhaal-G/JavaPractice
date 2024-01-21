abstract class Car{
    public abstract void drive();

    public void playMusic(){
        System.out.println("Car Music");
    }
    public void show1(){
        System.out.println("in Show car");
    }
    public abstract void Accelerator();
}

abstract class WagonR extends Car{


    public void playMusic(){
        System.out.println("WagonR Music");
    }
    public void show2(){
        System.out.println("in WagonR show");
    }

    public void Accelerator(){
        System.out.println("Speed is increased");
    }
}

class updatedWagonR extends WagonR {
    public void drive(){
        System.out.println("Update WagonR Driving");
    }

}

public class abstractConcept {
    public static void main(String[] args) {
        Car obj=new updatedWagonR();
        obj.drive();
        obj.playMusic();

        obj.Accelerator();

        // obj.show2() ->not accessible because it is of type Car but during polymorphism it will call method of that class from which this object is created
    }
    
}