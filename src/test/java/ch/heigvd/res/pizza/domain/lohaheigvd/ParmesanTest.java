package ch.heigvd.res.pizza.domain.wasadigi;

import ch.heigvd.res.pizza.domain.Pizzaiolo;
import ch.heigvd.res.pizza.protocol.OrderRequest;
import ch.heigvd.res.pizza.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ParmesanTest {

    @Test
    void thePriceAndNameForParmesanShouldBeCorrect() {
        Parmesan beer = new Parmesan();
        assertEquals(beer.getName(), Parmesan.NAME);
        assertEquals(beer.getPrice(), Parmesan.PRICE);
    }

    @Test
    void aPizzaioloShouldAcceptAnOrderForParmesan() {
        Pizzaiolo mario = new Pizzaiolo();
        String productName = "ch.heigvd.res.pizza.domain.wasadigi.Parmesan";
        int numberOfPizzas = 2;
        OrderRequest request = new OrderRequest(numberOfPizzas, productName);
        OrderResponse response = mario.order(request);
        BigDecimal expectedTotalPrice = Parmesan.PRICE.multiply(new BigDecimal(numberOfPizzas));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }

}