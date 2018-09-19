package pl.yobek.integralCalculator.function;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class IntegralRangeTest {

	@Test
	public void testConstructor() {
		IntegralRange testRange = new IntegralRange(10.5 , 22.22);
		assertNotNull(testRange);
		assertTrue(testRange.getMin()<testRange.getMax());
	}

}
