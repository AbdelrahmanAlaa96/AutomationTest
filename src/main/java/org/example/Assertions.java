package org.example;

import actions.ElementActions;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;


import static org.testng.Assert.*;

public class Assertions extends ElementActions {
    public SoftAssert feSoftAssert = new SoftAssert();

    public void logTCStatus() {
        feSoftAssert.assertAll();
    }

    //================================Assertions By locator============================
    //=================================Assert on existence of element=====================
    public void assertElementExist(By locator) {
        assert getElement(locator).isDisplayed();
    }

    public void assertElementNotExist(By locator) {
        try {
            assert getElement(locator).isDisplayed();
            System.out.println("Assertions failed - Element by locator: [" + locator + "] exist");
            Assert.fail();
        } catch (Exception e) {
            System.out.println("Assertions passed - Element by locator: [" + locator + "] not exist.");
        }
    }

    //============================assert if element is enabled=================================
    public void assertElementEnabled(By locator) {
        assertTrue(getElement(locator).isEnabled());

    }

    public void assertElementDisabled(By locator) {
        assertFalse(getElement(locator).isEnabled());

    }

    public void assertButtonEnabled(By locator, String disabledClassName) {
        String classes = getElement(locator).getAttribute("class");
        boolean isDisabled = classes.contains(disabledClassName);
        assertTrue((!isDisabled));
    }

    public void assertButtonDisabled(By locator, String disabledClassName) {
        String classes = getElement(locator).getAttribute("class");
        boolean isDisabled = classes.contains(disabledClassName);
        assertFalse((!isDisabled));
    }

    //===================================Assert element text=====================================
    public void assertElementText(By locator, String text) {
        String elementText = "";
        {
            elementText = getElement(locator).getText();
            assertEquals(elementText, text);

        }
    }
}