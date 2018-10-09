package ru.job.massives;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class BubbleSortTest {

    @Test
    public void sort() {
        BubbleSort bubbleSort = new BubbleSort();
        int[] arr = bubbleSort.sort(new int[]{2, 5, 3, 1});
        assertThat(arr, is(new int[]{1, 2, 3, 5}));
    }
}