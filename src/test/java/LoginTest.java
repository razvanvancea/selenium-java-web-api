
import Pages.BaseTest;
import Pages.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.Select;

public class LoginTest extends BaseTest {
    LoginPage loginPage;

@Test
    public void pomLoginTest() throws InterruptedException {
        loginPage = new LoginPage(driver);

        loginPage.ecommerceMenuItem.click();
        loginPage.email.sendKeys("admin@admin.com");
        loginPage.password.sendKeys("admin123");
        loginPage.submitLoginBtn.click();
    Assert.assertTrue(driver.findElement(By.cssSelector("#logout")).isDisplayed());
    }

    @Test
    public void pomLoginMethodTest() throws InterruptedException {
        loginPage = new LoginPage(driver);
        loginPage.ecommerceMenuItem.click();
        loginPage.doLogin("admin@admin.com", "admin123");
        Assert.assertTrue(driver.findElement(By.cssSelector("#logout")).isDisplayed());
    }

    @Test
    public void classicLoginTest() throws InterruptedException {
        driver.findElement(By.cssSelector("#auth-shop")).click();
        driver.findElement(By.cssSelector("#email")).sendKeys("admin@admin.com");
        driver.findElement(By.cssSelector("#password")).sendKeys("admin123");
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("#submitLoginBtn")).click();
        Assert.assertTrue(driver.findElement(By.cssSelector("#logout")).isDisplayed());
    }

    @Test
    public void fileUploadTest() throws InterruptedException {
        driver.findElement(By.cssSelector("#file-upload-item")).click();
        WebElement fileInput = driver.findElement(By.cssSelector("#file_upload"));
        fileInput.sendKeys(System.getProperty("user.dir")+"/src/test/java/Pages/BaseTest.java");
        driver.findElement(By.cssSelector("button[type=\"submit\"]")).click();
        Assert.assertTrue(driver.findElement(By.cssSelector("#file_upload_response")).isDisplayed());
        String actualString = driver.findElement(By.cssSelector("#file_upload_response")).getText();
        Assert.assertTrue(actualString.contains("You have successfully uploaded"));
//        Thread.sleep(12000);
    }

    @Test
    public void dropdownTest() throws InterruptedException {
        driver.findElement(By.cssSelector("#bugs-form")).click();
        Select dropdown = new Select(driver.findElement(By.cssSelector("#countries_dropdown_menu")));
        dropdown.selectByVisibleText("Austria");
        driver.findElement(By.cssSelector("#password")).sendKeys("qweqwe");
        driver.findElement(By.cssSelector("#phone")).sendKeys("0725237165");
        driver.findElement(By.cssSelector("#emailAddress")).sendKeys("qweqwe@qwe.com");
        driver.findElement(By.cssSelector("#registerBtn")).click();
        String actualCountryText = driver.findElement(By.cssSelector("#results-section #country")).getText();

        Assert.assertTrue(actualCountryText.contains("Austria"));
//
//          dropdown.selectByValue("prog");
//        dropdown.selectByIndex(1);

        Thread.sleep(5000);
    }
}
