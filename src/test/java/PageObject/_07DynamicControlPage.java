package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class _07DynamicControlPage {
    public WebDriver ldriver;


    public _07DynamicControlPage(WebDriver rdriver) {
        this.ldriver = rdriver;
        PageFactory.initElements(rdriver, this);
    }

    @FindBy(xpath = "//button[contains(text(),'Remove')]")
    WebElement removeButton;

    @FindBy(xpath = "//p[@id='message']")
    WebElement textButton;

    @FindBy(xpath = "//button[contains(text(),'Add')]")
    WebElement addButton;

    @FindBy(id = "checkbox")
    WebElement checkBox;

    @FindBy(xpath = "//button[contains(text(),'Enable')]")
    WebElement enableButton;

    @FindBy(xpath = "//form[@id='input-example']/input")
    WebElement textForm;

    @FindBy(xpath = "//button[contains(text(),'Disable')]")
    WebElement disableButton;

    public void clickRemove(){
        WebDriverWait wait = new WebDriverWait(ldriver, Duration.ofDays(55));
        wait.until(ExpectedConditions.visibilityOf(removeButton));
        removeButton.click();
    }

    public void clickAdd(){
        WebDriverWait wait = new WebDriverWait(ldriver, Duration.ofDays(55));
        wait.until(ExpectedConditions.visibilityOf(addButton));
        addButton.click();
    }

    public String getButtonText(){
        WebDriverWait wait = new WebDriverWait(ldriver, Duration.ofDays(55));
        wait.until(ExpectedConditions.visibilityOf(textButton));
        return textButton.getText();
    }

    public boolean checkBoxIsDisplayed(){
        WebDriverWait wait = new WebDriverWait(ldriver, Duration.ofDays(55));
        wait.until(ExpectedConditions.visibilityOf(checkBox));
        return checkBox.isDisplayed();
    }
    public void clickEnableButton(){
        WebDriverWait wait = new WebDriverWait(ldriver, Duration.ofDays(55));
        wait.until(ExpectedConditions.visibilityOf(enableButton));
        enableButton.click();
    }
    public boolean enableTextForm(){
        WebDriverWait wait = new WebDriverWait(ldriver, Duration.ofDays(55));
        wait.until(ExpectedConditions.visibilityOf(textForm));
        return textForm.isEnabled();
    }
    public boolean textBoxIsNowEnabled(){
        WebDriverWait wait = new WebDriverWait(ldriver, Duration.ofDays(55));
        wait.until(ExpectedConditions.visibilityOf(textForm));
        return textForm.isEnabled();
    }
    public void clickDisableButton(){
        WebDriverWait wait = new WebDriverWait(ldriver, Duration.ofDays(55));
        wait.until(ExpectedConditions.visibilityOf(disableButton));
        wait.until(ExpectedConditions.elementToBeClickable(disableButton));
        disableButton.click();
    }
}
