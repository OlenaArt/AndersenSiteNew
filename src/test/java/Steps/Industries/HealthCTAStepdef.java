package Steps.Industries;

import Steps.Hooks;
import io.cucumber.java.en.Given;
import org.openqa.selenium.JavascriptExecutor;

import java.time.Duration;

import static Steps.Hooks.driver;

public class HealthCTAStepdef {
    JavascriptExecutor js = ((JavascriptExecutor) driver);


    @Given("User navigate to Healthcare page in the CTA-block")
    public void userNavigateToHealthcarePageInTheCTABlock() {
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(200));
        driver.navigate().to("https://dev.andersenlab.com/industries/healthcare");
        js.executeScript("window.scroll(0, 12600)");
    }
}
