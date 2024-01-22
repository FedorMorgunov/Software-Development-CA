import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CardTest {
    //tests that a Card object can be created and getValue() method returns the correct value
    @Test
    public void testGetValue() {
        int cardValue = 5;
        Card card = new Card(cardValue);

        assertEquals(cardValue, card.getValue(), "Card value should match");
    }

}