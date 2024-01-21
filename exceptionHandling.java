
public class exceptionHandling {
    public static void main(String[] args) {
        int i=2;
        int j=0;

        int nums[]=new int[5];
        String str=null;

        try {
            j=18/i;
            System.out.println(str.length());
            System.out.println(nums[1]);
            System.out.println(nums[5]);

        } catch (ArithmeticException e) {

            System.out.println("Can not divide by 0");

        }catch(ArrayIndexOutOfBoundsException e){

            System.out.println("Stay in your limits");

        }catch(Exception e){
            
            System.out.println("Something went wrong");

        }
    }
    
}
