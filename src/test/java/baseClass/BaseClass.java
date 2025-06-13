package baseClass;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import utilities.MyScreenRecorder;

public class BaseClass {

	public WebDriver driver;
	public Properties p;

	// For record the execution
	@BeforeSuite
	public void bruteforce() throws Exception {
		MyScreenRecorder.startRecording("LOGIN.TEST");
	}

	@BeforeClass
	@Parameters({ "os", "browser" })
	public void setUp(String os, String br) throws Exception {

		// Loading config.properties file

		FileInputStream fis = new FileInputStream("./src/test/resources//config.properties");
		p = new Properties();
		p.load(fis);

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SHUBHAM\\Downloads\\chromedriver-win64 (6)\\chromedriver-win64/chromedriver.exe");

		switch (br.toLowerCase()) {
		case "chrome":
			driver = new ChromeDriver();
			break;
		case "edge":
			driver = new EdgeDriver();
			break;
		case "firefox":
			driver = new FirefoxDriver();
			break;
		default:
			System.out.println("Invalid browser name ");
			return;
		}
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(p.getProperty("appURL")); // Reading url from properties file
		driver.manage().window().maximize();

	}

	@AfterClass
	public void tearDown() {
		driver.close();
	}

	// To stop the recording
	@AfterSuite
	public void afterSuite() throws Exception {
		MyScreenRecorder.stopRecording();

	}

	public void getScreenShot(WebDriver driver) throws Exception {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destFile = new File(
				"C:\\Users\\SHUBHAM\\shubham_Workspace\\automationExerciseProject\\screenshots\\AllTC.png");
		FileUtils.copyFile(source, destFile);

	}
	
	public void captureScreen(WebDriver driver, String tname) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File target = new File(System.getProperty("user.dir") + "/screenshots/" + tname + ".png");
		FileUtils.copyFile(source, target);
		System.out.println("Screenshot taken");
	}
	
	public void alertAccept(WebDriver driver) {
		driver.switchTo().alert().accept();
		System.out.println("Accepted the alert");
	}
	
	
	public String randomestring() 
	{
		String generatedString=RandomStringUtils.randomAlphabetic(8);
		return(generatedString);
	}

	public String randomeNum() 
	{
		String generatedString2=RandomStringUtils.randomAlphanumeric(5);
		return(generatedString2);
	}
	
	

}
