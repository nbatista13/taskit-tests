package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class AddContactPage extends BasePage{

    public AddContactPage(WebDriver browser) {
        super(browser);
    }
    private WebElement popupAddMoreData = browser.findElement(By.id("addmoredata"));

    public AddContactPage selectContactType(String type){
        WebElement fieldType = popupAddMoreData.findElement(By.name("type"));
        new Select(fieldType).selectByVisibleText(type);

        return this;
    }

    public AddContactPage typeContact(String contact){
        popupAddMoreData.findElement(By.name("contact")).sendKeys(contact);

        return this;
    }

    public AccountSettingsPage clickSave(){
        browser.findElement(By.linkText("SAVE")).click();

        return new AccountSettingsPage(browser);
    }
    public AccountSettingsPage addContact(String type, String contact){
                selectContactType(type);
                typeContact(contact);
                clickSave();

        return new AccountSettingsPage(browser);
    }

}
