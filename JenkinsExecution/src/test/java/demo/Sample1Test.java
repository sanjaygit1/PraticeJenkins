package demo;

import org.testng.annotations.Test;

public class Sample1Test {

	@Test
	public void m2()
	{
		
		String BROWSER = System.getProperty("browser");
	String URL = System.getProperty("url");
		
	System.out.println("BROWSER======>"+BROWSER+"  , URL=====>"+URL);
		
	//	System.out.println(BROWSER);
	//push
	}
}
