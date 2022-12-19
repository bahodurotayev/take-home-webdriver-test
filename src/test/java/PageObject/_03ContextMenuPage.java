package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class _03ContextMenuPage {
    public WebDriver ldriver;

    public _03ContextMenuPage(WebDriver rdriver) {
        this.ldriver = rdriver;
        PageFactory.initElements(rdriver,this);
    }

    @FindBy(xpath = "//div[@id='hot-spot']")
    public WebElement boxContext;
}
