package pl.yobek.integralCalculator.function;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


//@RunWith(SpringRunner.class)
//@SpringBootTest
public class PolynomialFunctionTest {

	@Test
	public void testConstructorWithZeroArguments() {
		PolynomialFunction testFunction = new PolynomialFunction();
		assertEquals(0d, testFunction.getValue(2), 0.001);
		assertEquals(0d, testFunction.getIntegral().getValue(1), 0.001);
	}
	
	@Test
	public void testConstructorWithThreeArguments() {
		PolynomialFunction testFunction = new PolynomialFunction(3.0, 1.0, 2.0);
		assertEquals(13d, testFunction.getValue(2), 0.001);
		assertEquals(110.833, testFunction.getIntegral().getValue(5), 0.001);
	}
	
	@Test
	public void testConstructorWithManyArguments() {
		PolynomialFunction testFunction = new PolynomialFunction(
				0.0, 1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7, 8.8, 9.9);
		assertEquals(49.5, testFunction.getValue(1), 0.001);
	}
	

}
