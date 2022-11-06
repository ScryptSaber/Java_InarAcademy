package weeks.week13;

public class HomeTest {
    public static void main(String[] args) {
        System.out.println("     Default Ev:  ");
        System.out.println("-------------------");
        Home home = new Home();
        home.print();

        System.out.println("    Villa: ");
        System.out.println("------------------");
        Home villa = new Home(355.12, 4, 15, true, 100_000_000, 50_000, "Guney", 2022);
        villa.print();

        System.out.println("    Apartman: ");
        System.out.println("------------------");
        Home apartman = new Home(55.12, 1, 3, true, 1_000_000, 4_000, "Guney", 2009);
        villa.print();

    }
}
