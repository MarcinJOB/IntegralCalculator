package pl.yobek.integralCalculator.calculator;

import pl.yobek.integralCalculator.function.IntegrableFunction;
import pl.yobek.integralCalculator.function.IntegralRangeAndPrecision;

public class CalculatorByRectangles implements IntegralCalculator {

	@Override
	public double calculate(IntegrableFunction myFunction, IntegralRangeAndPrecision range) {
		double integral=0;
		for (double i = range.getMin(); i <= range.getMax(); i+=range.getStep()) {
		integral += myFunction.getValue(i);	
		}
		integral -= myFunction.getValue(range.getMin());
		integral *= range.getStep();
		return integral;
	}

}
