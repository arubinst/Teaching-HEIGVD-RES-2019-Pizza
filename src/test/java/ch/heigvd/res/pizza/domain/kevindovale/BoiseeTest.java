package ch.heigvd.res.pizza.domain.kevindovale;

import ch.heigvd.res.pizza.domain.Pizzaiolo;
import ch.heigvd.res.pizza.protocol.OrderRequest;
import ch.heigvd.res.pizza.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class BoiseeTest {

    @Test
    void thePriceAndNameForBoiseeShouldBeCorrect() {
        Boisee pizza = new Boisee();
        assertEquals(pizza.getName(), Boisee.NAME);
        assertEquals(pizza.getPrice(), Boisee.PRICE);
    }

    @Test
    void aPizzaioloShouldAcceptAnOrderForBoisee() {
        Pizzaiolo mario = new Pizzaiolo();
        String productName = "ch.heigvd.res.pizza.domain.kevindovale.Boisee";
        int numberOfPizzas = 2;
        OrderRequest request = new OrderRequest(numberOfPizzas, productName);
        OrderResponse response = mario.order(request);
        BigDecimal expectedTotalPrice = Boisee.PRICE.multiply(new BigDecimal(numberOfPizzas));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }
}