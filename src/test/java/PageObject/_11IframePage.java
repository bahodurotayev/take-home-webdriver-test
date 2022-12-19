package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class _11IframePage {
    public WebDriver ldriver;

    public _11IframePage(WebDriver rdriver) {
        this.ldriver = rdriver;
        PageFactory.initElements(rdriver,this);
    }

    @FindBy(xpath = "//*[@id='tinymce']/p")
    public WebElement textBoxContent;

    public void setTextBoxContent(String text){
        textBoxContent.sendKeys(text);
    }
    public String getText(){
        return textBoxContent.getText();
    }
}
