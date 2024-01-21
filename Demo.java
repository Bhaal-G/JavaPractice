class Calculator
{
    int a;

    public int add(int n1,int n2)
    {
        int r=n1+n2;
        return r;
    }
}



public class Demo
{
    public static void main(String[] args){
        // int x=6;
        // int y=6;

        // boolean result=x==y;

        // int x=7;
        // int y=5;
        // int a=5;
        // int b=9;

        // boolean result=a>b && x>y;

        // int n=4;
        // int result= n%2==0?10:20;

        // System.out.println(result);

        int num1=4;
        int num2=5;

        Calculator calc=new Calculator();
        int result=calc.add(num1, num2);

        System.out.println(result);

    }
}