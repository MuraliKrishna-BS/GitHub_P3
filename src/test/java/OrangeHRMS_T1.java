import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class OrangeHRMS_T1 {
	
	@Test
	public void Lunchurl() {
		
		ChromeOptions op = new ChromeOptions();
		op.addArguments("--Start-Maximized");
		op.setExperimentalOption("excludeSwitches", new String[] {"enable-automation"});
		ChromeDriver Driver= new ChromeDriver(op);

		Driver.get("https://www.google.com");

		Driver.close();
	}
	
	

}
