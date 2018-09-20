package pl.yobek.integralCalculator.calculator;

import pl.yobek.integralCalculator.function.*;


public class CalculatorByIntegration implements IntegralCalculator {
	
//TODO przemyśleć funkcje calculate i zastosowanie Function, naprawić PolynomialFunctionTest

// "sections" parameters is ignored in this method, it's not needed in calculations by Integration	
	@Override
	public double calculate(IntegrableFunction myFunction, IntegralRangeAndPrecision range) {
		return ( myFunction.getIntegral(range.getMax()) - myFunction.getIntegral(range.getMin()) ); 
	}

}
