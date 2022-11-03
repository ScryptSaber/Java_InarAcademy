package chapters.chapter09.checkpoint09;

public class Checkpoint09_30 {
    public class A {
        private int[] values;

        public int[] getValues() {
            return values;
        }
    }// It's not a immutable class,
    // because the getValues method returns the reference of the private data field
}

