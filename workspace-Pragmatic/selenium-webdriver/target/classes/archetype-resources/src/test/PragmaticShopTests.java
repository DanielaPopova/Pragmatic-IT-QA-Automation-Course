import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;

@RunWith(JUnitParamsRunner.class)
public class PragmaticShopTests {
	private WebDriver driver;

	@Before
	public void setUp(){
		System.setProperty("webdriver.chrome.driver", "D:\\NetLoads\\webdrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://shop.pragmatic.bg/admin");
	}

	@Test
	public void validInput_ShouldSuccessfullyLoginAdmin(){
		WebElement inputUsername = driver.findElement(By.name("username"));
		inputUsername.sendKeys("admin");

		WebElement inputPassword = driver.findElement(By.name("password"));
		inputPassword.sendKeys("parola");

		WebElement loginButton = driver.findElement(By.linkText("Login"));
		loginButton.click();

		try {
			WebElement logoutButton = driver.findElement(By.linkText("Logout"));
			assertTrue(logoutButton.isDisplayed());
		} catch (NoSuchElementException nsee) {
			System.out.println("There is no logout button!");
		}

		String expected = driver.findElement(By.xpath("//*[@id='header']/div[1]/div[2]")).getText().trim();
		String actual = "You are logged in as admin";
		assertEquals(expected, actual);
	}

	@Test
	@Parameters({"",
				"wrongAdminUsername" })
	public void invalidInput_ShouldShowValidationErrorMessage(String invalidInput){
		WebElement inputUsername = driver.findElement(By.name("username"));
		inputUsername.sendKeys(invalidInput);

		WebElement inputPassword = driver.findElement(By.name("password"));
		inputPassword.sendKeys(invalidInput);

		driver.findElement(By.linkText("Login")).click();

		String errorMessage = driver.findElement(By.xpath("//*[@id='content']/div/div[2]/div")).getText().trim();
		String actualErrorMessage = "No match for Username and/or Password.";

		assertEquals(errorMessage, actualErrorMessage);
	}

	@Test
	public void validateDropDownOptionsInAdminProfile(){
		WebElement inputUsername = driver.findElement(By.name("username"));
		inputUsername.sendKeys("admin");

		WebElement inputPassword = driver.findElement(By.name("password"));
		inputPassword.sendKeys("parola");

		WebElement loginButton = driver.findElement(By.linkText("Login"));
		loginButton.click();

		Select rangeDropDown = new Select(driver.findElement(By.id("range")));
		assertEquals(4, rangeDropDown.getOptions().size());

		List<String> expectedOptions = Arrays.asList(new String[]{"Today", "This Week", "This Month", "This Year"});
		List<String> actualOptions = new ArrayList<>();

		for (WebElement option : rangeDropDown.getOptions()) {
			actualOptions.add(option.getText());
		}

		assertArrayEquals(expectedOptions.toArray(),actualOptions.toArray());
	}

	@After
	public void tearDown(){
		driver.close();
	}
}

/*
 * Documentation for selenium/junit: Maven -> Download JavaDoc
 * Build Path for project, junit tests launching - "The input type of the launch configuration does not exist" error
 * JUnitParams - for parameterized test methods: https://github.com/Pragmatists/JUnitParams
 * import all * - ctrl + S problem
 */
