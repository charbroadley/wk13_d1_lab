import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DebitCardTest {
    public DebitCard debitCard;

    @Before
    public void before() {
        debitCard = new DebitCard ("5356 9768 7342 5623", "28-02-23", 567, "debit card",56123490, "23-98-01", 500);
    }

    @Test
    public void canGetCardNumber() {
        assertEquals("5356 9768 7342 5623", debitCard.getCardNumber());
    }

    @Test
    public void canGetExpiryDate() {
        assertEquals("28-02-23", debitCard.getExpiryDate());
    }

    @Test
    public void canGetAccountNumber() {
        assertEquals(56123490, debitCard.getAccountNumber());
    }

    @Test
    public void canLogTransaction() {
        assertEquals("transaction is logged!", debitCard.logTransaction());
    }

    @Test
    public void canGetBalance() {
        assertEquals(500, debitCard.getBalance(), 0.0);
    }

    @Test
    public void canChargeCard() {
        debitCard.chargeCard(10.00);
        assertEquals(490.00, debitCard.getBalance(), 0.0);
    }
}
