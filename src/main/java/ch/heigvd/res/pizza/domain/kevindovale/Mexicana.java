package ch.heigvd.res.pizza.domain.kevindovale;

import ch.heigvd.res.pizza.domain.IProduct;

import java.math.BigDecimal;

public class Mexicana implements IProduct {

    public final static String NAME = "Mexicana Pizza";
    public final static BigDecimal PRICE = new BigDecimal(17);

    public String getName() {
        return NAME;
    }

    public BigDecimal getPrice(){
        return PRICE;
    }
}