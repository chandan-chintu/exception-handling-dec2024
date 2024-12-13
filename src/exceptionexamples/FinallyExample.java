package exceptionexamples;

public class FinallyExample {
    public static void main(String[] args) {
        try{
            int a=10;
            int res =a/10;
            System.out.println("res is : "+res);
        } catch (Exception e){
            System.out.println("Exception occured : "+e.getMessage());
        }
        finally {
            System.out.println("it always executes");
        }
    }
}
