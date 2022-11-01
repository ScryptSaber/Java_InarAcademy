package chapters.chapter09.Exercise10;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;


    public QuadraticEquation() {
    }

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getDiscriminant() {
        double delta=(b * b) - 4 * a * c;
        return delta;
    }

    public double getRoot1() {
        if(getDiscriminant()<0){
            return 0;
        }else {
            double r1;
            r1 = ((-b) + Math.sqrt((b * b) - 4 * a * c)) / 2 * a;
            return r1;
        }
    }

    public double getRoot2() {
        if(getDiscriminant()<0) {
            return 0;
        }else {
            double r2;
            r2 = ((-b) - Math.sqrt((b * b) - 4 * a * c)) / 2 * a;
            return r2;
        }
    }
}
