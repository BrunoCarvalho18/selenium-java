package defaultpackage;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public final class Driver {
	private static WebDriver driver = null;
	private static ChromeDriverService chromeService = null;
	private static ChromeOptions chromeOptions = null;
	private static File chromeDriverFile = null;

	@Before
	public static void setup() {
		chromeDriverFile = new File("browsers/chromedriver");
		chromeService = new ChromeDriverService.Builder().usingDriverExecutable(chromeDriverFile.getAbsoluteFile())
				.usingAnyFreePort().build();
		chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--start-maximized");
		driver = new ChromeDriver(chromeService, chromeOptions);
	}

	@After
	public static void teardown() {
		driver.quit();
		driver = null;
	}

	
	public static WebDriver getDriver() {
		if (driver == null) {
			setup();
		}
		return driver;
	}
	


}
