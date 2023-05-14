package kata.stack;

//public class StackOverflowException extends Exception{ // Checked exception
public class StackOverflowException extends RuntimeException{ // unChecked exception
    public StackOverflowException(String message) {
        super(message);
    }
}

