package ch.heigvd.res.pizza.domain.algobe;

import ch.heigvd.res.pizza.domain.IProduct;

import java.math.BigDecimal;

public class FourSeason implements IProduct {

  public final static String NAME = "Four Season";
  public final static BigDecimal PRICE = new BigDecimal(18.0);

  @Override
  public String getName() {
    return NAME;
  }

  @Override
  public BigDecimal getPrice() {
    return PRICE;
  }
}
