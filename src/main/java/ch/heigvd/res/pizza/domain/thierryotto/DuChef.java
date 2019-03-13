package ch.heigvd.res.pizza.domain.thierryotto;

import ch.heigvd.res.pizza.domain.IProduct;

import java.math.BigDecimal;

public class DuChef implements IProduct {

  public final static String NAME = "Du Chef";
  public final static BigDecimal PRICE = new BigDecimal(20.0);

  @Override
  public String getName() {
    return NAME;
  }

  @Override
  public BigDecimal getPrice() {
    return PRICE;
  }
}
