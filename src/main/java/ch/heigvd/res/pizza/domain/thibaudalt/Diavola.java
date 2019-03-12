package ch.heigvd.res.pizza.domain.thibaudalt;

import ch.heigvd.res.pizza.domain.IProduct;

import java.math.BigDecimal;

public class Diavola implements IProduct {

    public final static String NAME = "Diavola";
    public final static BigDecimal PRICE = new BigDecimal(17.5);

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public BigDecimal getPrice() {
        return PRICE;
    }
}
