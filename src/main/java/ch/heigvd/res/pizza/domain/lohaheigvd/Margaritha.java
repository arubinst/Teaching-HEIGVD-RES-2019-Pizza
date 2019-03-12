package ch.heigvd.res.pizza.domain.wasadigi;

import ch.heigvd.res.pizza.domain.IProduct;

import java.math.BigDecimal;

public class Margaritha implements IProduct {

    public final static String NAME = "Margaritha";
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
