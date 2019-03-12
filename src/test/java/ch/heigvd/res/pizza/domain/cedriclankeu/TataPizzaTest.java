package ch.heigvd.res.pizza.domain.cedriclankeu;

import ch.heigvd.res.pizza.domain.Pizzaiolo;
import ch.heigvd.res.pizza.protocol.GreetingsRequest;
import ch.heigvd.res.pizza.protocol.GreetingsResponse;
import org.junit.jupiter.api.Test;

class TataPizzaTest {

  @Test
  void aPizzaioloShouldReplyToGreetings() {
    Pizzaiolo luigi = new Pizzaiolo();
    GreetingsRequest request = new GreetingsRequest("Hi there");
    GreetingsResponse response = luigi.greet(request);
    assertEquals("hello, how can I help you?", response.getText());
  }

}