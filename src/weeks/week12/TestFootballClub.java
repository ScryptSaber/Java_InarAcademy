package weeks.week12;

public class TestFootballClub {
    public static void main(String[] args) {
        Player messi = new Player("Messi", 10_000_000);
        Player ronaldo = new Player("Ronaldo", 10_000_000);
        Player maguire = new Player("Maguire", 12_000);
        Player neymar = new Player("Neymar", 8_000_000);
        Player mbappe = new Player("Mbappe", 15_000_000);
        Player haaland = new Player("Haaland", 18_000_000);
        Player veli = new Player("Veli Kavlak", 100);
        Player olcay = new Player("Olcay Sahan", 50);
        Player salah = new Player("Muhammed Salah",5_000_000);

        FootballClub dallas_spor = new FootballClub("Dallasspor", 10, 50_000_000l, "Mavericks Stadium", 47856,new Player[5]);
        dallas_spor.buyPlayer(messi);
        dallas_spor.buyPlayer(mbappe);
        dallas_spor.buyPlayer(haaland);
        dallas_spor.buyPlayer(neymar);
        dallas_spor.buyPlayer(ronaldo);

        dallas_spor.sellPlayer(messi);

        dallas_spor.buyPlayer(olcay);
        dallas_spor.buyPlayer(veli);
        dallas_spor.buyPlayer(salah);
        dallas_spor.buyPlayer(neymar);

        System.out.println(dallas_spor.getBalance());

    }
}
