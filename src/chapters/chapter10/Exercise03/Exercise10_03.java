package chapters.chapter10.Exercise03;

public class Exercise10_03 {
    public static void main(String[] args) {
        MyInteger number = new MyInteger(41614161);

        System.out.println("getValue():  " + number.getValue());
        System.out.println("isEven(): " + number.isEven());
        System.out.println("isOdd(): " + number.isOdd());
        System.out.println("isPrime(): " + number.isPrime());
        System.out.println("equals(10): " + number.equals(1000));
        System.out.println("equals(MyInteger(41614161)): " + number.equals(new MyInteger(41614161)));
        System.out.println("isEven(41614161) static: " + MyInteger.isEven(41614161));
        System.out.println("isOdd(41614161) static: " + MyInteger.isOdd(41614161));
        System.out.println("isPrime(41614161) static: " + MyInteger.isPrime(41614161));
        System.out.println("parseInt(char[]{1, 2, 3}) static: " + MyInteger.parseInt(new char[]{'1', '2', '3'}));
        System.out.println("parseInt(String 123) static: " + MyInteger.parseInt(("123")));

    }
}
