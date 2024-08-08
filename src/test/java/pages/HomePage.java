package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class HomePage {
    WebDriver driver;

    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    By dashBoardLink = By.xpath("//a[text()='Dashboard']");
    String dashBoardText = "Dashboard";
    By shopMenu = By.xpath("//a[@href='https://eqaroloflow.co.za/wp/shop/']");
    By wines = By.xpath("//a[@href='https://eqaroloflow.co.za/wp/product-category/wine/']");
    By wineOfInterest = By.xpath("//a[@href='https://eqaroloflow.co.za/wp/product/thelma-shiraz-2017/']");
    By addToCartButton = By.name("add-to-cart");
    By checkOutButton = By.xpath("//a[@class='checkout-button button alt wc-forward']");
    By placeOrderButton = By.id("woocommerce-process-checkout-nonce");
    By orderNumber = By.xpath("//li[@class='woocommerce-order-overview__order order']");






    public void validateHomePage(){
        Assert.assertEquals(driver.findElement(dashBoardLink).getText(),dashBoardText);
    }

    public void clickShopMenu(){
        driver.findElement(shopMenu).click();
    }
    public void clickWines(){
        driver.findElement(wines).click();
    }

    public void clickWineOfInterest(){
        driver.findElement(wineOfInterest).click();
        driver.findElement(addToCartButton).click();
    }

    public void clickPlaceOrder(){
        driver.findElement(placeOrderButton).click();
    }

    public void clickCheckOut(){
        driver.findElement(checkOutButton).click();
    }

    public String getOrderNumber(){
        return driver.findElement(orderNumber).getText();
    }

}
