package info.fahd.learning.exceptions;

public class BaseException extends Exception {

    protected void logException(){
        this.getMessage();
    }
}

