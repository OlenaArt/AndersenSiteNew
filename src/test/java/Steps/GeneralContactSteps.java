package Steps;

import Variables.UserData;
import io.cucumber.java.en.And;
import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import static Steps.Hooks.driver;
import static org.junit.Assert.assertEquals;

public class GeneralContactSteps {
    @And("User select Industry")
    public void userSelectIndustry() {
        new WebDriverWait(driver, Duration.ofSeconds(50)).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"get-consultation\"]/div[1]/div/div/div[1]/button ")));
        WebElement SelectIndustry = driver.findElement(By.xpath("//*[@id=\"get-consultation\"]/div[1]/div/div/div[1]/button"));
        SelectIndustry.click();
        WebElement Healthcare = driver.findElement(By.xpath("//*[@id=\"get-consultation\"]/div[1]/div/div/div[1]/div[2]/div[1]"));
        Healthcare.click();

    }

    @And("User fills Name field")
    public void userFillsNameField() {
        WebElement UserName = driver.findElement(By.xpath("//*[@id=\"get-consultation\"]/div[2]/div[1]/div/label/input"));
        UserName.sendKeys(UserData.USER_NAME);
    }

    @And("User fills Email field")
    public void userFillsEmailField() {
        WebElement Email = driver.findElement(By.xpath("//*[@id=\"get-consultation\"]/div[2]/div[2]/div/label/input"));
        Email.sendKeys(UserData.USER_EMAIL);
    }

    @And("User fills Phone field")
    public void userFillsPhoneField() {
        WebElement Phone = driver.findElement(By.xpath("//*[@id=\"get-consultation\"]/div[3]/div/div[1]/label/input"));
        Phone.sendKeys(UserData.USER_PHONE);

    }

    @And("User fills Comments field")
    public void userFillsCommentsField() {
        WebElement Description = driver.findElement(By.xpath("//*[@id=\"get-consultation\"]/div[3]/div/div[2]/label/textarea"));
        Description.sendKeys(UserData.DESCRIPTION);

    }

    @And("User Click on the Send button")
    public void userClickOnTheSendButton() throws InterruptedException {
        WebElement Send = driver.findElement(By.xpath("//*[@id=\"get-consultation\"]/div[5]/div/div[1]/button"));
        Send.click();
        TimeUnit.SECONDS.sleep(2);

    }
    @And("User see A successful message")
    public void userSeeASuccessfulMessage()  {

        String textPresent = driver.findElement(By.xpath("//*[@id=\"modal\"]/div")).getText();
        String textToBePresent = "Thank you for your interest!\n" +
                "\n" +
                "We will contact you shortly.";
        Assert.assertEquals(textPresent, textToBePresent);
        System.out.println("Test pass");



    }
}
