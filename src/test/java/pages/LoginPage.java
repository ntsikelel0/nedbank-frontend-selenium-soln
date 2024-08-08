package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    WebDriver driver;

    public LoginPage(WebDriver driver){
        this.driver = driver;
    }

    By myAccountLink = By.xpath("//span[text()='My account']");

    By usernameField = By.id("username");
    By passwordField = By.id("password");
    By loginButton = By.name("login");

    public void clickMyAccountLink(){
        driver.findElement(myAccountLink).click();
    }

    public void enterUsernameAndPassword(String usr, String pwd){
        driver.findElement(usernameField).clear();
        driver.findElement(usernameField).sendKeys(usr);
        driver.findElement(passwordField).clear();
        driver.findElement(passwordField).sendKeys(pwd);

    }

    public void clickLoginButton(){
        driver.findElement(loginButton).click();
    }

}
