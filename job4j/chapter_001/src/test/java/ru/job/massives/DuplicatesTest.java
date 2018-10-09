package ru.job.massives;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class DuplicatesTest {

    @Test
    public void removeDuplicates() {
        Duplicates duplicates = new Duplicates();
        String[] originArray = new String[]{"text", "message", "text", "message"};
        String[] expectedArray = new String[]{"text", "message"};
        assertThat(duplicates.removeDuplicates(originArray), is(expectedArray));
    }
}