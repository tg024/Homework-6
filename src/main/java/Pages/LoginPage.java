package Pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class LoginPage {
    WebDriver driver;

    public LoginPage (WebDriver driver) { this.driver = driver;}

    By profileBtn = By.xpath("/html/body/div[7]/header/div[4]/div[2]/div[3]/div[4]/div[1]/span[1]");
    By emailOrPhoneInput = By.id("EmailOrPhone");
    By passwordInput = By.id("Password");
    By clickLoginBtn = By.id("login-btn");

    @Step("Go to login page")
    public  LoginPage GoToLoginPage() throws InterruptedException {
        driver.findElement(profileBtn).click();
        Thread.sleep(2000);
        return this;
    }
    @Step ("Fill email or phone field: {0}")
    public LoginPage FillEmailOrPhone(String emailOrPhone) {
        driver.findElement(emailOrPhoneInput).sendKeys(emailOrPhone);
        return this;
    }
    @Step ("Fill password: {0}")
    public LoginPage FillPassword(String password){
        driver.findElement(passwordInput).sendKeys(password);
        return this;
    }
    @Step ("Click Login button: {0}")
    public LoginPage ClickLoginBtn() throws InterruptedException {
        driver.findElement(clickLoginBtn).click();
        Thread.sleep(2000);
        return this;
    }
}

