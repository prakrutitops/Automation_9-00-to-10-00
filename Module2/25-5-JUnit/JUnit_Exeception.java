import org.junit.Before;
import org.junit.Test;

public class JUnit_Exeception 
{
	Arithmetic a = null;
	
	@Before
	public void before()
	{
		a = new Arithmetic();
	}
	
	
	@Test
	public void test()
	{
		a.division(10, 0);
	}
	
}
