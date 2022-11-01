package chapters.chapter09.Exercise07;

public class Exercise09_07 {
    public static void main(String[] args) {
        Account ac = new Account(1122, 20_000);
        ac.setAnnualInterestRate(4.5);
        ac.withdraw(2500);
        ac.deposit(3000);

        System.out.println("           Account Statement :");
        System.out.println("------------------------------------------");
        System.out.println("Account ID    : " + ac.getId());
        System.out.println("Date created  : " + ac.getDateCreated());
        System.out.printf("Balance       : $%.2f\n", ac.getBalance());
        System.out.printf("Monthly Interest: $%.2f\n", ac.getMonthlyInterest());
    }

}
