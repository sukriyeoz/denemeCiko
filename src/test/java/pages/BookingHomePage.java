package pages;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public abstract class BookingHomePage {

    public BookingHomePage(){

    PageFactory.initElements(Driver.getDriver(),this);
}




}