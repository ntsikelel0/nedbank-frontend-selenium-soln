package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.Assert;

import java.time.Duration;

public class BrowserFactory {
    private static WebDriver driver = null;

   public WebDriver startApp(String browserName, String url){
       if(browserName.equalsIgnoreCase("chrome")){
           ChromeOptions chromeOptions = new ChromeOptions().addArguments("--remote-allow-origins=*");
           driver = new ChromeDriver();
       } else if (browserName.equalsIgnoreCase("safari")) {
           driver = new SafariDriver();

       }
       else if (browserName.equalsIgnoreCase("firefox") || browserName.equalsIgnoreCase("mozilla")) {
           driver = new FirefoxDriver();

       }else{
           Assert.fail("%s is not a valid browser".formatted(browserName));
       }

       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
       driver.get(url);

       return driver;
   }

   public static void quitApp(){

       if(driver != null){
           driver.close();
           driver.quit();
       }

   }


}
