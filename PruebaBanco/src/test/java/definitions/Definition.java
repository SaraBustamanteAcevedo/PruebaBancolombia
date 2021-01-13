package definitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import step.RegisterStep;

public class Definition {

    @Steps
    RegisterStep step;

    @Given("^I want to enter the application$")
    public void iWantToEnterTheApplication() {
        step.openBrowser();
    }


    @When("^i want to register$")
    public void iWantToRegister() {
        step.register();
    }

    @Then("^will perform the successful registration$")
    public void willPerformTheSuccessfulRegistration() {
    }
}
