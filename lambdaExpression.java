@FunctionalInterface
interface A
{
    void show(int i);
}

@FunctionalInterface
interface B
{
    int add(int i,int j);
}

public class lambdaExpression {
    public static void main(String[] args) {
        A obj= i ->System.out.println("in show" + i);
        obj.show(5);

        B obj1 = (i,j)->i+j;
        int result=obj1.add(6, 7);
        System.out.println(result);
    }
    
}
