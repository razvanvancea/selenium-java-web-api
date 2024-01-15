//import org.junit.jupiter.api.*;
//
////import extention.LogExtension;
////import extention.TestExtension;
////import extention.TestStatusExtension;
////import org.apache.logging.log4j.LogManager;
////import org.apache.logging.log4j.Logger;
////import org.junit.jupiter.api.*;
////import org.junit.jupiter.api.extension.ExtendWith;
//
//
//public class LoginTest extends BaseTest{
////    private static final Logger logger = LogManager.getLogger(Login.class);
//
//
//    LoginPage loginPage;
//
//    @BeforeEach
//
//    public void before(){
//
//        loginPage = new LoginPage(driver);
//
//    }
//
////    @Tags({@Tag("Social Login"),@Tag("Standart Login"),@Tag("Login")})
////    @ExtendWith({TestExtension.class, LogExtension.class, TestStatusExtension.class})
////    @Test
////    public void socialLogin(){
////
////        driver.get("https://secure.sahibinden.com/giris");
////        loginPage.socialEmail();
////        loginPage.clickSignInWaitEmail();
////        loginPage.setUsername();
////        loginPage.setPassword();
////        loginPage.clickSubmitButton();
////
////    }
//
//    @Test
//    public void standartLogin() throws InterruptedException{
//
//        loginPage.ecommerceMenuItem.click();
//        loginPage.email.sendKeys("admin@admin.com");
//        loginPage.password.sendKeys("admin123");
//        loginPage.submitLoginBtn.click();
//        Thread.sleep(5000);
//    }
//}
