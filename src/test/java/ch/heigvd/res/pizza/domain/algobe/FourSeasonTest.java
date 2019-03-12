package ch.heigvd.res.pizza.domain.algobe;

import ch.heigvd.res.pizza.domain.Pizzaiolo;
import ch.heigvd.res.pizza.domain.algobe.FourSeason;
import ch.heigvd.res.pizza.protocol.OrderRequest;
import ch.heigvd.res.pizza.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FourSeasonTest {

  @Test
  void thePriceAndNameForFourSeasonShouldBeCorrect() {
    FourSeason pizza = new FourSeason();
    assertEquals(pizza.getName(), FourSeason.NAME);
    assertEquals(pizza.getPrice(), FourSeason.PRICE);
  }

  @Test
  void aPizzaioloShouldAcceptAnOrderForFourSeason() {
    Pizzaiolo mario = new Pizzaiolo();
    String productName = "ch.heigvd.res.pizza.domain.algobe.FourSeason";
    int numberOfPizzas = 2;
    OrderRequest request = new OrderRequest(numberOfPizzas, productName);
    OrderResponse response = mario.order(request);
    BigDecimal expectedTotalPrice = FourSeason.PRICE.multiply(new BigDecimal(numberOfPizzas));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}