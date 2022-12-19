package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class _14JsErrorPage {
    public WebDriver ldriver;

    public _14JsErrorPage(WebDriver rdriver) {
        this.ldriver = rdriver;
        PageFactory.initElements(rdriver, this);
    }
    @FindBy(xpath = "//body/p")
    public WebElement textError;

    public String getTextError(){
        WebDriverWait wait = new WebDriverWait(ldriver, Duration.ofSeconds(25));
        wait.until(ExpectedConditions.visibilityOf(textError));
        return textError.getText();
    }
}
