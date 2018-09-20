package pl.yobek.integralCalculator.calculator;

import pl.yobek.integralCalculator.function.IntegrableFunction;
import pl.yobek.integralCalculator.function.IntegralRangeAndPrecision;

public class CalculatorByTrapezes implements IntegralCalculator {

	@Override
	public double calculate(IntegrableFunction myFunction, IntegralRangeAndPrecision range) {
		double integral=0;
		for (double i = range.getMin(); i <= range.getMax(); i+=range.getStep()) {
		integral += myFunction.getValue(i);	
		}
		integral -= (myFunction.getValue(range.getMin()) + myFunction.getValue(range.getMax()))/2;
		integral *= range.getStep();
		return integral;
	}

}
