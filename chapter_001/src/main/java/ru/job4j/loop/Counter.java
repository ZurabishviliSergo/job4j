package ru.job4j.loop;
/**
 * @author Sergo Zurabishvili (Kekelidze78@gmail.com).
 * @since 26.01.2019.
 */
public class Counter {
    /**
     * @param  start, finish.
     * @return Сумма.
     */
    public int add(int start, int finish) {
        int sum = 0;

        for (int i = start; i <= finish; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        return sum;
    }
}