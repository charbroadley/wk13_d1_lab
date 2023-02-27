public abstract class PaymentCard {

    private String cardNumber;
    private String expiryDate;
    private int securityNumber;
    private String name;

    public PaymentCard (String cardNumber, String expiryDate, int securityNumber, String name) {
        this.cardNumber = cardNumber;
        this.expiryDate = expiryDate;
        this.securityNumber = securityNumber;
        this.name = name;
    }

    public String logTransaction() {
        return "transaction is logged!";
    }

    public String getCardNumber() {
        return this.cardNumber;
    }

    public String getExpiryDate() {
        return this.expiryDate;
    }

    public String getCardName() {
        return this.name;
    }


}
