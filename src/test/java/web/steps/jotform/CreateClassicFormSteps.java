package web.steps.jotform;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import web.pages.selenide.jotform.MyFormsPage;
import web.pages.selenide.jotform.WelcomePage;

public class CreateClassicFormSteps {

    WelcomePage welcomePage = new WelcomePage();
    MyFormsPage myFormsPage = new MyFormsPage();

    @Given("Open site")
    public void openSite() {
        welcomePage.openSite();
    }

    @When("Log in")
    public void logIn() {
        welcomePage.logIn();
    }

    @When("Create first form")
    public void createFirstForm() {
        myFormsPage.enterPersonsData();
        myFormsPage.enterMainAppointment();
        myFormsPage.enterAdditionalAppointment();
        myFormsPage.enterTextArea();
        myFormsPage.submit();
    }

    @Then("Check tnx pop-up exists")
    public void checkTnxPopUpExists() {
        myFormsPage.checkTnxPopUpExists();
    }
}
