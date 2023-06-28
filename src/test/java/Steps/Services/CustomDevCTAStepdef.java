package Steps.Services;

import io.cucumber.java.en.Given;
import org.openqa.selenium.JavascriptExecutor;

import java.time.Duration;

import static Steps.Hooks.driver;

public class CustomDevCTAStepdef {
    JavascriptExecutor js = ((JavascriptExecutor) driver);


    @Given("User navigate to Custom Software Development page in the CTA-block")
    public void userNavigateToCustomSoftwareDevelopmentPageInTheCTABlock() {
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(200));
        driver.navigate().to("https://dev.andersenlab.com/services/custom-software-development");
        js.executeScript("window.scroll(0, 3700)");
    }
}
