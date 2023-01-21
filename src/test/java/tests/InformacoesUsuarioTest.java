package tests;

import static org.junit.Assert.*;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class InformacoesUsuarioTest {
    @Test
    public void testAdicionarUmaInformacaoAdicionalDoUsuario() {
        //Abrindo o navegador
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\drivers\\chromedriver.exe");
        WebDriver navegador = new ChromeDriver();
        navegador.manage().window().maximize();
        navegador.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        //Navegando para a página do Taskit
        navegador.get("http://www.juliodelima.com.br/taskit");

        //Clicar no link que tem o texto Sign in
        navegador.findElement(By.linkText("Sign in")).click();

        //identificando o form de login
        WebElement formularioSignInBox = navegador.findElement(By.id("signinbox"));

        //Digitar no campo com name "login" q esta dentro do form de id="signinbox" o texto "TestUser"
        formularioSignInBox.findElement(By.name("login")).sendKeys("TestUser");

        //Clicar no campo com name "password" q esta dentro do form de id="signinbox"
        formularioSignInBox.findElement(By.name("password")).sendKeys("TestUser123");

        //Clicar no link com o texto "SIGN IN"
        navegador.findElement(By.linkText("SIGN IN")).click();

        //Validar que dentro do elemento com class "me" está o texto "Hi, TestUser"
        WebElement me = navegador.findElement(By.className("me"));
        String textoNoElementoMe = me.getText();
        assertEquals("Hi, TestUser", textoNoElementoMe);


        //Fechar o navegador
        navegador.quit();

        //Validação

    }
}
