package ch.heigvd.res.pizza.domain.kevindovale;

import ch.heigvd.res.pizza.domain.Pizzaiolo;
import ch.heigvd.res.pizza.protocol.OrderRequest;
import ch.heigvd.res.pizza.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class MexicanaTest {

    @Test
    void thePriceAndNameForMexicanaShouldBeCorrect() {
        Mexicana pizza = new Mexicana();
        assertEquals(pizza.getName(), Mexicana.NAME);
        assertEquals(pizza.getPrice(), Mexicana.PRICE);
    }

    @Test
    void aPizzaioloShouldAcceptAnOrderForMexicana() {
        Pizzaiolo mario = new Pizzaiolo();
        String productName = "ch.heigvd.res.pizza.domain.kevindovale.Mexicana";
        int numberOfPizzas = 2;
        OrderRequest request = new OrderRequest(numberOfPizzas, productName);
        OrderResponse response = mario.order(request);
        BigDecimal expectedTotalPrice = Mexicana.PRICE.multiply(new BigDecimal(numberOfPizzas));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }
}