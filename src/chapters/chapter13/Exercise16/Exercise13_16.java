package chapters.chapter13.Exercise16;

public class Exercise13_16 {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Usage: java Exercise13_16 operand1 operator operand2");
            System.exit(0);
        }

        String[] s1 = args[0].split("/");
        String[] s2 = args[2].split("/");

        Rational r1 = new Rational(Integer.parseInt(s1[0]), Integer.parseInt(s1[1]));
        Rational r2 = new Rational(Integer.parseInt(s2[0]), Integer.parseInt(s2[1]));

        String str="";
        switch (args[1].charAt(0)) {
            case '+' : str = args[0] + " + " + args[2] + " = " + r1.add(r2);break;
            case '-' : str = args[0] + " - " + args[2] +" = " + r1.subtract(r2); break;
            case '.' : str = args[0] + " * " + args[2] +" = " + r1.multiply(r2); break;
            case '/' : str = args[0] + " / " + args[2] +" = " + r1.divide(r2); break;
            default : System.out.println("Illegal Argument: + - . /");
                System.exit(0);
        }

        System.out.println(str);
    }
}
