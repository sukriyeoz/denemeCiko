package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import utilities.CommonMethods;
import utilities.Driver;


public class CommonSeleniumMadeEasy {
   CommonMethods commonMethods=new CommonMethods();

    @Given("user logs in to the Application")
    public void userLogsInToTheApplication() {

     Driver.getDriver().get("https://www.gmibank.com/login");


    }

    @And("user passes {string} file to retrieve related xPaths")
    public void userPassesFileToRetrieveRelatedXPaths(String fileName) {
        commonMethods.passXPathFileName(fileName);

    }

    @Given("user enters value {string} into the designated {string} fields")
    public void userEntersValueIntoTheDesignatedFields(String valuesToBeEntered, String xPathIdentifiers) {
     commonMethods.enterValues_BasedOnXPath(valuesToBeEntered, xPathIdentifiers);
    }

    @And("user clicks on the {string}")
    public void userClicksOnThe(String xPathIdentifier) {
     commonMethods.clickOnElement_readXPath(5, xPathIdentifier);

    }

    @Given("user validates values {string} as {string}")
    public void userValidatesValuesAs(String valuesToBeValidated, String xPathIdentifiers) {
    commonMethods.validateValues_BasedOnXPath(valuesToBeValidated, xPathIdentifiers);
    }
}
