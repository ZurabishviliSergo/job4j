package ru.job4j.max;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 * @author Sergo Zurabishvili (Kekelidze78@gmail.com).
 * @since 20.01.2019.
 */
public class MaxTest {
    /**
     * Test
     */
    public void maxTes() {
        int first = 2;
        int second = 1;
        Max maxm = new Max();
        int result = maxm.max(first, second);
        assertThat(result, is(first));
    }
}