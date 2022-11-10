package chapters.chapter10.Exercise13;

public class MyRectangle2D {
    private double x;
    private double y;
    private double width;
    private double height;

    public MyRectangle2D() {
        this(0, 0, 1, 1);
    }

    public MyRectangle2D(double x, double y, double width, double height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public double getY() {
        return y;
    }

    public double getX() {
        return x;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getArea() {
        return this.height * this.width;
    }

    public double getPerimeter() {
        return 2 * (this.height + this.width);
    }

    public boolean contains(double x, double y) {
        return ((this.x + (width / 2) >= x && x >= this.x - (width / 2)) &&
                (this.y + (height / 2) >= y && y >= this.y - (height / 2)));
    }

    public boolean contains(MyRectangle2D r) {
        if (this.getLeftX() <= r.getLeftX() &&
                this.getRightX() >= r.getRightX() &&
                this.getBottomY() <= r.getBottomY() &&
                this.getTopY() >= r.getTopY()) {
            return true;
        }
        return false;
    }

    public boolean overlaps(MyRectangle2D r) {
        if ((r.getLeftX() <= this.getRightX() && r.getRightX() > this.getRightX()) ||
                (r.getRightX() >= this.getLeftX() && r.getLeftX() < this.getLeftX()) ||
                (r.getBottomY() <= this.getRightX() && r.getRightX() > this.getRightX()) ||
                (r.getRightX() >= this.getBottomY() && r.getBottomY() < this.getBottomY())) {
            return true;
        }
        return false;
    }

    private double getLeftX() {
        return this.getX() - (this.getWidth() / 2);
    }

    private double getRightX() {
        return this.getX() + (this.getWidth() / 2);
    }

    private double getBottomY() {
        return this.getY() - (this.getHeight() / 2);
    }

    private double getTopY() {
        return this.getY() + (this.getHeight() / 2);
    }

    public String toString() {
        return "Rectangle's center (" + this.getX() + ", " + this.getY() + ") width -> "
                + getWidth() + " height -> " + getHeight();
    }
}
