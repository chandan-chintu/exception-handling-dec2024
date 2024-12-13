package ownexceptions;

public class SampleMain {
    public static void main(String[] args) {
        try{
            int a=10;
            if(a==10){
                throw new MyOwnException();
            }
        }catch (Exception e){
            System.out.println("Exception occurred : "+e.getMessage());
        }
    }
}
