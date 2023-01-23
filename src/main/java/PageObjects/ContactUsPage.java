package PageObjects;

import net.jodah.failsafe.internal.util.Assert;
import org.openqa.selenium.By;
import utilities.SeleniumDriver;

import java.io.IOException;

public class ContactUsPage {

    SeleniumDriver seleniumDriver = new SeleniumDriver();
    By fullNameField = By.cssSelector("input[name='firstname']");
    By yourEmailField = By.cssSelector("input[name='email']");
    By mobileNumberField = By.cssSelector("input[name='phone']");
    By companySizeDropDown = By.cssSelector("select[name='0-2/company_size']");
    By servicesDropDown = By.cssSelector("select[name='services']");
    By howCanWeHelpYouField = By.cssSelector("textarea[name='message']");
    By sendMessageButton = By.cssSelector("input[type='submit']");
    By successMessage = By.cssSelector("h1[class='contact-hero-heading']");
    By errorMessagesLabel= By.cssSelector("label[class='hs-error-msg']");
    By frame = By.id("hs-form-iframe-0");

    String errors[] = {"Please complete this required field.","Please complete this required field.","Please complete this required field.",
    "Please select an option from the dropdown menu.","Please complete all required fields."};

    public void OpenContactUsPage() throws Exception {

        seleniumDriver.OpenUrl("https://www.sovtech.co.za/contact-us");
        seleniumDriver.SwitchFrame(frame);
    }

    public void EnterFullName(String fullName) throws Exception {

        seleniumDriver.SendKeys(fullNameField,fullName);
    }

    public void EnterEmail(String email) throws Exception {

        seleniumDriver.SendKeys(yourEmailField,email);
    }

    public void EnterMobileNumber(String mobileNumber) throws Exception {

        seleniumDriver.SendKeys(mobileNumberField,mobileNumber);
    }

    public void SelectCompanySize(String companySize) throws Exception {

        seleniumDriver.SelectDropDownItemUsingSelector(companySizeDropDown,companySize);
    }

    public void SelectServices(String services) throws Exception {

        seleniumDriver.SelectDropDownItemUsingSelector(servicesDropDown,services);
    }

    public void EnterHowWeCanHelpYouService(String helpText) throws Exception {

        seleniumDriver.SendKeys(howCanWeHelpYouField,helpText);
    }

    public void ClickSendMessageButton(){

        seleniumDriver.Click(sendMessageButton);
    }

    public String GetSuccessMessage(){

        return seleniumDriver.GetText(successMessage);
    }

    public boolean VerifyErrors(){

        for(int i=0;i<seleniumDriver.ListOfElements(errorMessagesLabel).size();i++){

            String errorMessage =seleniumDriver.ListOfElements(errorMessagesLabel).get(i).getText();
            if (!errors[i].equals(errorMessage)){
                return false;
            }
        }
        return true;
    }

    public boolean VerifyExpectedError(String expectedErrorMessage){

        String error = seleniumDriver.GetText(errorMessagesLabel);
        if (!error.equals(expectedErrorMessage)){
            return false;
        }
        return true;
    }

}
