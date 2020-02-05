package Fineleap.Automation;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


/**
 * Unit test for simple App.
 */
public class HomePage 
    
{
	WebDriver driver = null;
	
	 
	@Given("open home page")
		public void Open_Home_page(DataTable dt)  {  
		System.out.println("------------");
    	System.setProperty("webdriver.chrome.driver","C:\\Users\\manju.bala\\Gecko\\chromedriver.exe");
    	List<String> list = dt.asList(String.class);
    	String browser = list.get(0);
    	if(browser.equalsIgnoreCase("chrome")) {
    		driver = new ChromeDriver();
        } 
    	else if(browser.equalsIgnoreCase("firefox")) {
        	driver = new FirefoxDriver();
    	}
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
       
       
        
    }
		
	@When("enter url of signup")
    public void enter_url(DataTable da) {
        
        List<String> list = da.asList(String.class);
        driver.get(list.get(0));
        
    }
	
	@Then("signup page open up")
	public void test_page_open_up()
	{
	  if(driver.findElement(By.xpath("//a[contains(.,'Registrieren')]")).isDisplayed());
	  System.out.println("page opens");
	  
		
	}
	
    
    @Given("click on signup button")
    public void click_on_signup_button() throws InterruptedException
    {
    	driver.findElement(By.xpath("//a[contains(.,'Registrieren')]")).click();
    	Thread.sleep(2);
    		
    }
    
       
    @When("enter valid details submit")
    public void enter_valid_details_submit(DataTable da) throws InterruptedException  {
    	List<String> list = da.asList(String.class);
    	driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys(list.get(0));
    	driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys(list.get(1));
    	
    	driver.findElement(By.xpath("//input[@type='email']")).sendKeys(list.get(2));;
    	driver.findElement(By.xpath("//input[@id='password']")).sendKeys(list.get(3));
    	
    	driver.findElement(By.xpath("//input[contains(@name,'conditions')]")).click();
    	driver.findElement(By.xpath("//input[@class='button']")).click();
    	Thread.sleep(3);
       
        
    }
    
    
	@Then("welcome page open up")
    public void Welcome_page_open_up()
	{
    	        String welcome = driver.findElement(By.xpath("//span[contains(.,'Welcome to Pylot')]")).getText();
             Assert.assertEquals("Welcome to Pylot", welcome);
             driver.quit();
        }
	
	@When("enter invalid email")
    public void enter_invalid_email(DataTable da) throws InterruptedException  {
    	List<String> list = da.asList(String.class);
    	driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys(list.get(0));
    	driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys(list.get(1));
    	
    	driver.findElement(By.xpath("//input[@type='email']")).sendKeys(list.get(2));;
    	driver.findElement(By.xpath("//input[@id='password']")).sendKeys(list.get(3));
    	driver.findElement(By.xpath("//input[contains(@name,'conditions')]")).click();
    	
    	Thread.sleep(3);
       
        
    }
	
	@When("enter invalid first name")
    public void enter_invalid_first_name(DataTable da) throws InterruptedException  {
    	List<String> list = da.asList(String.class);
    	driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys(list.get(0));
    	driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys(list.get(1));
    	
    	driver.findElement(By.xpath("//input[@type='email']")).sendKeys(list.get(2));;
    	driver.findElement(By.xpath("//input[@id='password']")).sendKeys(list.get(3));
    	driver.findElement(By.xpath("//input[contains(@name,'conditions')]")).click();
    	
    	Thread.sleep(3);
       
        
    }
	
	@When("enter invalid last name")
    public void enter_invalid_last_name(DataTable da) throws InterruptedException  {
    	List<String> list = da.asList(String.class);
    	driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys(list.get(0));
    	driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys(list.get(1));
    	
    	driver.findElement(By.xpath("//input[@type='email']")).sendKeys(list.get(2));;
    	driver.findElement(By.xpath("//input[@id='password']")).sendKeys(list.get(3));
    	driver.findElement(By.xpath("//input[contains(@name,'conditions')]")).click();
    	
    	Thread.sleep(3);
       
        
    }
	
	@When("enter invalid password")
    public void enter_invalid_password(DataTable da) throws InterruptedException  {
    	List<String> list = da.asList(String.class);
    	driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys(list.get(0));
    	driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys(list.get(1));
    	
    	driver.findElement(By.xpath("//input[@type='email']")).sendKeys(list.get(2));;
    	driver.findElement(By.xpath("//input[@id='password']")).sendKeys(list.get(3));
    	driver.findElement(By.xpath("//input[contains(@name,'conditions')]")).click();
    	
    	Thread.sleep(3);
       
        
    }
	
	@When("enter valid details but checkbox not checked")
    public void enter_valid_details_but_checkbox_not_checked(DataTable da) throws InterruptedException  {
    	List<String> list = da.asList(String.class);
    	driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys(list.get(0));
    	driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys(list.get(1));
    	
    	driver.findElement(By.xpath("//input[@type='email']")).sendKeys(list.get(2));;
    	driver.findElement(By.xpath("//input[@id='password']")).sendKeys(list.get(3));
    	
    	
    	Thread.sleep(3);
       
        
    }

	
	@Then("button disabled")
    public void button_disabled()
	{
		
		List element = driver.findElements(By.xpath("//input[@class='button']"));
    	
           if(element.isEmpty())
           System.out.println("Button not enabled");
           else
        	   System.out.println("Element present");
    	
    	driver.quit();
    	}
	
	@Then("error message displayed")
	public void error_message_displayed()
	{
		String textNotification = driver.findElement(By.xpath("//p[contains(@class,'notification-text')]")).getText();
		System.out.println(textNotification);
		driver.quit();
	
	}
	
	@Given("click on SignIn button")
	public void click_on_SignIn_button()
	{
		if(driver.findElement(By.xpath("//input[@name='username']")).isDisplayed())
			System.out.println("User is on signin page");
	}
	
	@When("enter credentials")
	public void enter_credentials(DataTable da) throws InterruptedException
	{
		List<String> list = da.asList(String.class);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(list.get(0));
		driver.findElement(By.xpath("//input[@class='input-password']")).sendKeys(list.get(1));
	    driver.findElement(By.xpath("//input[@class='button']")).click();
	    Thread.sleep(2);
	
	}
	
	@Then("error invalid credentials")
	public void error_invalid_credentials()
	{
		if(driver.findElement(By.xpath("//p[contains(@class,'notification-text')]")).isDisplayed())
			System.out.println("error comes");
		String errormessage = driver.findElement(By.xpath("//p[contains(@class,'notification-text')]")).getText();
	    System.out.println(errormessage);
	}
	
	
}
