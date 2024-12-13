package ownexceptions;

public class MyOwnException extends Exception{

    //1. creating class with our own required name
    //2. extends parent Exception class
    //3. generate constructors

    public MyOwnException() {
    }

    public MyOwnException(String message) {
        super(message);
    }
}
