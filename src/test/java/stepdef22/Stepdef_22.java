package stepdef22;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;


public class Stepdef_22 {
	WebDriver driver;
	@Given("TestMe is up and runnning")
	public void testme_is_up_and_runnning() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new cucumber.api.PendingException(); System.setProperty("webdriver.chrome.driver", "C:\\Users\\training_h2a.06.15\\Downloads\\OneDrive_2019-08-12\\SeleniumBroDrivers\\chromedriver.exe");
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\training_h2a.06.15\\Downloads\\OneDrive_2019-08-12\\SeleniumBroDrivers\\chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");

	}

	@Then("registered user enter the valid cred")
	public void registered_user_enter_the_valid_cred() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/ul/li[1]/a")).click();
		 driver.findElement(By.name("userName")).sendKeys("christ");
		 driver.findElement(By.name("password")).sendKeys("Christ123");
		 driver.findElement(By.name("Login")).click();
		
	}

	@Then("verifies for the login status for his cred")
	public void verifies_for_the_login_status_for_his_cred() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new cucumber.api.PendingException();
		 String actual =driver.findElement(By.linkText("SignOut")).getText();
		  String expected="SignOut";
		  Assert.assertEquals(expected, actual);
	}


}
