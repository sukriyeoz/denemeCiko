package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import utilities.ConfigurationReader;
import utilities.Driver;

public class Booking_com_Assignment {
    @Given("User goes to {string}")
    public void userGoesTo(String string) {
        {
            Driver.getDriver().get(ConfigurationReader.getProperty("booking_url"));
        }
    }

    @And("User click the Where are you going button and enter the city name to the textbox")
    public void userClickTheWhereAreYouGoingButtonAndEnterTheCityNameToTheTextbox() {
    }

    @And("User click the Check-in Check-out button and enter")
    public void userClickTheCheckInCheckOutButtonAndEnter() {
    }

    @And("User click adult-child-room button enter the datas")
    public void userClickAdultChildRoomButtonEnterTheDatas() {
    }

    @And("User click the {string} button")
    public void userClickTheButton(String arg0) {
    }

    @Then("verify at least one listed hotel name")
    public void verifyAtLeastOneListedHotelName() {
    }
}
