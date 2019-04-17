package ch.heigvd.res.pizza.domain.kevindovale;

import ch.heigvd.res.pizza.domain.IProduct;

import java.math.BigDecimal;

public class Boisee implements IProduct {

    public final static String NAME = "Boisee Pizza";
    public final static BigDecimal PRICE = new BigDecimal(20);

    public String getName() {
        return NAME;
    }

    public BigDecimal getPrice(){
        return PRICE;
    }
}

