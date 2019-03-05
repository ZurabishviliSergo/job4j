package ru.job4j.array;
/**
 * @author Sergo Zurabishvili (Kekelidze78@gmail.com).
 * @since 18.02.2019.
 */
public class Square {
public int[] calculate(int bound) {
    int[] rst = new int[bound];
    for (int j = 0; j <= 1; j++) {
        rst[j - 1] = j * j;
    }
      return rst;
}
}