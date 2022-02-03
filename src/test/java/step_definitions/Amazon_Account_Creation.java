package step_definitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.Amazon;
import utilities.ConfigurationReader;
import utilities.Driver;


public class Amazon_Account_Creation {
    Amazon amazon=new Amazon();
    Faker faker=new Faker();


    @Given("user goes to {string}")
    public void userGoesTo(String string) {
        Driver.getDriver().get(ConfigurationReader.getProperty("app_url"));
    }

    @And("user move to Account_List dropdown button")
    public void userAccount_ListDropdownButton() throws InterruptedException {
        WebElement element=amazon.accountListButton;
        Thread.sleep(2000);
        Actions actions=new Actions(Driver.getDriver());
            actions.moveToElement(element).perform();
    }
    @And("user click the start here link")
    public void userClickTheStartHereLink() {
        amazon.startHereLink.click();
    }

    @And("user enter the all data for create an account")
    public void userEnterTheAllDataForCreateAnAccount() {
        amazon.nameTextBox.sendKeys(faker.name().firstName());
        amazon.emailTextBox.sendKeys(faker.internet().emailAddress());
        String password=faker.internet().password();
        amazon.passwordTextBox.sendKeys(password);
        amazon.reEnterPasswordTextBox.sendKeys(password);
        amazon.contunieButton.click();
    }

    @Then("verify the Solve this puzzle to protect your account text is appear")
    public void verifyTheSolveThisPuzzleToProtectYourAccountTextIsAppear() {
        Assert.assertTrue(amazon.puzzleText.isDisplayed());

    }
}
