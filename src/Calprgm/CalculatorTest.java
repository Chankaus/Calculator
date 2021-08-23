package Calprgm;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {//created new class
	 
	private Calccodes test; // created object for private class Calccodes
	 
	@Before  
	public void setUp() {  
	test = new Calccodes(); 
	}
	

	@Test
	public void addition1() {
	    int output = test.add(15,20);
		assertEquals(35, output); // (expected, output)
	}

	@Test
	public void addition2() {
		int output = test.add(-15,-20);
		assertEquals(-35, output);
	}
	
	@Test
	public void addition3() {
		int output = test.add(15,-20);
		assertEquals(-5, output);
	}
	
	@Test
	public void subtract1() {
		int output = test.sub(10,30);
		assertEquals(-20, output);
	}
	
	@Test
	public void subtract2() {
		int output = test.sub(-10,-30);
		assertEquals(20, output);
	}
	
	@Test
	public void subtract3() {
		int output = test.sub(10,-30);
		assertEquals(40, output);
	}
	
	@Test
	public void multiply1() {
		int output = test.mult(5, 5);
		assertEquals(25, output);
	}
	
	@Test
	public void multiply2() {
		int output =test.mult(-5, -5);
		assertEquals(25, output);
	}
	
	@Test
	public void multiply3() {
		int output = test.mult(5, -5);
		assertEquals(-25, output);
	}
	
	@Test
	public void division1() {
		int output = test.div(30, 6);
		assertEquals(5, output);
	}
	
	@Test
	public void division2() {
		int output = test.div(-30, -6);
		assertEquals(5, output);
	}
	
	@Test
	public void division3() {
		int output = test.div(-30, 6);
		assertEquals(-5, output);
	}
	
     //Using @Test annotation to create our testBy using "expected" parameter,listing it out as a parameter in @Test. , you can specify
    //the exception name our test may throw.Here Arithmetic Exception is expected
    //which will be thrown by the test if a developer uses an argument which is not permitted.
    //When you divide by zero, then you will receive java.lang.ArithmeticException.class.
  
	@Test(expected=java.lang.ArithmeticException.class)
	public void division4() {
        test.div(10, 0);
    }
}


