package testbrowseropen;

import org.testng.annotations.Test;

import com.project.base.BaseTest;
import com.project.model.heelopom;

public class testtextinput extends BaseTest {
	 
	
	@Test
	public void testclick () throws InterruptedException 
	{
		heelopom stest = new heelopom(driver);
		Thread.sleep(50000);
		stest.clickonsimplebutton();
		Thread.sleep(50000);
		
		
	}

}
