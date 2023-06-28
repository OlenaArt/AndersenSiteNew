package Steps.TechStack;

import io.cucumber.java.en.Given;
import org.openqa.selenium.JavascriptExecutor;

import java.time.Duration;

import static Steps.Hooks.driver;

public class RubyCTAPhStepdef {
    JavascriptExecutor js = ((JavascriptExecutor) driver);

    @Given("User navigate to Ruby page in the CTA-block with photo")
    public void userNavigateToRubyPageInTheCTABlockWithPhoto() {
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(200));
        driver.navigate().to("https://dev.andersenlab.com/find-developers/ruby");
        js.executeScript("window.scroll(0, 2500)");
    }
}
