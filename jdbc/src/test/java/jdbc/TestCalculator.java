package jdbc;

import static org.junit.Assert.*;

import org.junit.Test;

import com.test.Calculator;

public class TestCalculator {

	Calculator calc=new Calculator();
	
	@Test
	public void test() {
		
		assertEquals( 2, calc.add(1,1));
		//fail("Not yet implemented");
	}

}
