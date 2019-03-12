package ch.heigvd.res.pizza.domain.Enophi;

import ch.heigvd.res.pizza.domain.IProduct;

import java.math.BigDecimal;

/**
 * TODO Entête
 *
 * @author david
 * @version 1
 * @since 2019-03-12
 */
public class Margaritta implements IProduct {

    public final static String NAME = "Margaritta";
    public final static BigDecimal PRICE = new BigDecimal(16.8);

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public BigDecimal getPrice() {
        return PRICE;
    }
}
