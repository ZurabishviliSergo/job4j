package ru.job4j.calculator;
/**
 * Calculator.
 *
 * @author Sergo Zurabishvili (Kekelidze78@gmail.com).
 * @since 06.01.2019.
 */
public class Calculator {
    private double result;
    public void add(double first, double second){
        this.result = first + second;
    }
    public double getResult(){
        return this.result;
    }
}