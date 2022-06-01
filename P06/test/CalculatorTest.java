import static org.junit.jupiter.api.Assertions.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;

class CalculatorTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
	}

	@Before
	public void setUp() throws Exception {
		
	}

	@Test
	public void testAdd() {
		int a = 4321;
		int b = 1234;
			
		Calculator cal = new Calculator();
		int actual = cal.add(a, b); 
			 
		int expected = 5555;
		assertEquals (expected, actual);
	}
	
	@Test
	public void testSubtract() {
		int a = 10;
		int b = 2;
			
		Calculator cal = new Calculator();
		int actual = cal.subtract(a, b); 
			 
		int expected = 8;
		assertEquals (expected, actual);
	}

	@Test
	public void testMultiply() {
		int a = 10;
		int b = 2;
			
		Calculator cal = new Calculator();
		int actual = cal.multiply(a, b); 
			 
		int expected = 20;
		assertEquals (expected, actual);
	}
	
	@Test
	public void testDivide() {
		int a = 10;
		int b = 2;
			
		Calculator cal = new Calculator();
		int actual = cal.divide(a, b); 
			 
		int expected = 5;
		assertEquals (expected, actual);
	}
	
	@Test
	public void testDivideBy0() {
		int a = 10;
		int b = 0;
			
		try {			
			Calculator cal = new Calculator();
			cal.divide(a, b); 
			fail("Expected an IllegalArgumentException to be thrown");
		}
		catch(IllegalArgumentException e) {
			assertEquals("Division by zero is not supported", e.getMessage());
		}
		catch(Throwable t) {
			assertEquals("Expected an IllegalArgumentException to be thrown", t.getMessage());
		}
	}
	
	@After
	public void tearDown1() throws Exception {
		
	}
	
	@AfterClass
	static void tearDownAfterClass() throws Exception{
		
	}

}
