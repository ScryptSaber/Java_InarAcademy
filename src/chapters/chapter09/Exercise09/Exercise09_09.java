package chapters.chapter09.Exercise09;

public class Exercise09_09 {
    public static void main(String[] args) {
        RegularPolygon polygon1 = new RegularPolygon();
        RegularPolygon polygon2 = new RegularPolygon(6, 4);
        RegularPolygon polygon3 = new RegularPolygon(10, 4, 5.6, 7.8);

        System.out.println("First " + polygon1.toString());
        System.out.println("Second " + polygon2.toString());
        System.out.println("Third " + polygon3.toString());
    }
}
