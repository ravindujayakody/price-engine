package com.ravindujayakody.priceengine;

import com.ravindujayakody.priceengine.engine.PriceCalculator;
import com.ravindujayakody.priceengine.product.Product;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PriceCalculatorTests {

    @Test
    public void priceCalculateTester(){

        Product testProduct = new Product("Penguin-ears", 20, 175.00);

        assertEquals(113.75, PriceCalculator.calculate(testProduct, 10));
        assertEquals(175.00, PriceCalculator.calculate(testProduct, 20));
        assertEquals(231.875, PriceCalculator.calculate(testProduct, 25));
        assertEquals(350.00, PriceCalculator.calculate(testProduct, 40));
        assertEquals(463.75, PriceCalculator.calculate(testProduct, 50));
        assertEquals(472.50, PriceCalculator.calculate(testProduct, 60));
        assertEquals(529.375, PriceCalculator.calculate(testProduct, 65));
    }

}
