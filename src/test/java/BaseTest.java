import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

public class BaseTest {

    WebDriver driver;

    @BeforeSuite
    static void setupClass() {
//        WebDriverManager.chromedriver().setup();
        WebDriverManager.firefoxdriver().setup();
    }


    @BeforeTest
    public void setup(){

//        System.setProperty("webdriver.chrome.driver", "/Users/razvan.vancea/stuff/web-selenium-page-factory-demo/src/test/resources/chromedriver");
//        System.setProperty("webdriver.gecko.driver", "/Users/razvan.vancea/stuff/web-selenium-page-factory-demo/src/test/resources/geckodriver");

//        FirefoxOptions options=new FirefoxOptions();
//        options.addArguments("--headless");

        ChromeOptions options=new ChromeOptions();
        options.addArguments("--headless");

//        driver = new FirefoxDriver(options);
        driver = new ChromeDriver();


        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://qa-practice.netlify.app");
    }

    @AfterTest
    public void tearDown(){
        driver.quit();
    }

}