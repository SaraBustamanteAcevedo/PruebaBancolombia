package step;

import net.thucydides.core.annotations.Step;
import pages.FirstFormPage;
import pages.SecundFormPage;


public class RegisterStep {
    FirstFormPage firstFormPage;
    SecundFormPage secundFormPage;

    @Step
    public void openBrowser(){
        firstFormPage.open();
    }

    public void register() {
        firstFormPage.userRegister();
        firstFormPage.completeForm();
        secundFormPage.completeSecundForm();
    }
}
