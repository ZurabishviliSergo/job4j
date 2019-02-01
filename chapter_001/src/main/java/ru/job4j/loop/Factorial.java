package ru.job4j.loop;

/**
 * @author Sergo Zurabishvili (Kekelidze78@gmail.com).
 * @since 31.01.2019.
 */
public class Factorial {
    public int calc(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }

        return result;
    }
}