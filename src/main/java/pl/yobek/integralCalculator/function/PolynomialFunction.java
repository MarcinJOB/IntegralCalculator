package pl.yobek.integralCalculator.function;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PolynomialFunction implements IntegrableFunction {
	
	private List<Double> coefficients;
	
	public PolynomialFunction(Double...args) {
		coefficients = new ArrayList<Double>(Arrays.asList(args));
		}
	
	public double getValue(double argument) {
		double value = 0;
		for (int i=0; i<coefficients.size();i++) {
			value = value + coefficients.get(i)*Math.pow(argument,i);}
		return value;
	}
	public double getIntegral(double argument) {
		double value = 0;
		for (int i=0; i<coefficients.size();i++) {
			value = value + (coefficients.get(i))/(i+1) * Math.pow(argument,(i+1));
			}
		return value;
	}
}

