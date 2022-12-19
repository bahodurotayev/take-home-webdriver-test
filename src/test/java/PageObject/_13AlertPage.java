package PageObject;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.security.PublicKey;

public class _13AlertPage {
    public WebDriver ldriver;

    public _13AlertPage(WebDriver rdriver) {
        this.ldriver = rdriver;
        PageFactory.initElements(rdriver, this);
    }
    @FindBy(xpath = "//button[@onclick='jsAlert()']")
    public WebElement alertButton;

    @FindBy(xpath = "//button[@onclick='jsConfirm()']")
    public WebElement confirmButton;

    @FindBy(xpath = "//button[@onclick='jsPrompt()']")
    public WebElement promptButton;

    @FindBy(id = "result")
    public WebElement resultText;

    public void clickAlertButton(){alertButton.click();}

    public void clickConfirmButton(){confirmButton.click();}

    public void clickPromptButton(){promptButton.click();}

    public void verifyText(String str){
       if(resultText.getText().contains(str)){
           Assert.assertTrue("Test passed", true);
       }else {
           Assert.assertFalse("Test failed", false);
       }
    }

}
