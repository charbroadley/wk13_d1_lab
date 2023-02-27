public class GiftCard implements IChargeable {

    private double balance;
    private String name;

    public GiftCard (double balance, String name) {
        this.balance = balance;
        this.name = name;
    }

    public double getBalance() {
        return this.balance;
    }

    public double reduceBalance(double amount) {
        return this.balance -= amount;
    }

    public void chargeCard(double amount) {
        reduceBalance(amount);
    }

    public String getCardName() {
        return this.name;
    }
}
