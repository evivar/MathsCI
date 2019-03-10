import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class MathsTest {

	Maths maths;
	int a;
	int b;
	int c;
	int d;

	@Before
	public void setUp() {
		maths = new Maths();
	}

	@Test
	public void testSuma() {

		// Given
		a = 0;
		b = 0;
		c = 1;
		d = 2;

		// When
		int result0 = maths.suma(a, b);
		int result1 = maths.suma(a, c);
		int result2 = maths.suma(d, b);
		int result3 = maths.suma(c, d);

		// Then
		assertEquals(0, result0);
		assertEquals(1, result1);
		assertEquals(2, result2);
		assertEquals(3, result3);

	}

	@Test
	public void testResta() {

		// Given
		a = 0;
		b = 0;
		c = 1;
		d = 2;

		// When
		int result0 = maths.resta(a, b);
		int result1_1 = maths.resta(c, a);
		int result1_2 = maths.resta(d, c);
		int result2 = maths.resta(d, b);

		// Then
		assertEquals(0, result0);
		assertEquals(1, result1_1);
		assertEquals(1, result1_2);
		assertEquals(2, result2);

	}

}
