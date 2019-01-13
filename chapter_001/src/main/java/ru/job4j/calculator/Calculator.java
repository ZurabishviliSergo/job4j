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

    /**
     * method subtract
     * @param first
     * @param second
     */
    public void subt(double first, double second) {
        this.result = first - second;
    }
    public double subt() {
        return this.result;
    }
    /**
     * method multiply
     */
    public void mult(double first, double second) {
        this.result = first * second;
    }
    public double mult() {
        return this.result;
    }
    /**
     * method divided
     */
    public void divd(double first, double second){
        this.result = first / second;
    }
    public double divd(){
        return this.result;
    }

}