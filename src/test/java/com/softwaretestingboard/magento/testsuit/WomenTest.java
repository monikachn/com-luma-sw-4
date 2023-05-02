package com.softwaretestingboard.magento.testsuit;

import com.softwaretestingboard.magento.pages.WomenPage;
import com.softwaretestingboard.magento.testbase.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class WomenTest extends BaseTest {
    WomenPage womenPage = new WomenPage();

    @Test
    public void verifyTheSortByProductNameFilter(){
        womenPage.mouseHoverOnWomen();
        womenPage.mouseHoverOnTop();
        womenPage.clickOnJacket();
        womenPage.selectFiletrFromDropDownList();
//          List<WebElement> jacketsElementsList = driver.findElements(By.xpath("//strong[@class='product name product-item-name']//a"));
//        List<String> jacketsNameListBefore = new ArrayList<>();
//        for (WebElement value : jacketsElementsList) {jacketsNameListBefore.add(value.getText());
    }
    @Test
    public void verifyTheSortByPriceFilter(){
        womenPage.mouseHoverOnWomen();
        womenPage.mouseHoverOnTop();
        womenPage.clickOnJacket();
        womenPage.setSelectByFilterPrice();
        List<WebElement> multiElement = driver.findElements(By.xpath("//span[@class='price-wrapper ']"));
        System.out.println("Total Items are: " + multiElement.size());
        double tmpValue = 0;
        for (WebElement list : multiElement) {
            String name1 = list.getText().replaceAll("[$]", "");
            System.out.println(name1);
            double itemValue = Double.valueOf(name1);
        }
    }
    }

