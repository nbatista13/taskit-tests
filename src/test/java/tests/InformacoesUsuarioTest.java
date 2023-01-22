package tests;

import static org.junit.Assert.*;

import org.easetech.easytest.annotation.DataLoader;
import org.easetech.easytest.annotation.Param;
import org.easetech.easytest.runner.DataDrivenTestRunner;
import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import pages.BasePage;
import pages.LoginPage;
import suporte.Generator;
import suporte.Screenshot;
import suporte.Web;

@RunWith(DataDrivenTestRunner.class)
@DataLoader(filePaths = "InformacoesUsuarioTest.csv")
public class InformacoesUsuarioTest {
    private WebDriver browser;

    @Rule
    public TestName test = new TestName();
    @Before
    public void setUp() {
        browser = Web.createChrome();
    }

    @Test
    public void testAdicionarUmaInformacaoAdicionalDoUsuario(@Param(name = "user") String userOne,
                                                             @Param(name = "password") String passwordOne,
                                                             @Param(name = "type") String type,
                                                             @Param(name = "contact") String contact,
                                                             @Param(name = "expectedMessage") String expectedMessage) {
        String toastText = new LoginPage(browser)
                .clickSignIn()
                .userLogin(userOne, passwordOne)
                .clickAccountSettings()
                .clickMoreDataTab()
                .clickMoreDataTab()
                .clickMoreDataButton()
                .addContact(type, contact)
                .getToastText();
        assertEquals(expectedMessage, toastText);
        new BasePage(browser)
                .takePrint(test.getMethodName());
    }
    /*@Test
    public void removerUmContatoDeUmUsuario(){
        //clicar no elemento com xpath //span[text()="+551199998888"]/following-sibling::a
        navegador.findElement(By.xpath("//span[text()=\"+551199998888\"]/following-sibling::a")).click();

        //confirmar a janela em javascript
        navegador.switchTo().alert().accept();

        //Validar que a mensagem apresentada foi a "Rest in peace, dear phone!"
        WebElement mensagemPop = navegador.findElement(By.id("toast-container"));
        String mensagem = mensagemPop.getText();
        assertEquals("Rest in peace, dear phone!",mensagem);
        String screenshotArquivo = "C:\\projects\\test-report\\taskit\\" + Generator.dataHoraParaArquivo() + test.getMethodName() + ".png";
        Screenshot.tirar(navegador, screenshotArquivo);

        //Aguardar até 10 segundos para que a janela desapareça
        WebDriverWait aguardar = new WebDriverWait(navegador, Duration.ofSeconds(10));
        aguardar.until(ExpectedConditions.stalenessOf(mensagemPop));

        //Clicar no link com de texto "Logout"
        navegador.findElement(By.linkText("Logout")).click();
    }*/

    @After
    public void tearDown() {
        //Fechar o navegador
        browser.quit();
    }
}
