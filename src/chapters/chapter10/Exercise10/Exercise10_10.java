package chapters.chapter10.Exercise10;

public class Exercise10_10 {
    public static void main(String[] args) {
        Queue queue = new Queue();

        for (int i = 1; i <= 20; i++) {
            System.out.print(i + " ");
            queue.enqueue(i);
        }

        System.out.println("\n\nProcess of Dequeue :");

        while (!queue.empty()) {
            System.out.print(queue.dequeue() + " ");
        }
    }
}
