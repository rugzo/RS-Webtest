package runners;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;
import utilities.Page;

@CucumberOptions(
        features = "src/test/java/features/",
        glue = {"steps"},
        plugin = {
                "pretty",
                "html:target/cucumber-reports/cucumber-pretty",
                "json:target/cucumber-reports/CucumberTestReport.json",
                "rerun:target/cucumber-reports/rerun.txt"
        })
public class TestRunner extends AbstractTestNGCucumberTests {
        public WebDriver driver;
        public WebDriverWait wait;
        public Page page;
        public int waitSeconds = 20;

        @BeforeTest()
        public void setUp() {
                System.out.println("TESTS SETUP!!");
                System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\test\\resources\\drivers\\chromedriver.exe");

                ChromeOptions options = new ChromeOptions();
                options.addArguments("--disable-notifications");
                options.addArguments("--start-maximized");
                driver = new ChromeDriver(options);
                wait = new WebDriverWait(driver,waitSeconds);
                page = new Page(driver,wait);

        }

        @AfterTest(alwaysRun = true)
        public void tearDown() {
                driver.quit();
        }
}
