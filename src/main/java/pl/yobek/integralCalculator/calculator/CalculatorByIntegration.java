package pl.yobek.integralCalculator.calculator;

import java.util.function.Function;

import pl.yobek.integralCalculator.function.*;


public class CalculatorByIntegration implements IntegralCalculator {
	
//TODO przemyśleć funkcje calculate i zastosowanie Function, naprawić PolynomialFunctionTest

	@Override
	public double calculate(IntegrableFunction myFunction, IntegralRange range, int sections) {
		double argument;
		Function<IntegrableFunction, Double> calculatedFunction = 
				(IntegrableFunction myF) 
				-> {return (Double) myF.getValue(argument);};




	}

}
