package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class SecretPage extends BasePage{


    public SecretPage(WebDriver browser) {
        super(browser);
    }

    public AccountSettingsPage clickAccountSettings(){
        browser.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        browser.findElement(By.className("me")).click();

        return new AccountSettingsPage(browser);
    }
}
