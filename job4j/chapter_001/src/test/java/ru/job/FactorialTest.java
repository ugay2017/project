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
public class FactorialTest {
    /**
     * Test calc.
     */
    @Test
    public void calc() {
        Factorial factorial = new Factorial();
        int result = factorial.calc(3);
        assertThat(result, is(6));
    }
}