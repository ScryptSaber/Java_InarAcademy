package chapters.chapter10.Exercise02;

public class BMI {
    private String name;
    private int age;
    private double weight;

    private double height;
    public static final double KILOGRAMS_PER_POUND = 0.45359237;
    public static final double METERS_PER_INCH = 0.0254;
    public static final int INCH_PER_FOOT = 12;

    public BMI() {
        this("Default",0,0,0);
    }

    public BMI(String name, int age, double weight, double feet, double inches) {
        this(name, age, weight, inches + feet * INCH_PER_FOOT);
    }

    public BMI(String name, int age, double weight, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    public double getBMI() {
        double bmi = weight * KILOGRAMS_PER_POUND / ((height * METERS_PER_INCH) * (height * METERS_PER_INCH));

        return (double) Math.round(bmi);
    }

    public String getStatus() {
        double bmi = getBMI();
        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi < 25) {
            return "Normal";
        } else if (bmi < 30) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }

    public double getHeight() {
        return height;
    }

    public void print() {
        System.out.println("Name: " + this.name);
        System.out.println("BMI : " + this.getBMI() + " " + this.getStatus());
    }

}