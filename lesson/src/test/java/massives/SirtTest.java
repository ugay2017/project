package massives;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class SirtTest {

    @org.junit.Test
    public void selectionSort() {
        Sirt sirt = new Sirt();
        int[] array = new int[]{2, 5, 3, 1};
        assertThat(new int[]{1, 2, 3, 5}, is(sirt.selectionSort(array)));
    }
}