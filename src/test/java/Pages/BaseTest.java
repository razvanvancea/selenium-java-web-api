package Pages;

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

    public WebDriver driver;

    @BeforeSuite
    static void setupClass() {

//

        if(System.getProperty("os").equalsIgnoreCase("chrome")){
            WebDriverManager.chromedriver().setup();
        }else if(System.getProperty("os").equalsIgnoreCase("firefox")){

            WebDriverManager.firefoxdriver().setup();
        }
    }


    @BeforeTest
    public void setup(){

//        System.setProperty("webdriver.chrome.driver", "/Users/razvan.vancea/stuff/web-selenium-page-factory-demo/src/test/resources/chromedriver");
//        System.setProperty("webdriver.gecko.driver", "/Users/razvan.vancea/stuff/web-selenium-page-factory-demo/src/test/resources/geckodriver");

//        FirefoxOptions options=new FirefoxOptions();
//        options.addArguments("--headless");

        if(System.getProperty("os").equalsIgnoreCase("chrome")){
            if(System.getProperty("headless").contains("true")){
                ChromeOptions options=new ChromeOptions();
                options.addArguments("--headless=new");
                driver = new ChromeDriver(options);
            }else {

                driver = new ChromeDriver();
            }
        }else if(System.getProperty("os").equalsIgnoreCase("firefox")){

            if(System.getProperty("headless").contains("true")){
                FirefoxOptions options=new FirefoxOptions();
                options.addArguments("--headless");
                driver = new FirefoxDriver(options);
            }else {

                driver = new FirefoxDriver();
            }
        }

//
//        if(System.getProperty("headless").contains("true")){
//            ChromeOptions options=new ChromeOptions();
//            options.addArguments("--headless=new");
//            driver = new ChromeDriver(options);
//        }else {
//
//            driver = new FirefoxDriver();
//        }


//        ChromeOptions options=new ChromeOptions();
//        options.addArguments("--headless");

//        driver = new FirefoxDriver(options);
//        driver = new ChromeDriver();


        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://qa-practice.netlify.app");
    }

    @AfterTest
    public void tearDown(){


        driver.quit();
    }
}