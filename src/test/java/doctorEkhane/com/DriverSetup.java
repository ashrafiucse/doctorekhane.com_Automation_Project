package doctorEkhane.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class DriverSetup {
    public WebDriver driver;
    //Chrome driver setup
    @BeforeSuite
    public WebDriver setupDriver() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        return driver;
    }

    //Driver close
    @AfterSuite
    public void closeDriver() {
        driver.quit();
    }

}
