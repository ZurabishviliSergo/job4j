package ru.job4j.max;

/**
 * @author Sergo Zurabishvili (Kekelidze78@gmail.com).
 * @since 20.01.2019.
 */
public class Max {
    /**
     * @param first , second
     * @return Сумма
     */
    public int max(int first, int second) {
        return first > second ? first : second;
    }
    //Максимум из трех чисел
    public int max(int first, int second, int third) {
        return this.max(this.max(first, second), third);
    }
}