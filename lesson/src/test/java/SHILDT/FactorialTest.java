package SHILDT;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class FactorialTest {

    @Test
    public void fac() {
        Factorial factorial = new Factorial();
        int fact = factorial.fact(3);
        assertThat(fact, is(6));
    }


}