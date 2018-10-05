package ru.job;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 * Test.
 *
 * @author Ugay Stas (ugay8010@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class CalculateTest {
	  /**
     * Test ThreeStops.
     */
	@Test
	public void whenSetStopInEchoThenReturnThreeStops() {
		Calculate calc = new Calculate();
		String result = calc.echo("stop");
		assertThat(result, is("stop stop stop"));
	}
	 /**
     * Test ThreeNull
     */
	@Test
	public void whenSetNullInEchoThenReturnThreeNull() {
		Calculate calc = new Calculate();
		String result = calc.echo(null);
		assertThat(result, is("null null null"));
	}
}
	