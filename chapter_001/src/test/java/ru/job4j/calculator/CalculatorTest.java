package ru.job4j.calculator;
/**
 * Test.
 *
 * @author Sergo Zurabishvili (Kekelidze78@gmail.com).
 * @since 06.01.2019
 */
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CalculatorTest  {
    @Test
    public void whenAddOnePlusOneThenTwo()  {
        Calculator calc = new Calculator();
        calc.add(1, 1);
        double result = calc.getResult();
        double expected = 2;
        assertThat(result, is(expected));
    }

    /**
     * test subtract
     */
    @Test
    public void whenSubtThreeMinusOneEqualsTwo()  {
        Calculator calc = new Calculator();
        calc.add(3, 1);
        double result = calc.getResult();
        double expected = 2;
        assertThat(result, is(expected));
    }
    /**
     * test multiply
     */
    @Test
    public void whenMultThreeMultiplyTwoEqualsSix(){
        Calculator calc = new Calculator();
        calc.add(3, 2);
        double result = calc.getResult();
        double expected = 6;
        assertThat(result, is(expected));
    }

    /**
     * test divided
     */
    @Test
    public void whenDivdFourDividedTwoEqualsTwo(){
        Calculator calc = new Calculator();
        calc.add(4, 2);
        double result = calc.getResult();
        double expected = 2;
        assertThat(result, is(expected));
    }
}