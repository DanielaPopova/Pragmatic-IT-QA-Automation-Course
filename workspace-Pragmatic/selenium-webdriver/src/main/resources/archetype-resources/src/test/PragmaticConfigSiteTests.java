import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;

@RunWith(JUnitParamsRunner.class)
public class PragmaticConfigSiteTests {

	private WebDriver driver;

	@Before
	public void setUp(){
		System.setProperty("webdriver.chrome.driver", "D:\\NetLoads\\webdrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://pragmatic.bg/automation/lecture13/Config.html");
	}

	@Test
	public void validateDropDownOptions(){
		Select makeDropdown = new Select(driver.findElement(By.name("make")));

		List<String> expectedOptions = Arrays.asList(new String[]{"BMW", "Mercedes", "Audi", "Honda"});
		List<String> actualOptions = new ArrayList<>();

		for (WebElement option : makeDropdown.getOptions()) {
			actualOptions.add(option.getText());
		}

		Assert.assertArrayEquals(expectedOptions.toArray(), actualOptions.toArray());
	}

	@Test
	@Parameters({"bmw|BMW",
				 "mercedes|Mercedes",
				 "audi|Audi",
				 "honda|Honda"})
	public void selectedOption_ShouldReturnCorrectValue(String selectedOption, String value){
		Select makeDropdown = new Select(driver.findElement(By.name("make")));

		makeDropdown.selectByValue(selectedOption);
		Assert.assertEquals(value, makeDropdown.getFirstSelectedOption().getText());
	}

	@Test
	@Parameters({"Petrol|Petrol",
				 "Diesel|Diesel"})
	public void checkedRadioButton_ShouldReturnCorrectValue(String buttonValue, String expectedValue){
		WebElement radioButton = driver.findElement(By.xpath("//input[@value='" + buttonValue + "']"));

		if (!radioButton.isSelected()) {
			radioButton.click();
		}

		String radioButtonText = radioButton.findElement(By.xpath("//self::input/ancestor::p")).getText().trim();
		int index = radioButtonText.indexOf(expectedValue);
		String actual = radioButtonText.substring(index, index + expectedValue.length()).trim();

		Assert.assertTrue(radioButton.isSelected());
		Assert.assertEquals(expectedValue, actual);
	}

	@Test
	public void checkBoxValuesAirBagsAndParkingSensor_ShouldBeCorrectlySelected(){
		WebElement airBags = driver.findElement(By.name("airbags"));
		WebElement parkingSensor = driver.findElement(By.name("parksensor"));

		Actions builder = new Actions(driver);
		builder.click(airBags)
			   .click(parkingSensor)
			   .perform();

		Assert.assertTrue(airBags.isSelected());
		Assert.assertTrue(parkingSensor.isSelected());
	}

	@Test
	public void multipleColorSelection_ShouldBeCorrectlySelected(){
		Select colorOptions= new Select(driver.findElement(By.name("color")));

		Assert.assertTrue(colorOptions.isMultiple());

		colorOptions.selectByVisibleText("Black");
		colorOptions.selectByVisibleText("Silver");

		Assert.assertEquals(2, colorOptions.getAllSelectedOptions().size());
	}

	@After
	public void tearDown(){
		driver.close();
	}
}
