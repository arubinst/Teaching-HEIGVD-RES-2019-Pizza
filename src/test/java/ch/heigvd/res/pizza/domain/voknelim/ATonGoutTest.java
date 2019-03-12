package ch.heigvd.res.pizza.domain.voknelim;

import ch.heigvd.res.pizza.domain.Pizzaiolo;
import ch.heigvd.res.pizza.protocol.OrderRequest;
import ch.heigvd.res.pizza.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ATonGoutTest {

    @Test
    void thePriceAndNameForATonGoutShouldBeCorrect() {
        ATonGout pizza = new ATonGout();
        assertEquals(pizza.getName(), ATonGout.NAME);
        assertEquals(pizza.getPrice(), ATonGout.PRICE);
    }

    @Test
    void aPizzaioloShouldAcceptAnOrderForATonGout() {
        Pizzaiolo mario = new Pizzaiolo();
        String productName = "ch.heigvd.res.pizza.domain.voknelim.ATonGout";
        int numberOfPizzas = 2;
        OrderRequest request = new OrderRequest(numberOfPizzas, productName);
        OrderResponse response = mario.order(request);
        BigDecimal expectedTotalPrice = ATonGout.PRICE.multiply(new BigDecimal(numberOfPizzas));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }

}