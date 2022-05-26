package automationtest.selenium.maven;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


public class Apptest {

	public static void main(String[] args) {

		String chromepath = System.getProperty("user.dir")+"\\resources\\ChromeDriver.exe";
		System.setProperty( "webdriver.chrome.driver",chromepath);
		ChromeDriver driver = new ChromeDriver();
		driver.navigate().to("http://automationpractice.com/index.php");
		driver.manage().window().maximize();

        	driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"email_create\"]")).sendKeys("esraa.mohamed10@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"SubmitCreate\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"id_gender2\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"customer_firstname\"]")).sendKeys("Esraa");
		driver.findElement(By.xpath("//*[@id=\"customer_lastname\"]")).sendKeys("Mohamed");
		driver.findElement(By.xpath("//*[@id=\"passwd\"]")).sendKeys("12345678");
		driver.findElement(By.xpath("//*[@id=\\\\\\\"days\\\\\\\"]")).click();
		driver.findElement(By.xpath("//*[@id=\\\"months\\\"]")).click();
		driver.findElement(By.xpath("//*[@id=\\\"years\\\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"newsletter\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"address1\"]")).sendKeys("10-shamblion");
		driver.findElement(By.xpath("//*[@id=\"address2\"]")).sendKeys("Tahrir-Square");
		driver.findElement(By.xpath("//*[@id=\"city\"]")).sendKeys("Cairo");
		driver.findElement(By.xpath("//*[@id=\"postcode\"]")).sendKeys("11540");
		driver.findElement(By.xpath("//*[@id=\\\"id_country\\\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"phone\"]")).sendKeys("0125436957");
		driver.findElement(By.xpath("//*[@id=\"phone_mobile\"]")).sendKeys("0151245523");
		driver.findElement(By.xpath("//*[@id=\"alias\"]")).sendKeys("alias");
		driver.findElement(By.xpath("//*[@id=\"submitAccount\"]")).submit();
		driver.findElement(By.xpath("//*[@id=\\\"block_top_menu\\\"]/ul/li[1]")).click(); 
		driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[1]/ul/li[1]/ul/li[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"group_1\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"group_1\"]/option[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"color_8\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"product\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"add_to_cart\"]/button")).submit();
		driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"center_column\"]/p[2]/a[1]")).click();

		driver.quit();
	
	}
	
}	
		
								//Create a new account user by mail
								//Registration steps for create a new account
								//Cart Checkout steps
								//1-Select “Blouses” Subcategory in “Women” Category
						        	//2-check box of size 
						       		//3-select size M
								//4-1check box of color white
								//5-resulted white product
								//6-Follow checkout procedure
								//8-Confirm order by selecting bank wire option


		
		
		
	



