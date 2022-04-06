package org.example.pages;


import org.example.ConfigUtil;
import actions.ElementActions;
import org.openqa.selenium.By;

public class HomePage extends ElementActions {
    //=============================Locators==================================
    By signIn = By.cssSelector("a[title='Log in to your customer account']");
    //=============================Strings==================================

    //===================================Actions===================================
    public void openAutomationPractice() {
        System.out.println(ConfigUtil.Web_URL);
        driver.navigate().to(ConfigUtil.Web_URL);
    }

    public void clickSignIn()
    {
        getElement(signIn).click();
    }
    //-----------------------------------Assertions--------------------------------

    //------------------------------Text Assertions----------------------------------
}