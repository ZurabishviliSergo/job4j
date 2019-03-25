package ru.job4j.array;


import org.junit.Test;
import static org.hamcrest.collection.IsArrayContainingInAnyOrder.arrayContainingInAnyOrder;
import static org.junit.Assert.*;


public class ArrayDuplicateTest {
    @Test
    public void whenRemoveDublcatesThenArrayWithoutDublicate() {
        //тест проверяющий удаление дубликатов строк из массивва строк
        String[] input = {"Привет", "Мир", "Привет", "Супер", "Мир"};
        String[] expect = {"Привет", "Мир", "Супер"};
        ArrayDuplicate duplicate = new ArrayDuplicate();
        String[] result = duplicate.remove(input);
        assertThat(result, arrayContainingInAnyOrder(expect));
    }
}