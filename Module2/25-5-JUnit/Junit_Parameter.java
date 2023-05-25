import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import junit.framework.Assert;

@RunWith(Parameterized.class)
public class Junit_Parameter 
{
	
	Addition a1=null;
	
	int fno,sno,eno;
	
	
	public Junit_Parameter(int fno, int sno, int eno)
	{
		this.fno=fno;
		this.sno=sno;
		this.eno=eno;
	}
	
	@Before
	public void before()
	{
		a1=new Addition();
	}
	
	@Parameterized.Parameters
	public static Collection input()
	{
		return Arrays.asList(new Object[][] {{1,2,3} ,{5,6,12}});
	}
	@Test
	public void test()
	{
		System.out.println("Your Expected Value is... "+eno);
		Assert.assertEquals(eno, a1.sum(fno, sno));
	
	
	}
	
	
	
}
