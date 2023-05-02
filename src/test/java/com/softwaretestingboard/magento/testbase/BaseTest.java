package com.softwaretestingboard.magento.testbase;
import com.softwaretestingboard.magento.propertyreader.PropertyReader;
import com.softwaretestingboard.magento.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest extends Utility {
   // String browser = "Chrome";
    String browser = PropertyReader.getInstance().getProperty("browser");

@BeforeMethod
    public void setUp(){
    selectBrowser(browser);

    }
    @AfterMethod
    public void tearDown(){
    closeBrowser();
    }

    public void verifyFromElement(By by, String text) {
        String expextedMessage = text;
        WebElement actualelement = driver.findElement(by);
        String actualmessage = actualelement.getText();
        Assert.assertEquals(expextedMessage, actualmessage);
    }
}
