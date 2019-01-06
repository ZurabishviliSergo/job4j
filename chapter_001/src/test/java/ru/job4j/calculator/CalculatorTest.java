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
        calc.add(1D, 1D);
        double result = calc.getResult();
        double expected = 2D;
        assertThat(result, is(expected));
    }

    /**
     * test subtract
     */
    @Test
    public void whenAddThreeMinusOneEqualsTwo()  {
        Calculator calc = new Calculator();
        calc.add(3D, 1D);
        double result = calc.getResult();
        double expected = 2D;
        assertThat(result, is(expected));
    }
    /**
     * test multiply
     */
    @Test
    public void whenAddThreeMultiplyTwoEqualsSix(){
        Calculator calc =new Calculator();
        calc.add(3D, 2D);
        double result = calc.getResult();
        double expected = 6D;
        assertThat(result, is(expected));
    }

    /**
     * test divided
     */
    @Test
    public void whenAddFourDividedTwoEqualsTwo(){
        Calculator calc = new Calculator();
        calc.add(4D, 2D);
        double result = calc.getResult();
        double expected = 2D;
        assertThat(result, is(expected));
    }
}