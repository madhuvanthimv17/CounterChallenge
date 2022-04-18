package exception;

/**
 * Exception class to handle invalid number of arguments passed by the user
 */
public class InvalidArgumentException extends Throwable{

    private String message;
    public InvalidArgumentException(String text){
        this.message = text;
    }

    public String getMessage(){
        return this.message;
    }
}
