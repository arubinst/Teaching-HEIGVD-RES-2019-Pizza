package ch.heigvd.res.pizza.domain.dwimcore;

import ch.heigvd.res.pizza.domain.Pizzaiolo;
import ch.heigvd.res.pizza.protocol.OrderRequest;
import ch.heigvd.res.pizza.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class ReginaTest  {

    @Test
    void thePriceAndNameForReginaShouldBeCorrect() {
        Regina pizza = new Regina();
        assertEquals(pizza.getName(), Regina.NAME);
        assertEquals(pizza.getPrice(), Regina.PRICE);
    }

    @Test
    void aPizzaioloShouldAcceptAnOrderForRegina() {
        Pizzaiolo mario = new Pizzaiolo();
        String productName = "ch.heigvd.res.pizza.domain.dwimcore.Regina";
        int numberOfPizzas = 2;
        OrderRequest request = new OrderRequest(numberOfPizzas, productName);
        OrderResponse response = mario.order(request);
        BigDecimal expectedTotalPrice = Regina.PRICE.multiply(new BigDecimal(numberOfPizzas));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }

}