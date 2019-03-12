package ch.heigvd.res.pizza.domain.wasadigi;

import ch.heigvd.res.pizza.domain.Pizzaiolo;
import ch.heigvd.res.pizza.protocol.OrderRequest;
import ch.heigvd.res.pizza.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MargarithaTest {

    @Test
    void thePriceAndNameForMargarithaShouldBeCorrect() {
        Margaritha beer = new Margaritha();
        assertEquals(beer.getName(), Margaritha.NAME);
        assertEquals(beer.getPrice(), Margaritha.PRICE);
    }

    @Test
    void aPizzaioloShouldAcceptAnOrderForMargaritha() {
        Pizzaiolo mario = new Pizzaiolo();
        String productName = "ch.heigvd.res.pizza.domain.wasadigi.Margaritha";
        int numberOfPizzas = 2;
        OrderRequest request = new OrderRequest(numberOfPizzas, productName);
        OrderResponse response = mario.order(request);
        BigDecimal expectedTotalPrice = Margaritha.PRICE.multiply(new BigDecimal(numberOfPizzas));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }

}