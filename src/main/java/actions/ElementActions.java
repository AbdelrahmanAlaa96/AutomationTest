package actions;


import org.example.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class ElementActions extends TestBase {
    public WebElement getElement(By locator) {
        WebElement element = null;
        try {
            element = driver.findElement(locator);
            scrollPageToElement(element);
        } catch (Exception ignored) {
        }
        return element;
    }
    //Scroll to a specific element using Locator
    public void scrollPageToElement(WebElement element) {
        try {
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
            actions.moveToElement(element).build().perform();
            highlightElement(element);
            unhighlightElement(element);
        } catch (Exception ignored) {
//            e.printStackTrace();
        }
    }

    //To highlight which button and field the script is currently clicking or typing in
    public void highlightElement(WebElement element) {
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].setAttribute('style', 'background: #ffffe6; border: 2px solid yellow;');", element);
    }

    //To remove the highlight
    public void unhighlightElement(WebElement element) {
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].removeAttribute('style','')", element);
    }

}
