public class DebitCard extends PaymentCard implements IChargeable {

    private int accountNumber;
    private String sortCode;
    private double balance;

    public DebitCard (String cardNumber, String expiryDate, int securityNumber, String name, int accountNumber, String sortCode, double balance) {
        super(cardNumber, expiryDate, securityNumber, name);
        this.accountNumber = accountNumber;
        this.sortCode = sortCode;
        this.balance = balance;
    }

    public int getAccountNumber() {
        return this.accountNumber;
    }

    public double getBalance() {
        return this.balance;
    }

    public void chargeCard(double amount) {
        this.balance -= amount;
    }
}
