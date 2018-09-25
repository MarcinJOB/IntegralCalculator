package pl.yobek.integralCalculator.calculator;

import java.util.List;

public class ArgumentHandler {
	private String type;
	private String min, max;
	private String numOfSteps;
	private List<Double> coefficients;
	
//	private IntegralRangeAndPrecision range;
//	private PolynomialFunction function;
	
	public ArgumentHandler() {};
	
	public double getMin() {
		return Double.parseDouble(min);
	}

	public double getMax() {
		return Double.parseDouble(max);
	}

	public int getNumOfSteps() {
		return Integer.parseInt(numOfSteps);
	}

	public List<Double> getCoefficients() {
		return coefficients;
	}

	public String getType() {
		return type;
	}
	
	
}
