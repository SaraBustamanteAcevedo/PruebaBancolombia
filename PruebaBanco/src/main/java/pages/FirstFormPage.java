package pages;


import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

@DefaultUrl("https://www.utest.com")
public class FirstFormPage extends PageObject {
    public WebDriver driver;

@FindBy (xpath = "//a[@class= 'unauthenticated-nav-bar__sign-up']")
    WebElementFacade register_button;
@FindBy (id = "firstName")
    WebElementFacade firt_name;
@FindBy (id = "lastName")
    WebElementFacade last_name;
@FindBy (id = "email")
    WebElementFacade email;
@FindBy (id = "birthMonth")
    WebElementFacade birthMonth;
@FindBy (id = "birthDay")
    WebElementFacade birthDay;
@FindBy (id = "birthYear")
    WebElementFacade birthYear;
@FindBy (xpath = "//a[contains(@class, 'btn btn-blue')]")
    WebElementFacade next_button;
@FindBy (xpath = "//a[contains(@class, 'btn btn-blue')]")
    WebElementFacade next_button_address;

    public void userRegister() {
        register_button.click();
    }
    public WebElement el(By by) {
        return driver.findElement(by);
    }

    public void completeForm(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        typeInto(firt_name, "Sara");
        typeInto(last_name, "Bustamante");
        typeInto(email, "sara@correo.com");
        selectFromDropdown(birthMonth, "October");
        selectFromDropdown(birthDay, "1");
        selectFromDropdown(birthYear, "1994");
        next_button.click();
        next_button.click();
    }
}
