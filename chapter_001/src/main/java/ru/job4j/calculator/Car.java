package ru.job4j.calculator;
/**
 * Calculator.
 *
 * @author Sergo Zurabishvili (Kekelidze78@gmail.com).
 * @since 04.01.2019.
 */
public class Car {
    private double volume;

    public void drive (int kilometer){
        this.volume = this.volume-kilometer;
    }
    public void full (int gas){
       this.volume = this.volume + 10 * gas;
    }
    public boolean canDrive(){
        boolean result = this.volume > 0;
        return result;
    }
    public void gasInfo(){
        System.out.println("I can drive" + this.volume + "kilometer.");
    }
}