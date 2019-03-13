package ch.heigvd.res.pizza.domain.thierryotto;

import ch.heigvd.res.pizza.domain.Pizzaiolo;
import ch.heigvd.res.pizza.protocol.OrderRequest;
import ch.heigvd.res.pizza.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DuChefTest {

  @Test
  void thePriceAndNameForDuChefShouldBeCorrect() {
    DuChef beer = new DuChef();
    assertEquals(beer.getName(), DuChef.NAME);
    assertEquals(beer.getPrice(), DuChef.PRICE);
  }

  @Test
  void aPizzaioloShouldAcceptAnOrderForDuChef() {
    Pizzaiolo mario = new Pizzaiolo();
    String productName = "ch.heigvd.res.pizza.domain.thierryotto.DuChef";
    int numberOfPizzas = 2;
    OrderRequest request = new OrderRequest(numberOfPizzas, productName);
    OrderResponse response = mario.order(request);
    BigDecimal expectedTotalPrice = DuChef.PRICE.multiply(new BigDecimal(numberOfPizzas));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}