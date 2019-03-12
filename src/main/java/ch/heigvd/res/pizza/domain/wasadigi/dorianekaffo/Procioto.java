package ch.heigvd.res.pizza.domain.dorianekaffo;

import ch.heigvd.res.pizza.domain.IProduct;

import java.math.BigDecimal;

public class Procioto implements IProduct {

    public final static String NAME = "Procioto";
    public final static BigDecimal PRICE = new BigDecimal(16.0);

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public BigDecimal getPrice() {
        return PRICE;
    }
}