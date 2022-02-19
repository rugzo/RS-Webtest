package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage extends Page {

    public BasePage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public static void doClick(By locator){
        wait.until(ExpectedConditions.elementToBeClickable(locator));
        driver.findElement(locator).click();
    }

    public static void doSendKey(By locator, String text){
        driver.findElement(locator).sendKeys(text);
    }

    public static String doGetText(By locator){
        return driver.findElement(locator).getText();
    }

    public static void navigateTo(String url){
        driver.get(url);
    }

    public static void waitForVisibility(By locator) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public static void waitForVisibilityText(String text) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(getElementFromText(text)));
    }

    public static By getElementFromText(String text) {
        return By.xpath("//*[text()='"+text+"']");
    }
}
