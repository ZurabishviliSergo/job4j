package ru.job4j.converter;
/**
 * Converter
 * @author Sergo Zurabishvili (Kekelidze78@gmail.com)
 * @since 13.01.2019
 *
 */
public class Converter {
    public double result;
    /**
     * Конвертируем рубли в евро.
     * @param value рубли.
     * @return Евро.
     */
    public int rubleToEuro(int value) {
        return value / 77;
    }

    /**
     * Конвертируем рубли в доллары.
     * @param value рубли.
     * @return Доллары.
     */
    public int rubleToDollar(int value) {
        return value / 69;
    }
    /**
     * Конвертируем евро в рубли.
     * @param value Евро.
     * @return рубли.
     */
    public int euroToRuble(int value) {
        return value * 77;
    }
    /**
     * Конвертируем доллары в рубли.
     * @param value Доллары.
     * @return рубли.
     */
    public int dollarToRuble(int value) {
        return value * 69;
    }
}
