package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class _10FloatingMenuPage {
    public WebDriver ldriver;

    public _10FloatingMenuPage(WebDriver rdriver) {
        this.ldriver = rdriver;
        PageFactory.initElements(rdriver,this);
    }


    By menu = By.cssSelector("div#menu");


    public boolean isDisplayed(){
       return ldriver.findElement(menu).isDisplayed();
    }
}
