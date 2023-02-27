import org.junit.Before;
import org.junit.Test;

import javax.smartcardio.Card;

import static org.junit.Assert.assertEquals;

public class CreditCardTest {
    public CreditCard creditCard;

    @Before
    public void before() {
        creditCard = new CreditCard ("5356 9768 7342 6532", "01-03-23", 546, "creditcard",2500.00);
    }

    @Test
    public void canGetCardNumber() {
        assertEquals("5356 9768 7342 6532", creditCard.getCardNumber());
    }

    @Test
    public void canAddPercentageToTransactionCost() {
        assertEquals(102.00, creditCard.addPercentageToTransactionCost(100), 0.0);
    }

    @Test
    public void canReduceCredit() {
        creditCard.reduceCredit(500.00);
        assertEquals(2000.00, creditCard.getAvailableCredit(), 0.0);
    }

    @Test
    public void canChargeCard() {
        creditCard.chargeCard(10.00);
        assertEquals(2490.00, creditCard.getAvailableCredit(), 0.0);
    }
}
