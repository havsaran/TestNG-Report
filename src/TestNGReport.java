
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class TestNGReport {
	
	public static String text;

	static final long watingTime = 500;
	WebDriver driver;
	
	  @Test
  public void f() throws InterruptedException {
	  
	  
	  		
			 System.setProperty("webdriver.chrome.driver", "C:\\Files needed for Testing Automation\\chromedriver_win32\\chromedriver.exe");
			 ChromeOptions options = new ChromeOptions(); 
			 options.addArguments("disable-infobars"); 
			 driver = new ChromeDriver(options);
				
				driver.get("https://sumo.tv2.no/tac/");
				driver.manage().window().maximize();
				Thread.sleep(1000);
				
				
				 text = driver.findElement(By.xpath("//h1[@class='page__title container']")).getText();
				System.out.println(text);
							
//				
//				driver.get("https://sumo.tv2.no/");
//				driver.manage().window().maximize();
			driver.findElement(By.xpath("//span[contains(text(),'Meny')]")).click();
			Thread.sleep(watingTime);
				driver.findElement(By.xpath("//span[contains(text(),'Søk')]")).click();
				Thread.sleep(watingTime);
				driver.findElement(By.xpath("//span[contains(text(),'Søk')]")).click();
				Thread.sleep(watingTime);
//				driver.findElement(By.xpath("//span[contains(text(),'Få tilgang')]")).click();
//				driver.findElement(By.xpath("//div[@class='commercial-page__category commercial-page__category--sport']//a[@class='button2 button--secondary']")).click();
					
				Thread.sleep(watingTime);
				
			driver.quit();	
			}
			
  }

