package exceptionexamples;

public class MultipleCatchExample {
    public static void main(String[] args) {
        try{
            System.out.println("inside try block");
            int arr[] ={10,34,22,44,55};
            System.out.println("4th index element is : "+arr[4]);
            int a = 10/0;
            System.out.println(" a is : "+a);
            System.out.println("end try block");
        } catch (ArithmeticException e){
            System.out.println("Exception occured : "+e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Exception occured : "+e.getMessage());
        }
        System.out.println("Multiple catch blocks ended");
    }
}
