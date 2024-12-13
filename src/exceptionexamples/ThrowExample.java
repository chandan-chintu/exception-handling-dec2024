package exceptionexamples;

public class ThrowExample {
    public static void sample(){
        System.out.println("sample method started");
        int a=10;
        if(a==10){
            throw new RuntimeException("Random exception occured");// manually throwing an exception
        }
        System.out.println("sample method ended");
    }
    public static void main(String[] args) {

        try{
            sample();
        }catch (Exception e){
            System.out.println("Exception occured : "+e.getMessage()+"---------"+e.getClass());
        }
    }
}
