package pl.yobek.integralCalculator.function;

public class IntegralRangeAndPrecision {
	private double min, max, step;
	
	public IntegralRangeAndPrecision(double range1, double range2, int sections) {
		this.min = range1 < range2 ? range1 : range2; 
		this.max = range1 > range2 ? range1 : range2; 
		this.step = (this.max - this.min) / sections;
		
	}

	public double getMin() {
		return min;
	}

	public double getMax() {
		return max;
	}

	public double getStep() {
		return step;
	}
}
