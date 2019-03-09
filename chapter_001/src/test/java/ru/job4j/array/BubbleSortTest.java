package ru.job4j.array;

import org.junit.Test;
import  static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class BubbleSortTest {
    @Test
    public void whenSortArrayWithTenElementsThenSortedArray() {
        BubbleSort bs = new BubbleSort();
        int[] arr = {9, 5, 4, 2, 3, 1, 7, 8, 0, 5};
        int[] result = bs.sort(arr);
        int[] expect = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        assertThat(result, is(expect));
    }
}