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
public class SecundFormPage extends PageObject {

@FindBy (xpath = "//a[contains(@class, 'btn btn-blue')]")
    WebElementFacade next_button;


    public void completeSecundForm(){
        next_button.click();
    }
}
