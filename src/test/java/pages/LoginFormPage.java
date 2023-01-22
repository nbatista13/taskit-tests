package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginFormPage extends BasePage {

    public LoginFormPage(WebDriver browser) {
        super(browser);
    }

    public LoginFormPage typeLogin(String login) {
        browser.findElement(By.id("signinbox")).findElement(By.name("login")).sendKeys(login);
        return this;
    }

    public LoginFormPage typePassword(String password) {
        browser.findElement(By.id("signinbox")).findElement(By.name("password")).sendKeys(password);
        return this;
    }

    public SecretPage clickSignIn() {
        browser.findElement(By.linkText("SIGN IN")).click();
        return new SecretPage(browser);
    }

    public SecretPage userLogin(String login, String password) {
        typeLogin(login);
        typePassword(password);
        clickSignIn();
        return new SecretPage(browser);

    }
}
