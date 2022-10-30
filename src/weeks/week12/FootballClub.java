package weeks.week12;

public class FootballClub {
    int balance;
    String clubName;
    int ticketFee;
    String stadium;
    int stadiumCapacity;

    public FootballClub() {
        this(0, "", 0, "", 0);

    }

    public FootballClub(int balance, String clubName, int ticketFee, String stadium, int stadiumCapacity) {
        this.balance = balance;
        this.clubName = clubName;
        this.ticketFee = ticketFee;
        this.stadium = stadium;
        this.stadiumCapacity = stadiumCapacity;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void setClubName(String clubName) {
        this.clubName = clubName;
    }

    public void setTicketFee(int ticketFee) {
        this.ticketFee = ticketFee;
    }

    public void setStadium(String stadium) {
        this.stadium = stadium;
    }

    public void setStadiumCapacity(int stadiumCapacity) {
        this.stadiumCapacity = stadiumCapacity;
    }


    public int getBalance() {
        return this.balance;
    }

    public String getClubName() {
        return this.clubName;
    }

    public int getTicketFee() {
        return this.ticketFee;
    }

    public String getStadium() {
        return this.stadium;
    }

    public int getStadiumCapacity() {
        return this.stadiumCapacity;
    }


    public void print() {
        System.out.println("Balance:" + this.balance);
        System.out.println("Club Name: " + this.clubName);
        System.out.println("TicketFee: " + this.stadium);
        System.out.println("Stadium: " + this.stadium);
        System.out.println("Stadium Capacity: " + this.stadiumCapacity);
    }
}
