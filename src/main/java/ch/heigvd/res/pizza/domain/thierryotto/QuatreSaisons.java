package ch.heigvd.res.pizza.domain.thierryotto;

import ch.heigvd.res.pizza.domain.IProduct;

import java.math.BigDecimal;

public class QuatreSaisons implements IProduct {

  public final static String NAME = "Quatre Saisons";
  public final static BigDecimal PRICE = new BigDecimal(21.0);

  @Override
  public String getName() {
    return NAME;
  }

  @Override
  public BigDecimal getPrice() {
    return PRICE;
  }
}
