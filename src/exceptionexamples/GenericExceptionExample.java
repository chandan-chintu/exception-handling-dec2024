package exceptionexamples;

public class GenericExceptionExample {
    public static void main(String[] args) {
        try {
            System.out.println("inside try block");
            int arr[] = {10, 34, 22};
            System.out.println("4th index element is : " + arr[4]);
            int a = 10 / 0;
            System.out.println(" a is : " + a);
            System.out.println("end try block");
        } catch (Exception e) {
            System.out.println("Exception occured : " + e.getMessage()+"------------Exception name : "+e.getClass());
        }
        System.out.println("Multiple catch blocks ended");
    }
}
