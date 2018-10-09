package ru.job;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class MaxTest {

    @Test
    public void maxTwo() {
        Max max = new Max();
        int result = max.maxTwo(2, 3);
        assertThat(result, is(3));
    }

    @Test
    public void maxThree() {
        Max max = new Max();
        int result = max.maxThree(4, 3, 1);
        assertThat(result, is(4));
    }
}