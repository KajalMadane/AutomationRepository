package methodsOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethod {
	public static void main(String[] args) throws InterruptedException {
		//launch the chrome browser
		WebDriver driver=new ChromeDriver();
	    //maximize the browser
	   driver.manage().window().maximize();
		//launch the webapplication
		driver.get("https://www.primevideo.com/region/eu/offers/nonprimehomepage/ref=atv_me_RentBuymkw4mEHKPKZdc_c_9zZ8D2_hm_hom");
		//stop the execution for 2 sec
		Thread.sleep(2000);
		//close the browser
		driver.close();
		
	}

	
}
