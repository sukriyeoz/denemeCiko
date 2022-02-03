package utilities;

import net.bytebuddy.implementation.bind.MethodDelegationBinder;
import static org.junit.Assert.*;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommonMethods {
    public static String fileName;
    ReadProperties readProperties = new ReadProperties ();

    public void passXPathFileName(String value){
        fileName=null;
        fileName=value.replaceAll(" ", "");
        System.out.println("File name to read xPaths from: " + fileName);

    }

    public String returnXPath(String fileName, String xPathIdentifier){

        System.out.println("Returning the xPath requested for :"+ xPathIdentifier);
        readProperties.loadXpathProperties(fileName);
        String xPath = readProperties.getProperty(xPathIdentifier);

        return xPath;
    }


    public void enterValues_BasedOnXPath(String valuesToBeEntered, String xPathIdentifiers){

        System.out.println("Entering values into designated fields.");
        String delimitir = ", ";

        String [] xPathIdentifiersInArray = xPathIdentifiers.split(delimitir);
        String [] valuesToBeEnteredInArray = valuesToBeEntered.split(delimitir);

        for (int i = 0; i<valuesToBeEnteredInArray.length; i++){

            String xPathIdentifier = xPathIdentifiersInArray[i];
            String valueToBeEntered = valuesToBeEnteredInArray[i];

            String xPath = returnXPath(fileName, xPathIdentifier);
            System.out.println("Entering value "+valueToBeEntered+" into"+xPathIdentifier);

            // explicit wait eklenebilir

            Driver.getDriver().findElement(By.xpath(xPath)).clear();
            Driver.getDriver().findElement(By.xpath(xPath)).sendKeys(valueToBeEntered);

        }

    }

    public void validateValues_BasedOnXPath(String valuesToBeValidated, String xPathIdentifiers){

        System.out.println("Entering values into designated fields.");
        String delimitir = ", ";

        String [] xPathIdentifiersInArray = xPathIdentifiers.split(delimitir);
        String [] valuesToBeValidatedInArray = valuesToBeValidated.split(delimitir);

        for (int i = 0; i<valuesToBeValidatedInArray.length; i++){

            String xPathIdentifier = xPathIdentifiersInArray[i];
            String valueToBeValidated = valuesToBeValidatedInArray[i];

            String xPath = returnXPath(fileName, xPathIdentifier);

            String actualValue = Driver.getDriver().findElement(By.xpath(xPath)).getText();
            System.out.println("Expected value :"+valueToBeValidated);
            System.out.println("Actual value   :"+valueToBeValidated);

            // explicit wait eklenebilir
            assertTrue(valueToBeValidated.equals(actualValue));

        }

    }


    public void clickOnElement_readXPath(int duration, String xPathIdentifier){

        System.out.println("Clicking the "+xPathIdentifier);
        WebDriverWait wait= new WebDriverWait(Driver.getDriver(), duration);
        String xPath=returnXPath(fileName, xPathIdentifier);
        WebElement element = Driver.getDriver().findElement(By.xpath(xPath));
        wait.until((ExpectedConditions.elementToBeClickable(element)));
        ((JavascriptExecutor)Driver.getDriver()).executeScript("arguments[0].scrollIntoView(true);", element);
        element.click();

    }

}
