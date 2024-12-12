package exceptionexamples;

public class ArrayIndexOutOfBoundExceptionExample {
    public static void main(String[] args) {
        try{
            int arr[] ={33,23,55,66};
            System.out.println("length of the array : "+arr.length);
            System.out.println("1st index element is : "+arr[1]);
            System.out.println("5th index element is : "+arr[5]);
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Exception occured : "+e.getMessage());
        }
    }
}
