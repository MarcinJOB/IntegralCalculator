package pl.yobek.integralCalculator.calculator;

import static org.junit.Assert.*;

import org.junit.Test;

import pl.yobek.integralCalculator.function.IntegrableFunction;
import pl.yobek.integralCalculator.function.IntegralRangeAndPrecision;
import pl.yobek.integralCalculator.function.PolynomialFunction;

public class CalculatorByIntegrationTest {

	@Test
	public void testCalculate() {
		IntegrableFunction testFunction = new PolynomialFunction(3.0, 1.0, 2.0);
		IntegralRangeAndPrecision testRange = new IntegralRangeAndPrecision(0.0, 5.0, 5);
		IntegralCalculator testCalculator = new CalculatorByIntegration();
		assertEquals(110.833, testCalculator.calculate(testFunction, testRange) ,0.001 );
	}

}
