package pl.yobek.integralCalculator.calculator;

import org.springframework.stereotype.Service;

import pl.yobek.integralCalculator.function.*;

@Service
public class CalculatorByIntegration implements IntegralCalculator<IntegrableFunction> {

	@Override
	public double calculate(IntegrableFunction myFunction, IntegralRangeAndPrecision range) {
		Function integral = myFunction.getIntegral();
		return ( integral.getValue(range.getMax()) - integral.getValue(range.getMin()) ); 
	}
}
