package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class _04DragAndDropPage {
    public WebDriver ldriver;

    public _04DragAndDropPage(WebDriver rdriver) {
        this.ldriver = rdriver;
        PageFactory.initElements(rdriver, this);
    }

    @FindBy(css = "div#column-a")
    public WebElement aBox;

    @FindBy(css = "div#column-b")
    public WebElement bBox;

    public WebElement boxColumnB;
    @FindBy(xpath = "//div[@id='column-a']/header")
    public WebElement headerA;
    @FindBy(xpath = "//div[@id='column-b']/header")
    public WebElement headerB;

    public String getHeaderA() {
        return headerA.getText();
    }

    public String getHeaderB() {
        return headerB.getText();
    }

}
