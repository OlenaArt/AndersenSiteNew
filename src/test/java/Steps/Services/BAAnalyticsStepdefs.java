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

public class BAAnalyticsStepdefs {
    JavascriptExecutor js = ((JavascriptExecutor) driver);
    @Given("User navigate to BA page in the BA analytics block")
    public void userNavigateToBAPageInTheBAAnalyticsBlock() {
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(200));
        driver.navigate().to("https://dev.andersenlab.com/services/business-analysts");
        js.executeScript("window.scroll(0, 3000)");
    }

    @And("User click on the Request consultation button in the BA analytics block")
    public void userClickOnTheRequestConsultationButtonInTheBAAnalyticsBlock() throws InterruptedException {
        WebElement Button = driver.findElement(By.xpath("//*[@id=\"gatsby-focus-wrapper\"]/main/section[4]/div/aside/div[2]/button"));
        TimeUnit.SECONDS.sleep(2);
        Button.click();
    }

    @And("User select Industry in the BA analytics block")
    public void userSelectIndustryInTheBAAnalyticsBlock() {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"business-analysis-services\"]/div[1]/div/div/div[1]/button")));
        WebElement SelectIndustry = driver.findElement(By.xpath("//*[@id=\"business-analysis-services\"]/div[1]/div/div/div[1]/button"));
        SelectIndustry.click();
        WebElement Healthcare = driver.findElement(By.xpath("//*[@id=\"business-analysis-services\"]/div[1]/div/div/div[1]/div[2]/div[1]"));
        Healthcare.click();
    }

    @And("User fills Name field in the BA analytics block")
    public void userFillsNameFieldInTheBAAnalyticsBlock() {
        WebElement UserName = driver.findElement(By.xpath("//*[@id=\"business-analysis-services\"]/div[2]/div[1]/div/label/input"));
        UserName.sendKeys(UserData.USER_NAME);
    }

    @And("User fills Email field in the BA analytics block")
    public void userFillsEmailFieldInTheBAAnalyticsBlock() {
        WebElement Email = driver.findElement(By.xpath("//*[@id=\"business-analysis-services\"]/div[2]/div[2]/div/label/input"));
        Email.sendKeys(UserData.USER_EMAIL);
    }


    @And("User fills Phone field in the BA analytics block")
    public void userFillsPhoneFieldInTheBAAnalyticsBlock() {
        WebElement Phone = driver.findElement(By.xpath("//*[@id=\"business-analysis-services\"]/div[3]/div/div[1]/label/input"));
        Phone.sendKeys(UserData.USER_PHONE);
    }

    @And("User fills Comments field in the BA analytics block")
    public void userFillsCommentsFieldInTheBAAnalyticsBlock() {
        WebElement Description = driver.findElement(By.xpath("//*[@id=\"business-analysis-services\"]/div[3]/div/div[2]/label/textarea"));
        Description.sendKeys(UserData.DESCRIPTION);
    }

    @And("User click on the checkbox in the BA analytics block")
    public void userClickOnTheCheckboxInTheBAAnalyticsBlock() {
        WebElement CheckBox = driver.findElement(By.xpath("//*[@id=\"business-analysis-services\"]/div[4]/div/div[2]"));
        CheckBox.click();
    }

    @And("User Click on the Send button in the BA analytics block")
    public void userClickOnTheSendButtonInTheBAAnalyticsBlock() throws InterruptedException {
        WebElement Send = driver.findElement(By.xpath("//*[@id=\"business-analysis-services\"]/div[4]/div/div[1]/button"));
        Send.click();
        TimeUnit.SECONDS.sleep(2);
    }

}
