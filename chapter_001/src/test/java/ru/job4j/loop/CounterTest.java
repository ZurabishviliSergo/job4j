package ru.job4j.loop;
/**
 * Test
 * @author Sergo Zurabishvili ( Kekelidze78@gmail.com ).
 * @since 23.01.2019.
 */
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;



public class CounterTest {
    /**
     * Test Counter.
     */
    @Test
    public void countTester() {
        int start = 1;
        int finish = 10;
        Counter count = new Counter();
        int result = count.add(start, finish);
        assertThat(result, is(30));
    }
}