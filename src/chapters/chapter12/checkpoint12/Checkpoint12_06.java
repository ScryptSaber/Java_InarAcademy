package chapters.chapter12.checkpoint12;

public class Checkpoint12_06 {
    public static void main(String[] args) {
        for (int i = 0; i < 2; i++) {
            System.out.print(i + " ");
            try {
                System.out.println(1 / 0);
            } catch (Exception ex) {
            }
        }

        System.out.println("\n-------");
        try {
            for (int i = 0; i < 2; i++) {
                System.out.print(i + " ");
                System.out.println(1 / 0);
            }
        } catch (Exception ex) {
        }
    }
}
