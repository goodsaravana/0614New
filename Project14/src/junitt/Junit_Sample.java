package junitt;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Junit_Sample {

	@Before
	public void a1()
	{
		System.out.println("This is Before");
	}
	
	@After
	public  void a2()
	{
		System.out.println("This is After");
	}
	
	@Test
	public void c1()
	{
		System.out.println("This is Test 1");
	}
	
	@Test
	public void c2()
	{
		System.out.println("This is Test 2");
	}
	
	@Test
	public void c3()
	{
		System.out.println("This is Test 3");
	}
	
	
}
