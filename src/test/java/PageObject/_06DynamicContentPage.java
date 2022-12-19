package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class _06DynamicContentPage {
    public WebDriver ldriver;

    public _06DynamicContentPage(WebDriver rdriver) {
        this.ldriver = rdriver;
        PageFactory.initElements(rdriver,this);
    }
    @FindBy(id = "content")
    WebElement textContent;

    public String getText() {
        return textContent.getText();
    }
}
