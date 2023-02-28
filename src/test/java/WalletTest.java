import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class WalletTest {

    public Wallet wallet;
    public DebitCard debitCard;
    public CreditCard creditCard;

    @Before
    public void before() {
        wallet = new Wallet ();
        debitCard = new DebitCard ("5356 9768 7342 5623", "28-02-23", 567, "debit card", 56123490, "23-98-01", 500);
        creditCard = new CreditCard ("5356 9768 7342 6532", "01-03-23", 546, "credit card",2500.00);
    }

    @Test
    public void canAddPaymentType() {
        wallet.addPaymentType(debitCard);
        assertEquals(1, wallet.getNumberOfPaymentTypes());
    }
    // This would still pass by mistake because you could have added null to the list and that list would have a length of one. Do a type check instead (might need another method to get the card):
    // assertTrue(wallet.getCard() instanceof DebitCard); <- see below
    // Checks the thing on the left is an instance of the class on the right
    // OR add a null check into the method so that the method cannot complete if the thing selected is null

    @Test
    public void canSelectPaymentType() {
        wallet.addPaymentType(debitCard);
        wallet.addPaymentType(creditCard);
        wallet.selectPaymentCard(debitCard);
        IChargeable selectedCard = wallet.getSelectedCard();
        assertTrue(selectedCard instanceof DebitCard);
    }

    @Test
    public void canPayWithSelectedCard() {
        wallet.addPaymentType(debitCard);
        wallet.addPaymentType(creditCard);
        wallet.selectPaymentCard(debitCard);
        wallet.makePayment(100.00);
        assertEquals(400.00, debitCard.getBalance(),0.0);
    }
}
