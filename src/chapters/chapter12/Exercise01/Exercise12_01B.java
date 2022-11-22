package chapters.chapter12.Exercise01;

public class Exercise12_01B {
    public static void main(String[] args) throws Exception {
        if (args.length != 3) {
            System.out.println("Usage: java Calculator operand1 operator operand2");
            System.exit(0);
        }

        checkDigit(args[0]);
        checkDigit(args[2]);

        int result = 0;

        switch (args[1].charAt(0)) {
            case '+':
                result = Integer.parseInt(args[0]) +
                        Integer.parseInt(args[2]);
                break;
            case '-':
                result = Integer.parseInt(args[0]) -
                        Integer.parseInt(args[2]);
                break;
            case '.':
                result = Integer.parseInt(args[0]) *
                        Integer.parseInt(args[2]);
                break;
            case '/':
                result = Integer.parseInt(args[0]) /
                        Integer.parseInt(args[2]);
                break;
        }

        System.out.println(args[0] + ' ' + args[1] + ' ' + args[2] + " = " + result);
    }

    private static void checkDigit(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (!Character.isDigit(s.charAt(i))) {
                System.out.println("Wrong Input: " + s);
                System.exit(0);
            }
        }
    }
}
