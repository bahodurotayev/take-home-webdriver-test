package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class _15NewTabPage {
    public WebDriver ldriver;

    public _15NewTabPage(WebDriver rdriver) {
        this.ldriver = rdriver;
        PageFactory.initElements(rdriver, this);
    }

    @FindBy(xpath = "//a[@href='/windows/new']")
    public WebElement newLink;

    @FindBy(css = "div h3")
    public WebElement text;

    public void clickLink(){
        newLink.click();
    }

}
