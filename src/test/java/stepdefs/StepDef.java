package stepdefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.HomePage;
import pages.LoginPage;
import utils.BrowserFactory;

public class StepDef {

    WebDriver driver;
    BrowserFactory browserFactory = new BrowserFactory();
    LoginPage loginPage;
    HomePage homePage;

    @Given("User is on login page")
    public void user_is_on_login_page() {
        driver = browserFactory.startApp("chrome","https://eqaroloflow.co.za/wp/");
        loginPage = new LoginPage(driver);
        homePage = new HomePage(driver);

    }
    @When("User enters valid {string} and {string}")
    public void user_enters_valid_username_and_password(String usr, String pwd) {
        loginPage.clickMyAccountLink();
        loginPage.enterUsernameAndPassword(usr, pwd);

    }
    @And("User clicks the login button")
    public void user_clicks_the_login_button() {
        loginPage.clickLoginButton();
    }
    @Then("User lands on the home page")
    public void user_lands_on_the_home_page() {
        homePage.validateHomePage();
    }

    @When("User goes to shop")
    public void user_goes_to_shop() {
        homePage.clickShopMenu();
    }
    @When("User goes to wines category")
    public void user_goes_to_wines_category() {
        homePage.clickWines();
    }
    @When("User adds a wine to cart and places order")
    public void user_adds_a_wine_to_cart() {
        homePage.clickWineOfInterest();
        homePage.clickCheckOut();
        homePage.clickPlaceOrder();
    }

    @Then("User gets the order number")
    public void user_gets_order_number() {
        System.out.println(homePage.getOrderNumber());
    }



}
