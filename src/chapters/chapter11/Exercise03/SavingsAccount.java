package chapters.chapter11.Exercise03;

import chapters.chapter09.Exercise07.Account;

public class SavingsAccount extends Account {
    public SavingsAccount() {
        super();
    }

    public SavingsAccount(int id, double balance) {
        super(id, balance);
    }

    @Override
    public void withdraw(int amount) {
        if (getBalance() >= amount) {
            setBalance(getBalance() - amount);
        } else {
            System.out.println("You cannot withdraw money !!");
        }
    }

    @Override
    public String toString() {
        return "ID :" + getId() +
                "\nBalance is $" + this.getBalance();
    }

}
