package ru.job4j.converter;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ConverterTest {
    /**
     * test Converter Ruble to Dollars
     */
    @Test
    public void when69RubleToDollarThen1() {
        Converter converter = new Converter();
        int result = converter.rubleToDollar(69);
        assertThat(result, is(1));
    }

    /**
     * test Converter Ruble to Euro
     */

    @Test
    public void when77RubleToEuroThen1() {
        Converter converter = new Converter();
        int result = converter.rubleToEuro(77);
        assertThat(result, is(1));
    }

    /**
     * test Converter Dollar to Rubles
     */
    @Test
    public void when1DollarToRubleThen69() {
        Converter converter = new Converter();
        int result = converter.DollarToRuble(1);
        assertThat(result, is(69));
    }

    /**
     * test Converter Euro to Rubles
     */
    public void when1EuroToRublesThen77(){
        Converter converter = new Converter();
        int result = converter.EuroToRuble(1);
        assertThat(result, is(77));
    }
}