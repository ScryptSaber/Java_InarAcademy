package weeks.week15;

import java.io.IOException;

public class Exceptions {
    public static void main(String[] args) {
        // Runtime Exception is an UNCHECKED exception
//        throw new RuntimeException("This is a runtime exception by Inar");

        //All the other exceptions (excluding Runtime Exception's subclasses) are CHECKED exception

        try {
            ioexception();
        } catch (IOException e) {
            System.out.println("The IO Exception is caught/handled");
        }

        runtimeException();
    }

    private static void runtimeException() throws RuntimeException {
        System.out.println("This app throws runtime exception");
        throw new RuntimeException();
    }

    private static void ioexception() throws IOException {
        throw new IOException();
    }
}
