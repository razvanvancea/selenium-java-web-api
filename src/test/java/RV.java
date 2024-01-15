
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RV extends BaseTest{
    LoginPage loginPage;

@Test
    public void test1() throws InterruptedException {
        loginPage = new LoginPage(driver);

        loginPage.ecommerceMenuItem.click();
        loginPage.email.sendKeys("admin@admin.com");
        loginPage.password.sendKeys("admin123");
        loginPage.submitLoginBtn.click();
    Assert.assertTrue(driver.findElement(By.cssSelector("#logout")).isDisplayed());
    }

    @Test
    public void test2() throws InterruptedException {
        driver.findElement(By.cssSelector("#auth-shop")).click();
        driver.findElement(By.cssSelector("#email")).sendKeys("admin@admin.com");
        driver.findElement(By.cssSelector("#password")).sendKeys("admin123");
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("#submitLoginBtn")).click();
        Assert.assertTrue(driver.findElement(By.cssSelector("#logout")).isDisplayed());
    }


}
