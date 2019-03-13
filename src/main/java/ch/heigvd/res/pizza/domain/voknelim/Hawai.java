package ch.heigvd.res.pizza.domain.voknelim;

import ch.heigvd.res.pizza.domain.IProduct;

import java.math.BigDecimal;

public class Hawai implements IProduct {

    public final static String NAME = "Hawai";
    public final static BigDecimal PRICE = new BigDecimal(15);

    public String getName() {
        return NAME;
    }

    public BigDecimal getPrice(){
        return PRICE;
    }
}
