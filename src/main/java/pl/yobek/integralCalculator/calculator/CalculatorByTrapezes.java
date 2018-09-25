package pl.yobek.integralCalculator.calculator;

import org.springframework.stereotype.Service;

import pl.yobek.integralCalculator.function.Function;
import pl.yobek.integralCalculator.function.IntegralRangeAndPrecision;

@Service
public class CalculatorByTrapezes implements IntegralCalculator<Function> {

	@Override
	public double calculate(Function myFunction, IntegralRangeAndPrecision range) {
		double integral=0;
		for (double i = range.getMin(); i <= range.getMax(); i+=range.getStep()) {
		integral += myFunction.getValue(i);	
		}
		integral -= (myFunction.getValue(range.getMin()) + myFunction.getValue(range.getMax()))/2;
		integral *= range.getStep();
		return integral;
	}

}
