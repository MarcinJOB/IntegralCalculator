package pl.yobek.integralCalculator.calculator;

import pl.yobek.integralCalculator.function.*;


public interface IntegralCalculator<F extends Function> {
	public double calculate(F function, IntegralRangeAndPrecision range);
}
