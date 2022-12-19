package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class _05DropDownPage {
    public WebDriver ldriver;

    public _05DropDownPage(WebDriver rdriver) {
        this.ldriver = rdriver;
        PageFactory.initElements(rdriver, this);
    }

    @FindBy(id = "dropdown")
    public WebElement dropDown;

    public void clickDropDown() {
        dropDown.click();
    }
    public void selectOption1() {
        Select selOption1 = new Select(dropDown);
        selOption1.selectByVisibleText("Option 1");
    }

    public void selectOption2() {
        Select selOption2 = new Select(dropDown);
        selOption2.selectByVisibleText("Option 2");
    }

    public String getText() {
        return dropDown.getText();
    }
}
