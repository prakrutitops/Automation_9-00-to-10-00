import org.junit.Test;

import junit.framework.Assert;

public class Junit_Assertion 
{
	@Test
	public void test()
	{
		int a=5,b=6,c=5;
		
		int[] a1= {1,2,3};
		
		int[] b1= {1,2,3,5};

		String s1=null,s2="Tops";
		
		//Assert.assertTrue(a<b);
		//Assert.assertTrue(a>b);
		//Assert.assertFalse(a<b);
		//Assert.assertFalse(a>b);
		
		//Assert.assertNull(s1);
		//Assert.assertNull(s2);
		//Assert.assertNotNull(s2);
		//Assert.assertNotNull(s1);
		
		
		//Assert.assertSame(a, c);//byte
		//Assert.assertNotSame(a, b);
		
		//Assert.assertEquals(a, c);//value
		//Assert.assertNotEquals(a, b);
		
		Assert.assertEquals(a1, b1);
	}
}
