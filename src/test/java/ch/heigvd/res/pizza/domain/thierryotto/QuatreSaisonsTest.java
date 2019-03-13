package ch.heigvd.res.pizza.domain.thierryotto;

import ch.heigvd.res.pizza.domain.Pizzaiolo;
import ch.heigvd.res.pizza.domain.thierryotto.QuatreSaisons;
import ch.heigvd.res.pizza.protocol.OrderRequest;
import ch.heigvd.res.pizza.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class QuatreSaisonsTest {

  @Test
  void thePriceAndNameForQuatreSaisonsShouldBeCorrect() {
    QuatreSaisons beer = new QuatreSaisons();
    assertEquals(beer.getName(), QuatreSaisons.NAME);
    assertEquals(beer.getPrice(), QuatreSaisons.PRICE);
  }

  @Test
  void aPizzaioloShouldAcceptAnOrderForQuatreSaisons() {
    Pizzaiolo mario = new Pizzaiolo();
    String productName = "ch.heigvd.res.pizza.domain.thierryotto.QuatreSaisons";
    int numberOfPizzas = 2;
    OrderRequest request = new OrderRequest(numberOfPizzas, productName);
    OrderResponse response = mario.order(request);
    BigDecimal expectedTotalPrice = QuatreSaisons.PRICE.multiply(new BigDecimal(numberOfPizzas));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}