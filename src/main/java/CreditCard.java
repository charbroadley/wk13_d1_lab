public class CreditCard extends PaymentCard implements IChargeable {
    private double availableCredit;

    public CreditCard (String cardNumber, String expiryDate, int securityNumber, String name, double availableCredit) {
        super(cardNumber, expiryDate, securityNumber, name);
        this.availableCredit = availableCredit;
    }


    public double addPercentageToTransactionCost(double cost) {
        return cost * 1.02;
    }

    public void reduceCredit(double amount) {
        this.availableCredit -= amount;
    }

    public double getAvailableCredit() {
        return this.availableCredit;
    }

    public void chargeCard(double amount) {
        reduceCredit(amount);
    }
}
