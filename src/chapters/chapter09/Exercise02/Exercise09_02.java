package chapters.chapter09.Exercise02;

public class Exercise09_02 {
    public static void main(String[] args) {
        Stock stock = new Stock("ORCL", "Oracle Corporation");
        stock.previousClosingPrice = 34.5;
        stock.currentPrice = 34.35;

        System.out.println("Stock name  : " + stock.name);
        System.out.println("Stock symbol: " + stock.symbol);
        System.out.println("Price-change percentage: " + stock.getChangePercent());
    }
}
