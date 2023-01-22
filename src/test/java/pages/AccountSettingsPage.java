package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccountSettingsPage extends BasePage {

    public AccountSettingsPage(WebDriver browser) {
        super(browser);
    }

    public AccountSettingsPage clickMoreDataTab() {
        browser.findElement(By.linkText("MORE DATA ABOUT YOU")).click();
        return this;
    }

    public AddContactPage clickMoreDataButton(){
        browser.findElement(By.xpath("//button[@data-target=\"addmoredata\"]")).click();
        return new AddContactPage(browser);
    }
}
