package atcTest;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;



public class atcTest {
	WebDriver driver;

	public void invokeBrowser() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"D:\\Gaurav\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.get("http://automationpractice.com/index.php");
		loginAndContinue();

	}
	
	public void loginAndContinue() throws InterruptedException{
		
		//Login
		driver.findElement(By.xpath(".//*[@id='header']/div[2]/div/div/nav/div[1]/a")).click();
		driver.findElement(By.xpath(".//*[@id='email']")).sendKeys("gauravtest@gmail.com");
		driver.findElement(By.xpath(".//*[@id='passwd']")).sendKeys("Abcd3@");
		driver.findElement(By.xpath(".//*[@id='SubmitLogin']")).click();
		
		//navigating to my address		
		driver.findElement(By.xpath(".//*[@id='center_column']/div/div[1]/ul/li[3]/a/span")).click();
				
		//adding a new address
		driver.findElement(By.xpath(".//*[@id='center_column']/div[2]/a/span")).click();
		driver.findElement(By.xpath(".//*[@id='address1']")).sendKeys("d604 Sanskriti arcade");
		driver.findElement(By.xpath(".//*[@id='city']")).sendKeys("Pune");
		
		WebElement state_dropdown=driver.findElement(By.xpath(".//*[@id='id_state']"));
		Select state_dd=new Select(state_dropdown);
		state_dd.selectByIndex(1);
		
		driver.findElement(By.xpath(".//*[@id='postcode']")).sendKeys("56700");
		driver.findElement(By.xpath(".//*[@id='phone']")).sendKeys("1234567892");
		driver.findElement(By.xpath(".//*[@id='phone_mobile']")).sendKeys("1234567890");
		driver.findElement(By.xpath(".//*[@id='alias']")).clear();
		driver.findElement(By.xpath(".//*[@id='alias']")).sendKeys("homes1");
		driver.findElement(By.xpath(".//*[@id='submitAddress']")).click();
				
		
		//navigation to women-->summer dresses
		WebElement women=driver.findElement(By.xpath(".//*[@id='block_top_menu']/ul/li[1]/a"));		
		WebElement summer_dresses=driver.findElement(By.xpath(".//*[@id='block_top_menu']/ul/li[1]/ul/li[2]/ul/li[3]/a"));
		
		
		Actions action = new Actions(driver);
		action.moveToElement(new WebDriverWait(driver, 20).until(ExpectedConditions.visibilityOf(women))).perform();
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(summer_dresses)).click();
		
		
		//changing from grid to list
		
		driver.findElement(By.xpath(".//*[@id='list']/a/i")).click();
		
		//selecting first item to view
		
		driver.findElement(By.xpath(".//*[@id='center_column']/ul/li[1]/div/div/div[2]/h5/a")).click();
		
		//increasing quantity to 5
		driver.findElement(By.xpath(".//*[@id='quantity_wanted']")).clear();
		driver.findElement(By.xpath(".//*[@id='quantity_wanted']")).sendKeys("5");
		
		//changing the size to L
		WebElement size_dropdown=driver.findElement(By.xpath(".//*[@id='group_1']"));
		Select size_dd=new Select(size_dropdown);
		size_dd.selectByVisibleText("L");
		
		//selecting orange color
		driver.findElement(By.xpath(".//*[@id='color_13']")).click();
		
		//adding to cart
		driver.findElement(By.xpath(".//*[@id='add_to_cart']/button")).click();
		
		//continue shopping	
		
		WebDriverWait wait = new WebDriverWait(driver,30);
		WebElement e = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='layer_cart']/div[1]/div[2]/div[4]/span/span")));
		driver.findElement(By.xpath(".//*[@id='layer_cart']/div[1]/div[2]/div[4]/span/span")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//*[@id='columns']/div[1]/a[4]")).click();
		
		
		
		//second item
		//selecting second item to view	
		 
				driver.findElement(By.xpath(".//*[@id='center_column']/ul/li[2]/div/div/div[2]/h5/a")).click();
				
				//increasing quantity to 5
				driver.findElement(By.xpath(".//*[@id='quantity_wanted']")).clear();
				driver.findElement(By.xpath(".//*[@id='quantity_wanted']")).sendKeys("5");
				
				//changing the size to L
				WebElement size_dropdown2=driver.findElement(By.xpath(".//*[@id='group_1']"));
				Select size_dd2=new Select(size_dropdown2);
				size_dd2.selectByVisibleText("L");
				
				//selecting orange color
				driver.findElement(By.xpath(".//*[@id='color_8']")).click();
				
				//adding to cart
				driver.findElement(By.xpath(".//*[@id='add_to_cart']/button")).click();
				
				//continue shopping
				
				
				WebDriverWait wait2 = new WebDriverWait(driver,30);
				WebElement e2 = wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='layer_cart']/div[1]/div[2]/div[4]/span/span")));
				driver.findElement(By.xpath(".//*[@id='layer_cart']/div[1]/div[2]/div[4]/span/span")).click();
				Thread.sleep(3000);
				driver.findElement(By.xpath(".//*[@id='columns']/div[1]/a[4]")).click();
				
				
				
				//third item
				//selecting third item to view		
						driver.findElement(By.xpath(".//*[@id='center_column']/ul/li[3]/div/div/div[2]/h5/a")).click();
						
						//increasing quantity to 5
						driver.findElement(By.xpath(".//*[@id='quantity_wanted']")).clear();
						
						driver.findElement(By.xpath(".//*[@id='quantity_wanted']")).sendKeys("5");
						
						Thread.sleep(3000);
						//changing the size to L
						WebElement size_dropdown3=driver.findElement(By.xpath(".//*[@id='group_1']"));
						Select size_dd3=new Select(size_dropdown3);
						size_dd3.selectByVisibleText("L");
						
						//selecting orange color
						driver.findElement(By.xpath(".//*[@id='color_15']")).click();
						
						//adding to cart
						driver.findElement(By.xpath(".//*[@id='add_to_cart']/button")).click();
						
						
				//checkout
						WebDriverWait wait1 = new WebDriverWait(driver,30);
						WebElement e1 = wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='layer_cart']/div[1]/div[2]/div[4]/a/span")));
						driver.findElement(By.xpath(".//*[@id='layer_cart']/div[1]/div[2]/div[4]/a/span")).click();
						
						driver.findElement(By.xpath(".//*[@id='center_column']/p[2]/a[1]/span")).click();
						
						
						driver.findElement(By.xpath(".//*[@id='center_column']/form/p/button")).click();
						
						
						driver.findElement(By.xpath(".//*[@id='cgv']")).click();
						driver.findElement(By.xpath(".//*[@id='form']/p/button")).click();
						
						
						driver.findElement(By.xpath(".//*[@id='HOOK_PAYMENT']/div[2]/div/p/a")).click();
						
						driver.findElement(By.xpath(".//*[@id='cart_navigation']/button")).click();
						
						
						driver.findElement(By.xpath(".//*[@id='header']/div[2]/div/div/nav/div[1]/a/span")).click();
						
						
						driver.findElement(By.xpath(".//*[@id='center_column']/div/div[1]/ul/li[1]/a/span")).click();
						Thread.sleep(3000);
						
						//Taking screenshot
						File srcfile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
						try {
							FileUtils.copyFile(srcfile, new File("D:\\Gaurav\\SaveScreens\\Savescreen3.PNG"));
						} catch (IOException e11) {
							
							e11.printStackTrace();
						}
						
				//signing out
						driver.findElement(By.xpath(".//*[@id='header']/div[2]/div/div/nav/div[2]/a")).click();
	}
	
						
						public static void main(String[] args) throws InterruptedException {
							atcTest myobj= new atcTest();
							myobj.invokeBrowser();
							

						}


}
