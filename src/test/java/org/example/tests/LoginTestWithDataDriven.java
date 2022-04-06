package org.example.tests;


import java.io.IOException;

import org.example.Paths;
import org.example.Screenshots;
import org.example.pages.HomePage;
import org.example.pages.LoginPage;
import org.example.pages.MyAccountPage;
import readers.ExcelReader;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.testng.listener.ExtentITestListenerClassAdapter;


@Listeners({ExtentITestListenerClassAdapter.class})
public class LoginTestWithDataDriven extends LoginPage {
    HomePage homePage = new HomePage();
    MyAccountPage myAccountPage = new MyAccountPage();
    ExcelReader excelReader = new ExcelReader();
    Screenshots screenshots = new Screenshots();
    //=======================================================
    @BeforeClass()
    public void loadLoginData()
    {
        String filePath = Paths.DATA;
        try {
            excelReader.setPath(filePath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test(enabled = true)
    public void login()
    {
        try {
            homePage.openAutomationPractice();
            homePage.clickSignIn();
            typeEmail(excelReader.read(1, 0));
            typePassword(excelReader.read(1, 1));
            clickSubmit();
            myAccountPage.assertMyAccountTitle();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @AfterMethod
    public void takeScreenShot()
    {
        screenshots.captureScreenShot("testScreenshot");
    }
}