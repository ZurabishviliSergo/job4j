package ru.job4j.array;
/**
 * @author Sergo zurabishvili (Kekelidze78@gmail.com).
 * @since 21.02.2019
 */
public class FindLoop {
    public int index(int[] data, int el) {
        int rst = -1; //если элемента нет в массиве,то возвращаем -1.
        for (int index = 0; index < data.length; index++) {
            if (data[index] == el) {
                rst = index;
                break;
            }
        }
        return rst;
    }
}