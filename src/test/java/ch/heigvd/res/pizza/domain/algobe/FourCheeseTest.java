package ch.heigvd.res.pizza.domain.algobe;

import ch.heigvd.res.pizza.domain.Pizzaiolo;
import ch.heigvd.res.pizza.domain.algobe.FourCheese;
import ch.heigvd.res.pizza.protocol.OrderRequest;
import ch.heigvd.res.pizza.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FourCheeseTest {

  @Test
  void thePriceAndNameForFourCheeseShouldBeCorrect() {
    FourCheese pizza = new FourCheese();
    assertEquals(pizza.getName(), FourCheese.NAME);
    assertEquals(pizza.getPrice(), FourCheese.PRICE);
  }

  @Test
  void aPizzaioloShouldAcceptAnOrderForFourCheese() {
    Pizzaiolo mario = new Pizzaiolo();
    String productName = "ch.heigvd.res.pizza.domain.algobe.FourCheese";
    int numberOfPizzas = 2;
    OrderRequest request = new OrderRequest(numberOfPizzas, productName);
    OrderResponse response = mario.order(request);
    BigDecimal expectedTotalPrice = FourCheese.PRICE.multiply(new BigDecimal(numberOfPizzas));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}