

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class UndosTres {

		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub

			System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32\\chromedriver.exe");
			
		    //Invoking the browser
			WebDriver driver=new ChromeDriver();
			
			//Going to UndosTres Website
			driver.get("https://prueba.undostres.com.mx/");
			Thread.sleep(2000);
			
			
		driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[2]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[1]/div[1]/div[1]/input[1]")).click();
		
		//Selecting Telecol from Operador field
		driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[2]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[1]/div[1]/div[1]/div[1]/ul[1]/li[1]/a[1]")).click();
		
		//Giving value 5523261151 under numero de celluar field 
		driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[2]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[2]/div[1]/div[1]/input[1]")).sendKeys("5523261151");
		
		driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[2]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[3]/div[1]/div[1]/input[1]")).click();
		
		//Selecting $10 under monte de recharga field
		driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[2]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[3]/div[1]/div[1]/div[1]/ul[1]/li[1]/a[1]")).click();
		
		//Clicking on siguiente
		driver.findElement(By.xpath("//div[contains(@class,'box menuitem')]//div[3]//div[1]//button[1]")).click();
		
		//Verifying if going to next screen
		WebElement NextScreen = driver.findElement(By.xpath("/html[1]/body[1]/div[19]/div[1]/div[3]/div[1]/div[2]/div[2]/div[1]/a[2]/p[1]"));
		Assert.assertEquals(NextScreen.getText(), "Tarjeta");
		
		//Giving name as Test under card name
		driver.findElement(By.xpath("/html[1]/body[1]/div[19]/div[1]/div[3]/div[1]/div[2]/div[3]/div[2]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/input[1]")).sendKeys("Test");

		//Giving Card number:4111111111111111
		driver.findElement(By.xpath("/html[1]/body[1]/div[19]/div[1]/div[3]/div[1]/div[2]/div[3]/div[2]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[1]/form[1]/div[1]/div[2]/div[1]/div[1]/div[1]/input[1]")).sendKeys("4111111111111111");
		
       //Gving month as 11
		driver.findElement(By.xpath("/html[1]/body[1]/div[19]/div[1]/div[3]/div[1]/div[2]/div[3]/div[2]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[1]/form[1]/div[1]/div[3]/div[1]/div[1]/div[1]/input[1]")).sendKeys("11");
		
		//Giving year as 2025
		driver.findElement(By.xpath("/html[1]/body[1]/div[19]/div[1]/div[3]/div[1]/div[2]/div[3]/div[2]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[1]/form[1]/div[1]/div[3]/div[1]/div[1]/div[2]/input[1]")).sendKeys("2025");
		
		//Giving CVV as 111
		driver.findElement(By.xpath("/html[1]/body[1]/div[19]/div[1]/div[3]/div[1]/div[2]/div[3]/div[2]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[1]/form[1]/div[1]/div[3]/div[2]/div[1]/input[1]")).sendKeys("111");
		
		//Giving email id as test@test.com
		driver.findElement(By.xpath("/html[1]/body[1]/div[19]/div[1]/div[3]/div[1]/div[2]/div[3]/div[2]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[1]/form[1]/div[3]/div[1]/div[1]/input[1]")).sendKeys("test@test.com");
		
		//Clicking on pagar con tarjeta
		driver.findElement(By.xpath("/html[1]/body[1]/div[19]/div[1]/div[3]/div[1]/div[2]/div[3]/div[2]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[1]/form[1]/div[6]/div[1]")).click();
		
		}

	}


