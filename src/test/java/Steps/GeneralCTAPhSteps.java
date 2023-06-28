package Steps;

import Variables.UserData;
import io.cucumber.java.en.And;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import static Steps.Hooks.driver;

public class GeneralCTAPhSteps {
    @And("User click on the Request consultation button in the CTA-block with photo")
    public void userClickOnTheRequestConsultationButtonInTheCTABlockWithPhoto() throws InterruptedException {
        WebElement CTAPhbutton = driver.findElement(By.xpath("//*[@id=\"cta-with-photo\"]/div/div/button"));
        TimeUnit.SECONDS.sleep(2);
        CTAPhbutton.click();

    }

    @And("User select Industry in the CTA form with photo")
    public void userSelectIndustryInTheCTAFormWithPhoto() {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"cta-block\"]/div[1]/div/div/div[1]/button")));
        WebElement SelectIndustry = driver.findElement(By.xpath("//*[@id=\"cta-block\"]/div[1]/div/div/div[1]/button"));
        SelectIndustry.click();
        WebElement Media = driver.findElement(By.xpath("//*[@id=\"cta-block\"]/div[1]/div/div/div[1]/div[2]/div[4]"));
        Media.click();
    }

    @And("User fills Name field in the CTA form with photo")
    public void userFillsNameFieldInTheCTAFormWithPhoto() {
        WebElement UserName = driver.findElement(By.xpath("//*[@id=\"cta-block\"]/div[2]/div[1]/div/label/input"));
        UserName.sendKeys(UserData.USER_NAME);
    }

    @And("User fills Email field in the CTA form with photo")
    public void userFillsEmailFieldInTheCTAFormWithPhoto() {
        WebElement Email = driver.findElement(By.xpath("//*[@id=\"cta-block\"]/div[2]/div[2]/div/label/input"));
        Email.sendKeys(UserData.USER_EMAIL);
    }

    @And("User fills Phone field in the CTA form with photo")
    public void userFillsPhoneFieldInTheCTAFormWithPhoto() {
        WebElement Phone = driver.findElement(By.xpath("//*[@id=\"cta-block\"]/div[3]/div/div[1]/label/input"));
        Phone.sendKeys(UserData.USER_PHONE);
    }

    @And("User fills Comments field in the CTA form with photo")
    public void userFillsCommentsFieldInTheCTAFormWithPhoto() {
        WebElement Description = driver.findElement(By.xpath("//*[@id=\"cta-block\"]/div[3]/div/div[2]/label/textarea"));
        Description.sendKeys(UserData.DESCRIPTION);
    }

    @And("User click on the checkbox in the CTA form with photo")
    public void userClickOnTheCheckboxInTheCTAFormWithPhoto() {
        WebElement CheckBox = driver.findElement(By.xpath("//*[@id=\"cta-block\"]/div[4]/div/div[2]"));
        CheckBox.click();
    }

    @And("User Click on the Send button in the CTA form with photo")
    public void userClickOnTheSendButtonInTheCTAFormWithPhoto() throws InterruptedException {
        WebElement Send = driver.findElement(By.xpath("//*[@id=\"cta-block\"]/div[4]/div/div[1]/button"));
        Send.click();
        TimeUnit.SECONDS.sleep(2);
    }
}
