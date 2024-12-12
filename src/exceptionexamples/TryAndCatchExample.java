package exceptionexamples;

public class TryAndCatchExample {
    public static void main(String[] args) {
        int a= 10;
        int b=0;
        int res =0;
        try{
            //code monitor
            System.out.println("Inside try block before exception occur");
            res=a/b;
            System.out.println("Inside try block after exception occur");
        } catch (ArithmeticException e){
            // handle exceptions
            System.out.println("Exception occurred : "+e.getMessage());
        }
        System.out.println("a is : "+a);
        System.out.println("b is : "+b);
        System.out.println("res is :"+res);
    }
}
