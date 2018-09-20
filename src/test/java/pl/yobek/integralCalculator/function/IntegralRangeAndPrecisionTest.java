package pl.yobek.integralCalculator.function;

import static org.junit.Assert.*;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

//@RunWith(SpringRunner.class)
//@SpringBootTest
public class IntegralRangeAndPrecisionTest {

	@Test
	public void testConstructor() {
		IntegralRangeAndPrecision testRange = new IntegralRangeAndPrecision(11.1 , 22.2, 100 );
		assertTrue(testRange.getMin()<testRange.getMax());
		assertEquals(0.111, testRange.getStep(), 0.0001);
	}

}
