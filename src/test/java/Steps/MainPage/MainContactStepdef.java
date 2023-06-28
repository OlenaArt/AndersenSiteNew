package Steps.MainPage;

import io.cucumber.java.en.Given;
import org.openqa.selenium.JavascriptExecutor;

import java.time.Duration;

import static Steps.Hooks.driver;

public class MainContactStepdef {

    JavascriptExecutor js = ((JavascriptExecutor) driver);

    @Given("User navigate to Main page")
    public void userNavigateToMainPage() {
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(100));
        driver.navigate().to("https://dev.andersenlab.com");
        js.executeScript("window.scroll(0, 8700)");
    }


    }

