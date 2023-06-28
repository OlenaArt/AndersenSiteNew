package Steps.Services;

import io.cucumber.java.en.Given;
import org.openqa.selenium.JavascriptExecutor;

import java.time.Duration;

import static Steps.Hooks.driver;

public class MobileCTAPhStepdef {
    JavascriptExecutor js = ((JavascriptExecutor) driver);

    @Given("User navigate to Mobile page in the CTA-block with photo")
    public void userNavigateToMobilePageInTheCTABlockWithPhoto() {
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(200));
        driver.navigate().to("https://dev.andersenlab.com/services/mobile-development");
        js.executeScript("window.scroll(0, 6600)");


    }
}
