package org.selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable2 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.navigate().to("https://money.rediff.com/gainers/bse/daily/groupa?src=gain_lose");
		
		

//		List<WebElement> tableHeaderRowSize = driver.findElements(By.xpath("/html/body/div[2]/div[4]/table/thead/tr"));
//		int tableHeaderRowSize1 = tableHeaderRowSize.size();
//		System.out.println(tableHeaderRowSize1);
		
//		for(int i=0; i<=tableHeaderRowSize1; i++) {
//		
//			List<WebElement> tableHeaderColumnSize = driver.findElements(By.xpath("/html/body/div[2]/div[4]/table/thead/tr["+i+"]/th"));
//			int tableHeaderColumnSize1 = tableHeaderColumnSize.size();
//			for(int j=0; j<=tableHeaderColumnSize1; j++) {
//				String text = driver.findElement(By.xpath("/html/body/div[2]/div[4]/table/thead/tr["+i+"]/th["+j+"]")).getText();
//				System.out.print(text+"|");
//				
//			}
	//	}
		
		
	}
}
