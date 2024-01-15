import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    WebDriver driver;
    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "auth-shop")
    public WebElement ecommerceMenuItem;

    @FindBy(css = "#email")
    public WebElement email;

    @FindBy(css = "#password")
    public WebElement password;

    @FindBy(id = "submitLoginBtn")
    public WebElement submitLoginBtn;

    public void doLogin(String email, String pw){
        this.email.sendKeys(email);
        this.password.sendKeys(pw);
        this.submitLoginBtn.click();
    }
}