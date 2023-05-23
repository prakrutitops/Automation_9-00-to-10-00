import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class FirstTest 
{
	
	@Test
	public void test()
	{
		assertEquals(10, 10);
		assertNotEquals(10, 10);
		assertNull(null);
		assertNotNull(10);
		assertTrue(10<20);
		
	}
	
	@Test
	public void test2()
	{
		System.out.println("running test2");
	}
}