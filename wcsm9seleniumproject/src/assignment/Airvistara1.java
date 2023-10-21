package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Airvistara1 {
	public static void main(String[] args) {
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.airvistara.com/in/en/travel-information/vistara-exclusives/vistara-direct?gclid=EAIaIQobChMIxPGAmsm4gQMVyB8rCh269gW0EAAYASAAEgJBifD_BwE&utm_source=google&utm_medium=Search&utm_campaign=PMX_Brand_Dom_Search_Nov_22&ef_id=EAIaIQobChMIxPGAmsm4gQMVyB8rCh269gW0EAAYASAAEgJBifD_BwE:G:s&s_kwcid=AL!596!3!659805002549!p!!g!!air%2520vistara&s_kwcid=AL!596!3!659805002549!p!!g!!air+vistara&gad=1");
		driver.findElement(By.id("cookiemodalcloseBtn")).click();
		}

}
