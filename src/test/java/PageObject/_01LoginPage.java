package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class _01LoginPage {
    public WebDriver ldriver;

    public _01LoginPage(WebDriver rdriver) {
        ldriver = rdriver;
        PageFactory.initElements(rdriver, this);
    }

    @FindBy(id = "username")
    WebElement txtusername;

    @FindBy(id = "password")
    WebElement txtpassword;

    @FindBy(xpath = "//i[contains(text(),'Login')]")
    WebElement btnLogin;

    @FindBy(xpath = "//*[contains(text(),' Logout')]")
    WebElement btnLogOut;

    public void setUsername(String uname) {

        txtusername.sendKeys(uname);
    }

    public void setPassword(String pwd) {

        txtpassword.sendKeys(pwd);
    }

    public WebElement logIn(){
        return btnLogin;
    }

    public WebElement logOut(){
        return btnLogOut;
    }
}
