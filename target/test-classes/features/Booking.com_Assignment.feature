Feature: As a User I am able to create a hotel booking from booking.com website

  Scenario: User create booking a hotel room
    Given User goes to "booking_url"
    And User click the Where are you going button and enter the city name to the textbox
    |City Name|
    |New York |
     And User click the Check-in Check-out button and enter
    |Check-in|Check-out|
    |2021-12-22|2021-12-25|
    And User click adult-child-room button enter the datas
    |Adult|Child|
    |2    |2    |
    And User click the "search" button
    And User click the "Price (lowestfirst)" button
    Then verify at least one listed hotel name






