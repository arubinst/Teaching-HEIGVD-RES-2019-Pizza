package ch.heigvd.res.pizza.domain.thierryotto;

import ch.heigvd.res.pizza.domain.IProduct;

import java.math.BigDecimal;

public class Fromage implements IProduct {

  public final static String NAME = "Fromage";
  public final static BigDecimal PRICE = new BigDecimal(15.0);

  @Override
  public String getName() {
    return NAME;
  }

  @Override
  public BigDecimal getPrice() {
    return PRICE;
  }
}
