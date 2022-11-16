package chapters.chapter11.Exercise10;

import java.util.Scanner;

public class Exercise11_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        MyStack stack = new MyStack();
        System.out.print("Enter five strings: ");
        for (int i = 0; i < 5; i++) {
            stack.push(input.next());
        }
        System.out.println(stack.toString());

        System.out.println("Displaying them in reverse order..");
        int size = stack.getSize();
        for (int i = 0; i < size; i++) {
            System.out.print(stack.pop() + " ");
        }
    }
}
