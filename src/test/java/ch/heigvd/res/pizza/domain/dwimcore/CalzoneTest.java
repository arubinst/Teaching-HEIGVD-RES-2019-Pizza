package ch.heigvd.res.pizza.domain.dwimcore;

import ch.heigvd.res.pizza.domain.Pizzaiolo;
import ch.heigvd.res.pizza.protocol.OrderRequest;
import ch.heigvd.res.pizza.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class CalzoneTest {

    @Test
    void thePriceAndNameForCalzoneShouldBeCorrect() {
        Calzone calzone = new Calzone();
        assertEquals(calzone.getName(), Calzone.NAME);
        assertEquals(calzone.getPrice(), Calzone.PRICE);
    }

    @Test
    void aPizzaioloShouldAcceptAnOrderForCalzone() {
        Pizzaiolo mario = new Pizzaiolo();
        String productName = "ch.heigvd.res.pizza.domain.dwimcore.Calzone";
        int numberOfPizzas = 2;
        OrderRequest request = new OrderRequest(numberOfPizzas, productName);
        OrderResponse response = mario.order(request);
        BigDecimal expectedTotalPrice = Calzone.PRICE.multiply(new BigDecimal(numberOfPizzas));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }

}
