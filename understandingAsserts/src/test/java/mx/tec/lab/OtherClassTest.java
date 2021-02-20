package mx.tec.lab;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class OtherClassTest {
	
	OtherClass oc = new OtherClass();

	
	@Test
	public void testMultiply() {
		//fail("Not yet implemented");
		int expected = 15;
		int actual = oc.multiply(3, 5);
		assertEquals(expected, actual, "Failure - multiplication does not give the correct answer.");
		
	}

	@Test
	public void testMultiply_ExceptionIsThrown() {
		//fail("Not yet implemented");
		try {
			oc.multiply(3000,5);
			fail("Exception not thrown");

		}
		catch(IllegalArgumentException e) {
			assertEquals("X should be less than 1000", e.getMessage());
			
		}
	
	}

}
