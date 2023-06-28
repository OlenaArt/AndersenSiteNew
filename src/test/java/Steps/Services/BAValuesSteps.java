package Steps.Services;

import Variables.UserData;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import static Steps.Hooks.driver;

public class BAValuesSteps {
    JavascriptExecutor js = ((JavascriptExecutor) driver);
    @Given("User navigate to BA page in the Green Values block")
    public void userNavigateToBAPageInTheGreenValuesBlock() {
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(200));
        driver.navigate().to("https://dev.andersenlab.com/services/business-analysts");
        js.executeScript("window.scroll(0, 6000)");
    }

    @And("User click on the Request consultation button in the Green Values block")
    public void userClickOnTheRequestConsultationButtonInTheGreenValuesBlock() throws InterruptedException {
        WebElement Valuesbutton = driver.findElement(By.xpath("//*[@id=\"value-of-specialists\"]/div/aside/div[2]/button"));
        TimeUnit.SECONDS.sleep(2);
        Valuesbutton.click();
    }

    @And("User select Industry in the Green Values block")
    public void userSelectIndustryInTheGreenValuesBlock() {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"value-of-specialists\"]/div[1]/div/div/div[1]/button")));
        WebElement SelectIndustry = driver.findElement(By.xpath("//*[@id=\"value-of-specialists\"]/div[1]/div/div/div[1]/button"));
        SelectIndustry.click();
        WebElement Media = driver.findElement(By.xpath("//*[@id=\"value-of-specialists\"]/div[1]/div/div/div[1]/div[2]/div[4]"));
        Media.click();
    }

    @And("User fills Name field in the Green Values block")
    public void userFillsNameFieldInTheGreenValuesBlock() {
        WebElement UserName = driver.findElement(By.xpath("//*[@id=\"value-of-specialists\"]/div[2]/div[1]/div/label/input"));
        UserName.sendKeys(UserData.USER_NAME);
    }

    @And("User fills Email field in the Green Values block")
    public void userFillsEmailFieldInTheGreenValuesBlock() {
        WebElement Email = driver.findElement(By.xpath("//*[@id=\"value-of-specialists\"]/div[2]/div[2]/div/label/input"));
        Email.sendKeys(UserData.USER_EMAIL);
    }

    @And("User fills Phone field in the Green Values block")
    public void userFillsPhoneFieldInTheGreenValuesBlock() {
        WebElement Phone = driver.findElement(By.xpath("//*[@id=\"value-of-specialists\"]/div[3]/div/div[1]/label/input"));
        Phone.sendKeys(UserData.USER_PHONE);
    }

    @And("User fills Comments field in the Green Values block")
    public void userFillsCommentsFieldInTheGreenValuesBlock() {
        WebElement Description = driver.findElement(By.xpath("//*[@id=\"value-of-specialists\"]/div[3]/div/div[2]/label/textarea"));
        Description.sendKeys(UserData.DESCRIPTION);
    }

    @And("User click on the checkbox in the Green Values block")
    public void userClickOnTheCheckboxInTheGreenValuesBlock() {
        WebElement CheckBox = driver.findElement(By.xpath("//*[@id=\"value-of-specialists\"]/div[4]/div/div[2]"));
        CheckBox.click();
    }

    @And("User Click on the Send button in the Green Values block")
    public void userClickOnTheSendButtonInTheGreenValuesBlock() throws InterruptedException {
        WebElement Send = driver.findElement(By.xpath("//*[@id=\"value-of-specialists\"]/div[4]/div/div[1]/button"));
        Send.click();
        TimeUnit.SECONDS.sleep(2);
    }
}
