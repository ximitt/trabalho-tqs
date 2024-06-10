package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CadastroNome {

    static WebDriver driver;
    static WebDriverWait wait;

    public CadastroNome(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void preencherCampo(){
        WebElement nome = driver.findElement(By.id("firstName"));
        nome.sendKeys("Leonardo ");
        WebElement sobrenome = driver.findElement(By.id("lastName"));
        sobrenome.sendKeys("Schmitt ");

        WebElement botaoAvancar = driver.findElement(By.xpath("//span[contains(text(), 'Avançar')]"));
        botaoAvancar.click();

    }

    public void preencherData() {
        WebElement dia = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("day")));
        dia.sendKeys("2");
        WebElement mes = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("month")));
        mes.sendKeys("Abril");
        WebElement ano = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("year")));
        ano.sendKeys("2004");

        WebElement genero = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("gender")));
        genero.sendKeys("Homem");

        WebElement botaoAvancar = driver.findElement(By.xpath("//span[contains(text(), 'Avançar')]"));
        botaoAvancar.click();
    }
}
