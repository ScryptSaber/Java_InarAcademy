package chapters.chapter13.Exercise08;

public class Exercise13_08 {
    public static void main(String[] args) throws CloneNotSupportedException {
        MyStack stack1 = new MyStack();

        System.out.println("Pushing the number 4, 5, and 6 to 1st stack...");
        stack1.push(new Integer(4));
        stack1.push(new Integer(5));
        stack1.push(new Integer(6));

        System.out.println("Cloning 1st stack...");
        MyStack stack2 = (MyStack)stack1.clone();

        System.out.println("Popping object from 1st stack...");
        stack1.pop();

        System.out.print("1st ");
        System.out.println(stack1);
        System.out.print("2nd ");
        System.out.println(stack2);
        System.out.println("Is the 1st stack equal to the 2nd stack? --> " + (stack1 == stack2));
    }
}
