import java.util.ArrayList;

public class Wallet {

    private ArrayList<IChargeable> paymentTypes;
    private IChargeable selectedCard;
    // private ArrayList<IChargeable> selectedPaymentType;

    public Wallet () {
        this.paymentTypes = new ArrayList<>();
        this.selectedCard = null;
        // this.selectedPaymentType = new ArrayList<>(); <- Can have an empty variable so don't need an empty ArrayList here
    }

    public int getNumberOfPaymentTypes() {
        return this.paymentTypes.size();
    }

    public IChargeable getSelectedCard() {
        return this.selectedCard;
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

//    public void setSelectedCard(IChargeable card){
//        if (cards.contains(card)){
//            this.selectedCard = card;
//        }
//    }


    // selectedCard is an IChargeable. We can access the methods we have previously written in IChargeable. THIS IS WHY YOU NEED INTERFACES!
    public void makePayment(double amount) {
        this.selectedCard.chargeCard(amount);
    }

}
