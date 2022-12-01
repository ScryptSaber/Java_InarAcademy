package chapters.chapter13.Exercise06;

import java.util.Date;

public abstract class GeometricObject {
    private String color;
    private boolean filled;
    private Date dateCreated;

    protected GeometricObject() {
        this("default", false);
        dateCreated = new Date();
    }

    protected GeometricObject(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
        dateCreated = new Date();
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }


    @Override
    public String toString() {
        return "It is created on " + dateCreated + "\nColor: " + this.color + "\nisfilled: " + filled;
    }

    //Abstract Methods
    public abstract double getArea();

    public abstract double getPerimeter();
}
