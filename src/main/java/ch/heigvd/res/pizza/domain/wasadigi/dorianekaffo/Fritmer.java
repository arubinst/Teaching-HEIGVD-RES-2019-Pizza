package ch.heigvd.res.pizza.domain.dorianekaffo;

import ch.heigvd.res.pizza.domain.Pizzaiolo;
import ch.heigvd.res.pizza.protocol.OrderRequest;
import ch.heigvd.res.pizza.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Fritmer {

  @Test
  void thePriceAndNameForFitmerShouldBeCorrect() {
    Fritmer beer = new Fritmer();
    assertEquals(Fritmer.getName(), Fritmer.NAME);
    assertEquals(beer.getPrice(), Fritmer.PRICE);
  }

  @Test
  void aPizzaioloShouldAcceptAnOrderForFitmer() {
    Pizzaiolo dodo = new Pizzaiolo();
    String productName = "ch.heigvd.res.pizza.domain.tdorianekaffo.Fitmer";
    int numberOfPizzas = 2;
    OrderRequest request = new OrderRequest(numberOfPizzas, productName);
    OrderResponse response = dodo.order(request);
    BigDecimal expectedTotalPrice = Fritmer.PRICE.multiply(new BigDecimal(numberOfPizzas));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}
