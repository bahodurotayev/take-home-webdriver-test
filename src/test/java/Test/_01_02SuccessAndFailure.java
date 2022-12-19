package Test;

import PageObject._01LoginPage;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import utils.ConfigReader;
import static utils.BaseClass.*;

public class _01_02SuccessAndFailure {

    static final String url = "http://localhost:7080/login";

    @Test(priority = 1)
    void loginSuccess(){
        setUp(url);
        //SoftAssert assertion = new SoftAssert();
        _01LoginPage login = new _01LoginPage(driver);
        login.setUsername(ConfigReader.getProperties("user"));
        login.setPassword(ConfigReader.getProperties("password"));
        login.logIn().click();

        boolean isDisplayed = login.logOut().isDisplayed();
        if(isDisplayed){
            System.out.println("Successfully logged In");
        }else {
            System.out.println("Login failed");
        }
        tearDown();
    }
    @Test(priority = 2)
    void loginFailure() {
        setUp(url);
        _01LoginPage login = new _01LoginPage(driver);
        login.setUsername("abc");
        login.setPassword("123");
        login.logIn().click();

        boolean isDisplayed =
                login.ldriver.findElement(By.xpath("//*[contains(text(),'Your username is invalid!')]")).isDisplayed();

        if (isDisplayed) {
            System.out.println("Please enter valid credentials");
            tearDown();
        }
    }
}
