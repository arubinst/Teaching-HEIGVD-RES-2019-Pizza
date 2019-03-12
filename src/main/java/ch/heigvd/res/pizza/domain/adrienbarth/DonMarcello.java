package ch.heigvd.res.pizza.domain.adrienbarth;

import ch.heigvd.res.pizza.domain.IProduct;

import java.math.BigDecimal;

public class DonMarcello implements IProduct {

    public final static String NAME = "Don Marcello";
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
