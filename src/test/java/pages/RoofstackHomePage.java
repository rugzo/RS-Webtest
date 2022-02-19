package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.BasePage;

public class RoofstackHomePage extends BasePage {
    public RoofstackHomePage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public static void navigateNavbar(String text){
        doClick(getElementFromText(text));
    }
}
