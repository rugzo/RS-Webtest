package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.BasePage;

public class GooglePage extends BasePage {

    public GooglePage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public static String googleHomeUrl = "https://google.com";
    public static By searchInput = By.xpath("//input[@name='q']");
    public static By searchBtn = By.xpath("//input[@name='btnK']");

    public static void open_google_home(){
        navigateTo(googleHomeUrl);
    }

    public static void search_on_google(String keyword){
        waitForVisibility(searchInput);
        doSendKey(searchInput,keyword);
        doClick(searchBtn);
    }

    public static void click_site_on_google_results(String url){
        waitForVisibilityText(url);
        doClick(getElementFromText(url));
    }
}
