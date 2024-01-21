class NayaException extends RuntimeException{
    public NayaException(String string){
        super(string);
    }
}


public class throwKeyword {
    public static void main(String[] args) {
        int i=20;
        int j=0;
        try {
            j=18/i;
            if (j==0) {
                throw new NayaException("I don't want to print zero");
            }
        } catch (NayaException e) {
            j=18/1;
            System.out.println("That's the default output " + e);
        }catch(Exception e){
            System.out.println("Something Went wrong "+e);
        }
        System.out.println(j);
    }
}
