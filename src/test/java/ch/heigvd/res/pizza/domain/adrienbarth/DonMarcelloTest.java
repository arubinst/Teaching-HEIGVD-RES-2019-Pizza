package ch.heigvd.res.pizza.domain.adrienbarth;

import ch.heigvd.res.pizza.domain.Pizzaiolo;
import ch.heigvd.res.pizza.protocol.OrderRequest;
import ch.heigvd.res.pizza.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DonMarcelloTest {

    @Test
    void thePriceAndNameForDonMarcelloShouldBeCorrect() {
        DonMarcello beer = new DonMarcello();
        assertEquals(beer.getName(), DonMarcello.NAME);
        assertEquals(beer.getPrice(), DonMarcello.PRICE);
    }

    @Test
    void aPizzaioloShouldAcceptAnOrderForDonMarcello() {
        Pizzaiolo mario = new Pizzaiolo();
        String productName = "ch.heigvd.res.pizza.domain.adrienbarth.DonMarcello";
        int numberOfPizzas = 2;
        OrderRequest request = new OrderRequest(numberOfPizzas, productName);
        OrderResponse response = mario.order(request);
        BigDecimal expectedTotalPrice = DonMarcello.PRICE.multiply(new BigDecimal(numberOfPizzas));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }

}