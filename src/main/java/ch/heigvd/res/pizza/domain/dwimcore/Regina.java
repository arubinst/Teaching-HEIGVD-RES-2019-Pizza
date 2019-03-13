package ch.heigvd.res.pizza.domain.dwimcore;

import ch.heigvd.res.pizza.domain.IProduct;

import java.math.BigDecimal;

public class Regina implements IProduct {

    public final static String NAME = "Regina Pizza";
    public final static BigDecimal PRICE = new BigDecimal(20);

    public String getName() {
        return NAME;
    }

    public BigDecimal getPrice(){
        return PRICE;
    }
}
