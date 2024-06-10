package test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.CadastroNome;

import static org.junit.Assert.*;

public class CadastroNomeTest {

    static WebDriver driver;
    static CadastroNome cadastroNome;

    @Before
    public void setUp() throws Exception {
    }
    @Test
    public void test1(){
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://accounts.google.com/SignUp?hl=pt");

        cadastroNome = new CadastroNome(driver);


        cadastroNome.preencherCampo();
        cadastroNome.preencherData();

    }

    @After
    public void tearDown() throws Exception {
    }
}