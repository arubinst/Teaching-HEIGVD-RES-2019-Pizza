package ch.heigvd.res.pizza.domain.dorianekaffo;

import ch.heigvd.res.pizza.domain.Pizzaiolo;
import ch.heigvd.res.pizza.protocol.OrderRequest;
import ch.heigvd.res.pizza.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Fitmer {

  @Test
  void thePriceAndNameForFitmerShouldBeCorrect() {
    Fitmer beer = new Fitmer();
    assertEquals(Fitmer.getName(), Fitmer.NAME);
    assertEquals(beer.getPrice(), Fitmer.PRICE);
  }

  @Test
  void aPizzaioloShouldAcceptAnOrderForFitmer() {
    Pizzaiolo dodo = new Pizzaiolo();
    String productName = "ch.heigvd.res.pizza.domain.tdorianekaffo.Fitmer";
    int numberOfPizzas = 2;
    OrderRequest request = new OrderRequest(numberOfPizzas, productName);
    OrderResponse response = dodo.order(request);
    BigDecimal expectedTotalPrice = Fitmer.PRICE.multiply(new BigDecimal(numberOfPizzas));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}
