package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class _09FileDownloadPage {
    public WebDriver ldriver;

    public _09FileDownloadPage(WebDriver rdriver) {
        this.ldriver = rdriver;
        PageFactory.initElements(rdriver, this);
    }

    @FindBy(xpath = "//*[text()='some-file.txt']")
    WebElement download;


    public void clickDownloadText(){
        download.click();
    }
}
