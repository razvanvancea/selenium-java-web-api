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

//
//    @FindBy(id = "signInWithEmail")
//
//    public WebElement signInWaitEmail;
//
//    @FindBy(id = "username")
//
//    public WebElement username;
//
//    @FindBy(id = "password")
//
//    public WebElement password;
//
//    @FindBy(id = "userLoginSubmitButton")
//    public WebElement userLoginSubmitButton;
//
//    @FindBy(id = "onetrust-accept-btn-handler")
//    public WebElement cookieAccept;
//
//    @FindBy(id="secure-login")
//    public WebElement clickGirisYapButton;
//
//    @FindBy(css="[type='password']")
//    public WebElement clickPassword2;
//
//    public void socialEmail() {
//
//        socialEmailİnput.sendKeys("testtuba@outlook.com");
//
//    }
//
//    public void clickSignInWaitEmail() {
//
//        signInWaitEmail.click();
//    }
//
//
//    public void setUsername() {
//
//
//        username.clear();
//
//        username.sendKeys("testtuba@outlook.com");
//
//    }
//
//    public void setPassword() {
//
//        password.sendKeys("test12345");
//    }
//
//    public void closeCookıe() {
//
//        cookieAccept.click();
//    }
//
//    public void clickSubmitButton() {
//
//        userLoginSubmitButton.click();
//
//    }
//
//    public void setClickGirisYapButton(){
//        clickGirisYapButton.click();
//    }

}