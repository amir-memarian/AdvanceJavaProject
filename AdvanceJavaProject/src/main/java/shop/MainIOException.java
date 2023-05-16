package shop;

import java.io.IOException;

public class MainIOException extends RuntimeException {
    public MainIOException(IOException e) {
        super(e);
    }
}
