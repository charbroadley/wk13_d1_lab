import java.util.ArrayList;

public class Wallet {

    private ArrayList<IChargeable> paymentTypes;
    private IChargeable selectedCard;
    // private ArrayList<IChargeable> selectedPaymentType;

    public Wallet () {
        this.paymentTypes = new ArrayList<>();
        this.selectedCard = null;
        // this.selectedPaymentType = new ArrayList<>();
    }


    public int getNumberOfPaymentTypes() {
        return this.paymentTypes.size();
    }

    public void addPaymentType(IChargeable chosenCard) {
        this.paymentTypes.add(chosenCard);
    }

    public void selectPaymentCard(IChargeable chosenCard) {
        for (IChargeable card : this.paymentTypes) {
            if (card.equals(chosenCard)) {
                this.selectedCard = card;
            }
        }
    }

    // selectedCard is an IChargeable so we can access the methods in IChargeable
    public void makePayment(double amount) {
        this.selectedCard.chargeCard(amount);
    }

    public IChargeable getSelectedCard() {
        return this.selectedCard;
    }
}
