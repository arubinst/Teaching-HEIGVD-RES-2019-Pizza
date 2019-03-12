package ch.heigvd.res.pizza.domain.dorianekaffo;

import ch.heigvd.res.pizza.domain.IProduct;

import java.math.BigDecimal;

public class Fuitmer implements IProduct {

    public final static String NAME = "Fuitmer Pizza";
    public final static BigDecimal PRICE = new BigDecimal(12);

    public String getName() {
        return NAME;
    }


    public BigDecimal getPrice(){
        return PRICE;
    }
}