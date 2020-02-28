package com.tata.javatests.discounts;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class PriceCalculatorTest {
    @Test
    public void total_is_zero_when_isEmpty() {
        PriceCalculator calculator = new PriceCalculator();
        assertThat(calculator.getTotal(), is(0.0));
    }

    @Test
    public void total_is_the_sum_of_prices() {
        PriceCalculator calculator = new PriceCalculator();
        calculator.addPrice(10.2);
        calculator.addPrice(5.3);
        assertThat(calculator.getTotal(), is(15.5));
    }

    @Test
    public void total_with_discount() {
        PriceCalculator calculator = new PriceCalculator();
        calculator.setDiscount(50);
        calculator.addPrice(10.2);
        calculator.addPrice(9.8);
        assertThat(calculator.getTotal(), is(10.0));
    }
}