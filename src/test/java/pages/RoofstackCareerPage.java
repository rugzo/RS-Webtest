package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import utilities.BasePage;

import java.io.File;
import java.nio.file.Paths;

public class RoofstackCareerPage extends BasePage {
    public RoofstackCareerPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public static String cvFile = "src/test/resources/SampleCV.pdf" ;
    public static By makeAnApplicationBTN = By.xpath("//small[text()=' Send CV ']");
    public static By emailInput = By.xpath("//input[@type=\"email\"]");
    public static By cvFileInput = By.xpath("//*[@id='file']");
    public static By uploadCvBtn =  By.xpath("//input[@type='submit']");
    public static By uploaded100percentText =  By.xpath("//div[@id='percent' and text()=\"100%\"]");

    public static void selectPositionsCategory(String category){
        doClick(getElementFromText(category));
    }

    public static void selectPosition(String position){
        doClick(getElementFromText(position));
    }

    public static void clickMakeAnApplicationBtn(){
        doClick(makeAnApplicationBTN);
    }

    public static void fillEmail(String email){
        waitForVisibility(emailInput);
        doSendKey(emailInput,email);
    }

    public static void selectCvFileFromComputer() throws Exception {

        File f = new File(cvFile);
        if(f.exists() && !f.isDirectory()) {
            String cvFilePath = Paths.get(cvFile).toAbsolutePath().toString();
            doSendKey(cvFileInput,cvFilePath);
        }else{
            throw new Exception("File not found or inaccessible");
        }
    }

    public static void clickUploadBtn(){
        doClick(uploadCvBtn);
    }

    public static void checkFileUploaded(){
        waitForVisibility(uploaded100percentText);

        String percentage = doGetText((uploaded100percentText));
        Assert.assertEquals("100%", percentage);
    }
}
