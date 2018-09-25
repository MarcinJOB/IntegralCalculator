package pl.yobek.integralCalculator.function;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PolynomialFunction implements IntegrableFunction {
	
	private List<Double> coefficients;
	
	public PolynomialFunction() {}
	
	public PolynomialFunction(Double...coefficients) {
		super();
		this.coefficients = new ArrayList<Double>(Arrays.asList(coefficients));
		}
	
	public PolynomialFunction(List<Double> coefficients) {
		super();
		this.coefficients = coefficients;
		}
	
	@Override
	public double getValue(double argument) {
		double value = 0;
		for (int i=0; i<coefficients.size();i++) {
			value = value + coefficients.get(i)*Math.pow(argument,i);}
		return value;
	}

	@Override
	public Function getIntegral() {
		List<Double> integralCoefficients = new ArrayList<Double>();
			integralCoefficients.add(0d);
		for (int i=0 ; i<coefficients.size() ; i++) {
			integralCoefficients.add( coefficients.get(i) / (i+1) );
		}
			return new PolynomialFunction(integralCoefficients);
	}
}

