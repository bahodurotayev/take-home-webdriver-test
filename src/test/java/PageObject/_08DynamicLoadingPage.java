package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class _08DynamicLoadingPage {
    public WebDriver ldriver;

    public _08DynamicLoadingPage(WebDriver rdriver) {
        this.ldriver = rdriver;
        PageFactory.initElements(rdriver,this);
    }
    @FindBy(css = "div button")
    WebElement startButton;

    @FindBy(css = "div#finish")
    WebElement textMessage;

    public void clickStartButton(){

        startButton.click();
    }

    public String getTextMessage(){
        WebDriverWait wait = new WebDriverWait(ldriver, Duration.ofSeconds(35));
        wait.until(ExpectedConditions.visibilityOf(textMessage));
        return textMessage.getText();
    }


}
