package org.example.pages;


import org.example.Assertions;
import actions.ElementActions;
import org.openqa.selenium.By;


public class MyAccountPage extends ElementActions {
    Assertions assertions = new Assertions();
    //=============================Locators==================================
    By myAccountTitle = By.cssSelector(".page-heading");
    //=============================Strings==================================
    String myAccountTitleText = "MY ACCOUNT";
    //===================================Actions===================================
    //-----------------------------------Assertions--------------------------------

    //------------------------------Text Assertions----------------------------------
    public void assertMyAccountTitle()
    {
        assertions.assertElementText(myAccountTitle, myAccountTitleText);
    }
}