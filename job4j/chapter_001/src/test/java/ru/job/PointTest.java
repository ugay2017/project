package ru.job;

import org.junit.Test;

import static org.hamcrest.number.IsCloseTo.closeTo;
import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void distanceTo() {
        Point pointA = new Point(1.0, 1.0);
        Point pointB = new Point(1.0, 5.0);
        assertThat(pointA.distanceTo(pointB), closeTo(pointA.distanceTo(pointB), 4.0));
    }
}