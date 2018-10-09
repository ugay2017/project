package ru.job;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;
/**
 * Test.
 *
 * @author Ugay Stas (ugay8010@gmail.com)
 * @version $Id$
 * @since 0.1 а
 */
public class CounterTest {
    /**
     * Test add.
     */
    @Test
    public void add() {
        Counter counter = new Counter();
        int result = counter.add(2, 5);
        assertThat(result, is(6));
    }
}