package pl.yobek.integralCalculator.calculator;

import java.net.Proxy.Type;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import pl.yobek.integralCalculator.function.Function;
import pl.yobek.integralCalculator.function.IntegralRangeAndPrecision;
import pl.yobek.integralCalculator.function.PolynomialFunction;

@RestController	
public class CalculatorController {
	
	IntegralCalculator calculator = new CalculatorByIntegration();
	
	
	Map<IntegrationType, IntegralCalculator> integrationStrategy = new HashMap<>();
	
	
	//TODO: move to spring config
	
	CalculatorController(){
		integrationStrategy.put(IntegrationType.RECTANGLES, new CalculatorByRectangles());
		integrationStrategy.put(IntegrationType.TRAPEZES, new CalculatorByTrapezes());
		integrationStrategy.put(IntegrationType.INTEGRAL, new CalculatorByIntegration());
	}
	
	// JSON version
	// working and gives 112.5 as a result in Postman with example:
	// http://localhost:8080/calculatePolynomialJSON
	// JSON body:
	// { "type": "TRAPEZES", "min": "0.0", "max": "5.0", "numOfSteps": "5", "coefficients": [3.0, 1.0, 2.0] }
	@RequestMapping(method=RequestMethod.POST,value="/calculatePolynomialJSON", consumes = "application/json")	
	public double calculate2( @RequestBody ArgumentHandler handler)
	{
		IntegrationType type = IntegrationType.valueOf(handler.getType());
		PolynomialFunction function = new PolynomialFunction(handler.getCoefficients());
		IntegralRangeAndPrecision range =  new IntegralRangeAndPrecision(
				handler.getMin(), 
				handler.getMax(), 
				handler.getNumOfSteps());
		
		return integrationStrategy.get(type).calculate(function, range);
	}
	
	// dirty version
	// working and gives 140 as a result in Postman with example:
	// http://localhost:8080/calculatePolynomial?type=RECTANGLES&xMin=0.0&xMax=5.0&xSections=5&coeff=3.0&coeff=1.0&coeff=2.0
	
	@RequestMapping(value="/calculatePolynomial", method=RequestMethod.POST)	
	public double calculatePolynomial(
			@RequestParam(value="type") final IntegrationType type,
			@RequestParam(value="xMin") final Double xMin,
			@RequestParam(value="xMax") final Double xMax,
			@RequestParam(value="xSections") final Integer xSections,
			@RequestParam(value="coeff") final List<Double> coefficients)
	{
		return integrationStrategy.get(type).calculate(
				new PolynomialFunction(coefficients), 
				new IntegralRangeAndPrecision(xMin, xMax,xSections));
	}


}
