import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GiftCardTest {

    public GiftCard giftCard;

    @Before
    public void before() {
        giftCard = new GiftCard (50.00, "gift card");
    }

    @Test
    public void canGetBalance() {
        assertEquals(50.00, giftCard.getBalance(), 0.0);
    }

    @Test
    public void canReduceBalance() {
        assertEquals(40.00, giftCard.reduceBalance(10.00), 0.0);
    }

    @Test
    public void canChargeCard() {
        giftCard.chargeCard(10.00);
        assertEquals(40.00, giftCard.getBalance(), 0.0);
    }
}
