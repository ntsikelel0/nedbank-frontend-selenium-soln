package stepdefs;

import io.cucumber.java.After;
import utils.BrowserFactory;

public class Hooks {
    @After
    public void tearDown(){
        BrowserFactory.quitApp();
    }

}
