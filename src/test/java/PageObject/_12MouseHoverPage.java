package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class _12MouseHoverPage {
    public WebDriver ldriver;

    public _12MouseHoverPage(WebDriver rdriver) {
        this.ldriver = rdriver;
        PageFactory.initElements(rdriver,this);
    }



    @FindBy(xpath = "//div[@class='figure'][1]")
    public WebElement img1;

    @FindBy(xpath = "//div[@class='figure'][2]")
    public WebElement img2;

    @FindBy(xpath = "//div[@class='figure'][3]")
    public WebElement img3;

    @FindBy(xpath = "//h5[contains(text(),'name: user1')]")
    public WebElement caption1;

    @FindBy(xpath = "//h5[contains(text(),'name: user2')]")
    public WebElement caption2;

    @FindBy(xpath = "//h5[contains(text(),'name: user3')]")
    public WebElement caption3;
}
