package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Amazon extends BasePage{

@FindBy(xpath="//input[@id='ap_customer_name']")
    public WebElement nameTextBox;
@FindBy(xpath="//input[@id='ap_email']")
    public WebElement emailTextBox;
@FindBy(xpath="//input[@id='ap_password']")
    public WebElement passwordTextBox;
@FindBy(xpath="//input[@id='ap_password_check']")
    public WebElement reEnterPasswordTextBox;
@FindBy(xpath="//input[@id='continue']")
    public WebElement contunieButton;
@FindBy(xpath="//span[text()='Solve this puzzle to protect your account']")
    public  WebElement puzzleText;
@FindBy(xpath="//span[text()='Hello, Sign in']")
    public WebElement accountListButton;
@FindBy(xpath="//div[@id='nav-flyout-ya-newCust']//a[@class='nav-a']")
    public WebElement startHereLink;


}
