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

public class GeneralFAQSteps {
    @And("User click on the Ask your question button in the FAQ block")
    public void userClickOnTheAskYourQuestionButtonInTheFAQBlock() throws InterruptedException {
        WebElement FAQButton = driver.findElement(By.xpath("//*[@id=\"faq\"]/div/div[2]/button"));
        TimeUnit.SECONDS.sleep(2);
        FAQButton.click();
    }

    @And("User select Industry in the FAQ form")
    public void userSelectIndustryInTheFAQForm() {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"faq-block\"]/div[1]/div/div/div[1]/button")));
        WebElement SelectIndustry = driver.findElement(By.xpath("//*[@id=\"faq-block\"]/div[1]/div/div/div[1]/button"));
        SelectIndustry.click();
        WebElement FinServ = driver.findElement(By.xpath("//*[@id=\"faq-block\"]/div[1]/div/div/div[1]/div[2]/div[2]"));
        FinServ.click();
    }

    @And("User fills Name field in the FAQ form")
    public void userFillsNameFieldInTheFAQForm() {
        WebElement Name = driver.findElement(By.xpath("//*[@id=\"faq-block\"]/div[2]/div[1]/div/label/input"));
        Name.sendKeys(UserData.USER_NAME);
    }

    @And("User fills Email field in the FAQ form")
    public void userFillsEmailFieldInTheFAQForm() {
        WebElement Email = driver.findElement(By.xpath("//*[@id=\"faq-block\"]/div[2]/div[2]/div/label/input"));
        Email.sendKeys(UserData.USER_EMAIL);
    }

    @And("User fills Phone field in the FAQ form")
    public void userFillsPhoneFieldInTheFAQForm() {
        WebElement Phone = driver.findElement(By.xpath("//*[@id=\"faq-block\"]/div[3]/div/div[1]/label/input"));
        Phone.sendKeys(UserData.USER_PHONE);
    }

    @And("User fills Comments field in the FAQ form")
    public void userFillsCommentsFieldInTheFAQForm() {
        WebElement Comments = driver.findElement(By.xpath("//*[@id=\"faq-block\"]/div[3]/div/div[2]/label/textarea"));
        Comments.sendKeys(UserData.DESCRIPTION);
    }

    @And("User click on the checkbox in the FAQ form")
    public void userClickOnTheCheckboxInTheFAQForm() {
        WebElement CheckBox = driver.findElement(By.xpath("//*[@id=\"faq-block\"]/div[4]/div/div[2]/label/div"));
        CheckBox.click();
    }

    @And("User Click on the Send button in the FAQ form")
    public void userClickOnTheSendButtonInTheFAQForm() throws InterruptedException {
        WebElement Send = driver.findElement(By.xpath("//*[@id=\"faq-block\"]/div[4]/div/div[1]/button"));
        Send.click();
        TimeUnit.SECONDS.sleep(2);

    }
}
