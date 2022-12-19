package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class _16NotificationPage {
    public WebDriver ldriver;

    public _16NotificationPage(WebDriver rdriver) {
        this.ldriver = rdriver;
        PageFactory.initElements(rdriver,this);
    }

    @FindBy(xpath = "//a[@href='/notification_message']")
    public WebElement clickHere;

    @FindBy(xpath = "//div[@id='flash']")
    public WebElement notificationMssg;

    public void clickLink(){
        clickHere.click();
    }

    public String notificationMessage(){
        WebDriverWait wait = new WebDriverWait(ldriver, Duration.ofSeconds(25));
        wait.until(ExpectedConditions.visibilityOf(notificationMssg));
        return notificationMssg.getText();
    }

    public boolean notificationMessage2(){
      return  notificationMssg.isDisplayed();
    }
}
