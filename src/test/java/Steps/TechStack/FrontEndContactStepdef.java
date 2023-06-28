package Steps.TechStack;

import io.cucumber.java.en.Given;
import org.openqa.selenium.JavascriptExecutor;

import java.time.Duration;

import static Steps.Hooks.driver;

public class FrontEndContactStepdef {
    JavascriptExecutor js = ((JavascriptExecutor) driver);
    @Given("User navigate to Front End page")
    public void userNavigateToFrontEndPage() {
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(200));
        driver.navigate().to("https://dev.andersenlab.com/find-developers/front-end");
        js.executeScript("window.scroll(0, 11000)");
    }
}
