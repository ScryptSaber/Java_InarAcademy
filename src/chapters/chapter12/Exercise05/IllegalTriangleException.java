package chapters.chapter12.Exercise05;

public class IllegalTriangleException extends Exception {
    public IllegalTriangleException() {
        super("It is illegal triangle !!");
    }

    public IllegalTriangleException(String message) {
        super(message);
    }
}
