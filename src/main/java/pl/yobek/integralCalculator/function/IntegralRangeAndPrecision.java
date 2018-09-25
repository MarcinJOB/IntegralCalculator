package pl.yobek.integralCalculator.function;

public class IntegralRangeAndPrecision {
	private double min, max, numOfSteps;
	
	public IntegralRangeAndPrecision() {}
	
	public IntegralRangeAndPrecision(double range1, double range2, int numOfSteps) {
		super();
		this.min = range1 < range2 ? range1 : range2; 
		this.max = range1 > range2 ? range1 : range2; 
		this.numOfSteps = numOfSteps;	
	}

	public double getMin() {
		return min;
	}

	public double getMax() {
		return max;
	}

	public double getStep() {
		return (this.max - this.min) / numOfSteps;
	}
}
