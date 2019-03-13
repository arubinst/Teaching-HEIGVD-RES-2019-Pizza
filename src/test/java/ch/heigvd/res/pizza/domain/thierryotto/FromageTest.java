package ch.heigvd.res.pizza.domain.thierryotto;

import ch.heigvd.res.pizza.domain.Pizzaiolo;
import ch.heigvd.res.pizza.protocol.OrderRequest;
import ch.heigvd.res.pizza.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FromageTest {

  @Test
  void thePriceAndNameForFromageShouldBeCorrect() {
    Fromage beer = new Fromage();
    assertEquals(beer.getName(), Fromage.NAME);
    assertEquals(beer.getPrice(), Fromage.PRICE);
  }

  @Test
  void aPizzaioloShouldAcceptAnOrderForFromage() {
    Pizzaiolo mario = new Pizzaiolo();
    String productName = "ch.heigvd.res.pizza.domain.thierryotto.Fromage";
    int numberOfPizzas = 2;
    OrderRequest request = new OrderRequest(numberOfPizzas, productName);
    OrderResponse response = mario.order(request);
    BigDecimal expectedTotalPrice = Fromage.PRICE.multiply(new BigDecimal(numberOfPizzas));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}