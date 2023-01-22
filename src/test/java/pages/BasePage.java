package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import suporte.Generator;
import suporte.Screenshot;

public class BasePage {
    protected WebDriver browser;

    public BasePage(WebDriver browser) {
        this.browser = browser;
    }
    public String getToastText(){
        return browser.findElement(By.id("toast-container")).getText();

    }

    public BasePage takePrint(String methodName){
        String screenshotArquivo = "C:\\projects\\test-report\\taskit\\" + Generator.dataHoraParaArquivo() + methodName + ".png";
        Screenshot.tirar(browser, screenshotArquivo);

        return this;
    }
}
