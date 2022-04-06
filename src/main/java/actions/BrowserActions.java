package actions;

import org.example.TestBase;
import org.openqa.selenium.JavascriptExecutor;


import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class BrowserActions extends TestBase {

    public void navigateToPage(String url) {
        driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
        System.out.println(url);
        driver.navigate().to(url);
    }

    public void maximizeWindow() {
        driver.manage().window().maximize();
    }

    public void relaunchBrowser() {
        driver.quit();
        launchBrowser();
    }

    public void openNewTab() {
        ((JavascriptExecutor) driver).executeScript("window.open()");
        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
    }

    public void closeBrowser() {
        driver.close();
    }

    public void quitBrowser() {
        quitDriver();
    }

    //===========================================================================================
    public void refreshPage() {
        driver.navigate().refresh();
    }

    public void navigateBack() {
        driver.navigate().back();
    }

    public void navigateForward() {
        driver.navigate().forward();
    }
}
