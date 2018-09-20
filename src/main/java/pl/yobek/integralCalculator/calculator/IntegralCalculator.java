package pl.yobek.integralCalculator.calculator;

import pl.yobek.integralCalculator.function.*;


public interface IntegralCalculator {
	
	public double calculate(IntegrableFunction myFunction, IntegralRangeAndPrecision range);
}
