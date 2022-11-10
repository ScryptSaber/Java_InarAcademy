package chapters.chapter10.Exercise10;

public class Queue {
    private int[] elements;
    private int size;

    public Queue() {
        elements = new int[8]; // 8 is default
        size = 0;
    }

    public void enqueue(int v) {
        if (size >= elements.length) {
            int[] temp = new int[elements.length * 2];
            System.arraycopy(elements, 0, temp, 0, elements.length);
            elements = temp;
        }
        elements[size] = v;
        size++;
    }

    public int dequeue() {
        int head = elements[0];

        for (int i = 1; i < size; i++) {
            elements[i - 1] = elements[i];
        }
        size--;
        return head;
    }

    public boolean empty() {
        return size == 0;
    }

    public int getSize() {
        return size;
    }


}
