package Steps.Industries;

import io.cucumber.java.en.Given;
import org.openqa.selenium.JavascriptExecutor;

import java.time.Duration;

import static Steps.Hooks.driver;

public class FinServContactStepdef {
    JavascriptExecutor js = ((JavascriptExecutor) driver);
    @Given("User navigate to Financial Services page")
    public void userNavigateToFinancialServicesPage() {
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(200));
        driver.navigate().to("https://dev.andersenlab.com/industries/financial-services");
        js.executeScript("window.scroll(0, 13800)");
    }
}
