public class CalculatorRunner {
    public static void main(String[] args) {
        VeryAdvCalc obj=new VeryAdvCalc();
        int r1=obj.add(6, 7);
        int r2= obj.sub(5, 4);
        double r3=obj.pow(2, 2);
        System.out.println(r1+ " : " + r2 + " : "+ r3);
    }
    
}
