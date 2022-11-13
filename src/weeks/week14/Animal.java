package weeks.week14;

public class Animal {
    private double height;
    private double weight;
    private boolean hasFlyingSkills;
    private boolean hasSwimmingSkills;

    public Animal(){
        this(0,0,false,true);
    }

    public Animal(double height, double weight, boolean hasFlyingSkills, boolean hasSwimmingSkills) {
        this.height = height;
        this.weight = weight;
        this.hasFlyingSkills = hasFlyingSkills;
        this.hasSwimmingSkills = hasSwimmingSkills;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public boolean isHasFlyingSkills() {
        return hasFlyingSkills;
    }

    public void setHasFlyingSkills(boolean hasFlyingSkills) {
        this.hasFlyingSkills = hasFlyingSkills;
    }

    public boolean isHasSwimmingSkills() {
        return hasSwimmingSkills;
    }

    public void setHasSwimmingSkills(boolean hasSwimmingSkills) {
        this.hasSwimmingSkills = hasSwimmingSkills;
    }

    public void runs() {
        System.out.println("It runs");

    }

    public void eats() {
        System.out.println("It eats");
    }

    public void sleeeps() {
        System.out.println("It sleeeps");
    }
}
