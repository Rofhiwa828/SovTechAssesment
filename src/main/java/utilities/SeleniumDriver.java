package utilities;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;


public class SeleniumDriver {


    public SeleniumDriver(){

    }

    public static WebDriver driver;

    public final static int PAGE_LOAD_TIMEOUT = 120;
    JavascriptExecutor js;

    public void OpenUrl(String url) throws IOException {

        BrowserConfig();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(PAGE_LOAD_TIMEOUT,TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
        js = (JavascriptExecutor) driver;
        OpenPage(url);
    }

    private void BrowserConfig() throws IOException {

        String driverPath = "Drivers/chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", driverPath);
        driver = new ChromeDriver();
    }

    private void OpenPage(String url){
        driver.get(url);
    }

    public void EndTest(){

        if (driver!=null){

            driver.quit();
            driver = null;
        }
    }

    //Actions Section
    public void Click(By locator) {

        WaitForElementToBeClickable(locator);
        driver.findElement(locator).click();
    }



    public void SelectDropDownItemUsingSelector(By locator, String optionText) throws Exception {

        WaitForElementToBeClickable(locator);
        Select dropDownOptions = new Select(driver.findElement(locator));
        dropDownOptions.selectByVisibleText(optionText);
    }

    public void SendKeys(By locator, String text) throws Exception {

        driver.findElement(locator).clear();
        driver.findElement(locator).sendKeys(text);
    }


    public void SwitchFrame(By locator) throws Exception {

        driver.switchTo().frame(driver.findElement(locator));
    }

    public void WaitForElementToBeClickable(By locator)  {

        try{
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
            wait.until(ExpectedConditions.elementToBeClickable (locator));
        }
        catch (Exception ignored){
        }
    }

    public String GetText(By locator){

        WaitForElementToBeClickable(locator);
        return driver.findElement(locator).getText();
    }

    public List<WebElement> ListOfElements(By locator) {

        return driver.findElements(locator);
    }
}
