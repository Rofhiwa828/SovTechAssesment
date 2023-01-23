package stepDefinition.sovTechContactUsStepDefs;

import PageObjects.ContactUsPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class ContactUsPageStepDefs {

    ContactUsPage contactUsPage = new ContactUsPage();


    @Given("^Given the User is on the contact us page$")
    public void given_the_User_is_on_the_contact_us_page() throws Throwable {

        contactUsPage.OpenContactUsPage();
    }

    @Given("^User Enter Full Name \"([^\"]*)\"$")
    public void user_Enter_Full_Name(String fullName) throws Throwable {

        contactUsPage.EnterFullName(fullName);
    }

    @Given("^User Enter email \"([^\"]*)\"$")
    public void user_Enter_email(String email) throws Exception {

        contactUsPage.EnterEmail(email);
    }

    @Given("^User Enter Mobile number \"([^\"]*)\"$")
    public void user_Enter_Mobile_number(String mobileNumber) throws Exception {

        contactUsPage.EnterMobileNumber(mobileNumber);
    }

    @Given("^User Selects Company size \"([^\"]*)\"$")
    public void user_Selects_Company_size(String companySize) throws Exception {

        contactUsPage.SelectCompanySize(companySize);
    }

    @Given("^User Selects the type of service \"([^\"]*)\"$")
    public void user_Selects_the_type_of_service(String service) throws Exception {

        contactUsPage.SelectServices(service);
    }

    @Given("^User Enter how can we help you text \"([^\"]*)\"$")
    public void user_Enter_how_can_we_help_you_text(String howCanWeHelpYouText) throws Exception {

        contactUsPage.EnterHowWeCanHelpYouService(howCanWeHelpYouText);
    }

    @When("^The user clicks on the Send message button$")
    public void the_user_clicks_on_the_Send_message_button() {

        contactUsPage.ClickSendMessageButton();
    }

    @Then("^A success Message is displayed$")
    public void a_success_Message_is_displayed() throws Throwable {

        Assert.assertEquals("Success!",contactUsPage.GetSuccessMessage());;
    }

    @Then("^Then verify if errors are being displayed$")
    public void thenVerifyIfErrorsAreBeingDisplayed() {

        Assert.assertTrue(contactUsPage.VerifyErrors());
    }

    @Then("^Verify expected error \"([^\"]*)\"$")
    public void verifyExpectedErrors(String errorMessage) {

        Assert.assertTrue(contactUsPage.VerifyExpectedError(errorMessage));
    }
}
