package pl.yobek.integralCalculator.function;

public class IntegralRange {
	private double min, max;
	
	public IntegralRange(double range1, double range2) {
		this.min = range1 < range2 ? range1 : range2; 
		this.max = range1 > range2 ? range1 : range2; 
	}

	public double getMin() {
		return min;
	}

	public double getMax() {
		return max;
	}

}
