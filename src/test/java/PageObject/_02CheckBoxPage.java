package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class _02CheckBoxPage {
    public WebDriver ldriver;

    public _02CheckBoxPage(WebDriver rdriver) {
        this.ldriver = rdriver;
        PageFactory.initElements(rdriver,this);
    }

    @FindBy(xpath = "//form[@id='checkboxes']/input[1]")
    public WebElement chkbox1;

    @FindBy(xpath = "//form[@id='checkboxes']/input[2]")
    public WebElement chkbox2;


}
