package ch.heigvd.res.pizza.domain.Enophi;

import ch.heigvd.res.pizza.domain.Pizzaiolo;
import ch.heigvd.res.pizza.protocol.OrderRequest;
import ch.heigvd.res.pizza.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * TODO Entête
 *
 * @author david
 * @version 1
 * @since 2019-03-12
 */
class EnopizzaTest {
    @Test
    void thePriceAndNameForEnopizzaShouldBeCorrect() {
        Enopizza beer = new Enopizza();
        assertEquals(beer.getName(), Enopizza.NAME);
        assertEquals(beer.getPrice(), Enopizza.PRICE);
    }

    @Test
    void aPizzaioloShouldAcceptAnOrderForEnopizza() {
        Pizzaiolo mario = new Pizzaiolo();
        String productName = "ch.heigvd.res.pizza.domain.Enophi.Enopizza";
        int numberOfPizzas = 2;
        OrderRequest request = new OrderRequest(numberOfPizzas, productName);
        OrderResponse response = mario.order(request);
        BigDecimal expectedTotalPrice = Enopizza.PRICE.multiply(new BigDecimal(numberOfPizzas));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }
}